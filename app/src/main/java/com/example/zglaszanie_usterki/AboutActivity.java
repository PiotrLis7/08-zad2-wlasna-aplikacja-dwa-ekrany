
package com.example.zglaszanie_usterki;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("CYKL_ZYCIA", "AboutActivity onCreate");

        setContentView(R.layout.activity_about);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("CYKL_ZYCIA", "AboutActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("CYKL_ZYCIA", "AboutActivity onDestroy");
    }
}
