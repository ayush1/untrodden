package example.com.untrodden.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import example.com.untrodden.R;
import example.com.untrodden.SongDetailActivity;
import example.com.untrodden.model.Results;
import example.com.untrodden.utils.Utility;

/**
 * Created by ayushgarg on 02/08/17.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.SongsViewHolder> {

    ArrayList<Results> results;
    Context context;

    public DataAdapter(ArrayList<Results> results, Context context) {
        this.results = results;
        this.context = context;
    }

    @Override
    public SongsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview, parent, false);
        SongsViewHolder songsViewHolder = new SongsViewHolder(view);
        return songsViewHolder;
    }

    @Override
    public void onBindViewHolder(SongsViewHolder holder, final int position) {
        holder.artist_name.setText(results.get(position).getArtistName());
        holder.track_name.setText(results.get(position).getTrackName());
        holder.genre_name.setText(results.get(position).getPrimaryGenreName());
        holder.tv_time.setText(Utility.convertMilisecondsToMinutes(results.get(position).getTrackTimeMillis()));
        holder.tv_price.setText("$" + String.valueOf(results.get(position).getTrackPrice()));
        Picasso.with(context).load(results.get(position).getArtworkUrl100()).into(holder.iv_artist);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SongDetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("DataModel", results.get(position));
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public class SongsViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.tv_Artist_name) TextView artist_name;
        @BindView(R.id.tv_genre_name) TextView genre_name;
        @BindView(R.id.tv_track_name) TextView track_name;
        @BindView(R.id.tv_time) TextView tv_time;
        @BindView(R.id.tv_price) TextView tv_price;
        @BindView(R.id.iv_artist) ImageView iv_artist;
        @BindView(R.id.rl_card) RelativeLayout rl_card;

        public SongsViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
