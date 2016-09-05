package vaycent.volleysharp;

import android.app.Application;

/**
 * Created by Vaycent on 16/9/5.
 */
public class ApplicationContext extends Application {
    public VolleySharp volleySharp;

    @Override
    public void onCreate() {
        super.onCreate();

        volleySharp = new VolleySharp(this);
    }
}
