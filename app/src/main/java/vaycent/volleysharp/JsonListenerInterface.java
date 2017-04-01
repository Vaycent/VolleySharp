package vaycent.volleysharp;

import android.content.Context;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.json.JSONObject;

/**
 * Created by Vaycent on 16/9/5.
 */
public abstract class JsonListenerInterface {
    public Context context;
    public Response.Listener<JSONObject> responseListener;
    public Response.ErrorListener errorListener;

    public JsonListenerInterface(Context mContext) {//, Response.Listener<JSONObject> mListener, Response.ErrorListener mErrorListener
        this.context = mContext;
//        this.responseListener=mListener;
//        this.errorListener=mErrorListener;
    }


    public abstract void responseAction(String result);
    public abstract void errorAction(VolleyError error);


    public Response.Listener<JSONObject> getResponseListener(){
        responseListener=new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                responseAction(response.toString());
            }
        };
        return responseListener;
    }


    public Response.ErrorListener getErrorListener(){
        errorListener=new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                errorAction(error);
            }
        };
        return errorListener;
    }
}
