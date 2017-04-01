package vaycent.volleysharp;

import android.content.Context;

import com.android.volley.Response;
import com.android.volley.VolleyError;

/**
 * Created by Vaycent on 16/9/5.
 */
public abstract class StringListenerInterface {
    public Context context;
    public Response.Listener<String> responseListener;
    public Response.ErrorListener errorListener;

    public StringListenerInterface(Context mContext, Response.Listener<String> mListener, Response.ErrorListener mErrorListener) {
        this.context = mContext;
        this.responseListener=mListener;
        this.errorListener=mErrorListener;
    }


    public abstract void responseAction(String result);
    public abstract void errorAction(VolleyError error);


    public Response.Listener<String> getResponseListener(){
        responseListener=new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                responseAction(response);
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
