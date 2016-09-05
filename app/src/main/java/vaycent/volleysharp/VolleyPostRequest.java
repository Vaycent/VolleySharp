package vaycent.volleysharp;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.Map;

/**
 * Created by Vaycent on 16/9/5.
 */
public class VolleyPostRequest {

    private Response.Listener<String> responseListener;
    private Response.ErrorListener errorListener;
    private String link;
    private RequestQueue mQueue;
    private Map<String, String> map;


    public VolleyPostRequest(String link, StringListenerInterface listenerInterface, Map<String, String> map, RequestQueue mQueue) {
        this.link=link;
        this.responseListener=listenerInterface.getResponseListener();
        this.errorListener=listenerInterface.getErrorListener();
        this.mQueue=mQueue;
        this.map=map;

        start();
    }

    public void start(){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, link,
                responseListener, errorListener){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
//                Map<String, String> params = new HashMap<String, String>();
//
//                params=map;
//                System.out.println("params:"+params.get("action")+"");
//                System.out.println("params:"+params.get("period")+"");
//                System.out.println("params:"+params.get("lang")+"");

//                Map<String, String> map = new HashMap<String, String>();
//                map.put("action", "R");
//                map.put("period", "360");
                return map;


//                return params;
            }
        };

        mQueue.add(stringRequest);
    }
}
