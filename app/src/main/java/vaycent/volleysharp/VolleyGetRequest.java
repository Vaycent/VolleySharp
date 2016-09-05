package vaycent.volleysharp;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

/**
 * Created by Vaycent on 16/9/5.
 */
public class VolleyGetRequest {

    private Response.Listener<String> responseListener;
    private Response.ErrorListener errorListener;
    private String link;
    private RequestQueue mQueue;


    public VolleyGetRequest(String link, StringListenerInterface listenerInterface, RequestQueue mQueue) {
        this.link=link;
        this.responseListener=listenerInterface.getResponseListener();
        this.errorListener=listenerInterface.getErrorListener();
        this.mQueue=mQueue;

        start();
    }

    public void start(){
        StringRequest stringRequest = new StringRequest(Request.Method.GET, link,
                responseListener, errorListener);
        mQueue.add(stringRequest);
    }



}
