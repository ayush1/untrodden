package example.com.untrodden;

import android.content.Context;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import butterknife.BindView;
import butterknife.ButterKnife;
import example.com.untrodden.adapter.DataAdapter;
import example.com.untrodden.model.SongsModel;
import example.com.untrodden.utils.ConstURL;
import example.com.untrodden.utils.Utility;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "";
    private Context context;
    SongsModel songsModel;

    @BindView(R.id.rv) RecyclerView rv;
    @BindView(R.id.tv_no_result) TextView tv_no_result;
    @BindView(R.id.iv_search) ImageView iv_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        context = this;

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        rv.setLayoutManager(linearLayoutManager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search, menu);
        MenuItem searchViewItem = menu.findItem(R.id.action_search);
        final SearchView searchViewAndroidActionBar = (SearchView) MenuItemCompat.getActionView(searchViewItem);
        searchViewAndroidActionBar.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if(Utility.isNetworkConnected(context)) {
                    hitApi(query);
                }else{
                    Toast.makeText(context, getString(R.string.internet_connection), Toast.LENGTH_SHORT).show();
                }
                searchViewAndroidActionBar.clearFocus();
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                tv_no_result.setVisibility(View.GONE);
                if(songsModel != null && songsModel.getResults().size() > 0) {
                    songsModel.getResults().clear();
                    DataAdapter dataAdapter = new DataAdapter(songsModel.getResults(), context);
                    rv.setAdapter(dataAdapter);
                }
                if(newText.length() == 0) {
                    iv_search.setVisibility(View.VISIBLE);
                }
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    private void hitApi(String query) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = ConstURL.API_URL + query;

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                songsModel = gson.fromJson(response, SongsModel.class);

                if(songsModel.getResultCount() > 0) {
                    DataAdapter dataAdapter = new DataAdapter(songsModel.getResults(), context);
                    rv.setAdapter(dataAdapter);
                }else{
                    tv_no_result.setVisibility(View.VISIBLE);
                }
                iv_search.setVisibility(View.GONE);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue.add(stringRequest);
    }
}
