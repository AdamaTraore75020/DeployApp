package com.example.adama.deployapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCenter.start(getApplication(), "ca0ceef6-ae0f-4c87-9314-9b036cdee364", Analytics.class, Crashes.class);

        Analytics.trackEvent("DeployApp works great!");
    }

    public void clickOnButton(View view){
        Intent intent = new Intent(MainActivity.this, Stack2nd.class);
        startActivity(intent);
    }
}
