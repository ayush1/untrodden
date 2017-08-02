package example.com.untrodden.utils;

import android.content.Context;
import android.net.ConnectivityManager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by ayushgarg on 02/08/17.
 */

public class Utility {

    public static boolean isNetworkConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null;
    }

    public static String removeTimeZone(String releaseDate) {
        String resultDate = "";
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").parse(releaseDate);
            resultDate = new SimpleDateFormat("dd MMM, yyyy").format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultDate;
    }

    public static String convertMilisecondsToMinutes(long trackTimeMillis) {
        return String.format("%02d min, %02d sec",
                TimeUnit.MILLISECONDS.toMinutes(trackTimeMillis),
                TimeUnit.MILLISECONDS.toSeconds(trackTimeMillis) -
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(trackTimeMillis))
        );
    }

}
