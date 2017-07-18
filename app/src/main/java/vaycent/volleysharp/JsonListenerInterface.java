package vaycent.volleysharp;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.json.JSONObject;

/**
 * Created by Vaycent on 16/9/5.
 */
public abstract class JsonListenerInterface {
    public Response.Listener<JSONObject> responseListener;
    public Response.ErrorListener errorListener;

    public JsonListenerInterface() {//, Response.Listener<JSONObject> mListener, Response.ErrorListener mErrorListener
//        this.responseListener=mListener;
//        this.errorListener=mErrorListener;
    }


    public abstract void responseAction(String result);
    public abstract void errorAction(VolleyError error);

}
