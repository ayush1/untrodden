package example.com.untrodden;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import butterknife.BindView;
import butterknife.ButterKnife;
import example.com.untrodden.model.Results;
import example.com.untrodden.utils.Utility;

/**
 * Created by ayushgarg on 02/08/17.
 */

public class SongDetailActivity extends AppCompatActivity {

    @BindView(R.id.iv_artist) ImageView iv_artist;
    @BindView(R.id.tv_name) TextView tv_name;
    @BindView(R.id.tv_artist_name) TextView tv_artist_name;
    @BindView(R.id.tv_genre_name) TextView tv_genre_name;
    @BindView(R.id.tv_date) TextView tv_date;
    @BindView(R.id.tv_price) TextView tv_price;
    @BindView(R.id.tv_time) TextView tv_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_detaills);
        ButterKnife.bind(this);
        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            Results results = (Results) bundle.getSerializable("DataModel");
            tv_name.setText(results.getTrackName());
            tv_artist_name.setText(results.getArtistName());
            tv_genre_name.setText(results.getPrimaryGenreName());
            tv_price.setText("$" + results.getTrackPrice());
            tv_date.setText(Utility.removeTimeZone(results.getReleaseDate()));
            tv_time.setText(Utility.convertMilisecondsToMinutes(results.getTrackTimeMillis()));
            Picasso.with(this).load(results.getArtworkUrl100()).into(iv_artist);
        }
    }
}
