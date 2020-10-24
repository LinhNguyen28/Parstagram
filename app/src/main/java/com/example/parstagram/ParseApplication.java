package com.example.parstagram;

import android.app.Application;

import com.example.parstagram.data.model.Post;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("t1HPZyNNNrlHR3RD6qpMQMVP0RcMNw01h2rcen87")
                .clientKey("pSvBgVpXPSqBm9ktuSA3ODpaOFTCKz8bmEK896CA")
                .server("https://parseapi.back4app.com")
                .build()
        );


    }
}
