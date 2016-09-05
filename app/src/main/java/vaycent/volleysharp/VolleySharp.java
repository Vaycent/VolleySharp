package vaycent.volleysharp;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import java.util.Map;

/**
 * Created by Vaycent on 16/9/5.
 */
public class VolleySharp {

    private RequestQueue mQueue;

    private VolleyGetRequest vGetRequest;
    private VolleyPostRequest vPostRequest;
    private VolleyJsonRequest vJsonRequest;



    VolleySharp(Context context){
        mQueue = Volley.newRequestQueue(context, new OkHttpStack());
        mQueue.start();
    }

    public void startGetRequest(String link,StringListenerInterface listenerInterface){
        vGetRequest=new VolleyGetRequest(link,listenerInterface,mQueue);
    }

    public void startPostRequest(String link, StringListenerInterface listenerInterface, Map<String, String> map){
        vPostRequest=new VolleyPostRequest(link,listenerInterface,map,mQueue);
    }

    public void startJsonRequest(String link,JsonListenerInterface listenerInterface){
        vJsonRequest=new VolleyJsonRequest(link,listenerInterface,mQueue);
    }


}
