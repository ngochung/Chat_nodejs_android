package ngochung.app.Applications;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;


import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;

import java.net.URISyntaxException;
import java.util.List;

import ngochung.app.Constants.Constants;
import ngochung.app.Untils.SharedConfig;
import ngochung.app.Untils.SocketioHandling;

/**
 * Created by vnGame on 12/29/16.
 */

public class MyApplication extends Application {
    public static Socket mSocket;
    {
        try {
            mSocket= IO.socket(Constants.URL_SOCKET);
        }catch (URISyntaxException e){

        }
    }
    private static MyApplication mInstance;
    public static String PHONE_KEY_SEARCH_FRIEND="";
    public static Boolean CHECK_SEARCH=false;
    public static MyApplication getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        mSocket.connect();

    }

}
