package com.example.whatsappclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("HcFjvbJQFjJ93oMWOprkEl27lBJ2YvtPXyr6utlP")
                // if defined
                .clientKey("wwVWnwobtq7UZPqcdoQn94IW2OD09AgFttdeKBDK")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
