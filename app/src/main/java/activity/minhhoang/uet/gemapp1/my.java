package activity.minhhoang.uet.gemapp1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

/**
 * Created by MINHHOANG-PC on 12/05/2017.
 */

public class my extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if (isNetworkConnected(context)){
            Toast.makeText(context, "có mạng", Toast.LENGTH_LONG).show();
        }else
            Toast.makeText(context, "mat mang", Toast.LENGTH_LONG).show();

    }
    private boolean isNetworkConnected(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null;
    }

}
