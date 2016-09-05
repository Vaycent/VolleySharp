package vaycent.volleysharp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.android.volley.VolleyError;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private ApplicationContext appContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appContext= ((ApplicationContext) this.getApplication());

//        testGetRequest();

//        testPostRequest();

        testJsonRequest();

    }

    private  void testGetRequest(){
        StringListenerInterface listenerInterface;
        listenerInterface=new StringListenerInterface(this, StringListenerInterface.responseListener, StringListenerInterface.errorListener)
        {
            @Override
            public void responseAction(String response) {
                System.out.println("response:"+response);
            }
            @Override
            public void errorAction(VolleyError error) {
                System.out.println("error:"+error.getMessage());
            }
        };

        String link="https://vaycent.github.io/atom.xml";
        appContext.volleySharp.startGetRequest(link,listenerInterface);


    }


    private  void testPostRequest(){
        StringListenerInterface listenerInterface;
        listenerInterface=new StringListenerInterface(this, StringListenerInterface.responseListener, StringListenerInterface.errorListener)
        {
            @Override
            public void responseAction(String response) {
                System.out.println("response:"+response);
            }
            @Override
            public void errorAction(VolleyError error) {
                System.out.println("error:"+error.getMessage());
            }
        };

        String link="";

        Map<String, String> map = new HashMap<String, String>();
        map.put("action", "R");
        map.put("period", "360");
        map.put("mac", "04:09:9A:F2:58:2B:80");
        map.put("grouptype", "m");


        appContext.volleySharp.startPostRequest(link,listenerInterface,map);


    }


    private void testJsonRequest(){
        JsonListenerInterface listenerInterface;
        listenerInterface=new JsonListenerInterface(this, JsonListenerInterface.responseListener, StringListenerInterface.errorListener)
        {
            @Override
            public void responseAction(String response) {
                System.out.println("response:"+response);

                Gson gson = new Gson();
                Location lc = gson.fromJson(response.toString(), Location.class);

            }
            @Override
            public void errorAction(VolleyError error) {
                System.out.println("error:"+error.getMessage());
            }
        };

        String link="http://gc.ditu.aliyun.com/geocoding?a=%E5%B9%BF%E5%B7%9E%E5%B8%82";
        appContext.volleySharp.startJsonRequest(link,listenerInterface);
    }
}
