package vaycent.volleysharp;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

/**
 * Created by Vaycent on 16/9/5.
 */
public class VolleyJsonRequest {

    private Response.Listener<JSONObject> responseListener;
    private Response.ErrorListener errorListener;
    private String link;
    private RequestQueue mQueue;


    public VolleyJsonRequest(String link, JsonListenerInterface listenerInterface, RequestQueue mQueue) {
        this.link=link;
        this.responseListener=listenerInterface.responseListener;
        this.errorListener=listenerInterface.errorListener;
        this.mQueue=mQueue;

        start();
    }

    public void start(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(link, null, responseListener, errorListener);
        mQueue.add(jsonObjectRequest);
    }
}
