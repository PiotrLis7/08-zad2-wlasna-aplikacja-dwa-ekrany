
package com.example.zglaszanie_usterki;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SummaryActivity extends AppCompatActivity {

    TextView tvSummary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        tvSummary = findViewById(R.id.tvSummary);

        String category = getIntent().getStringExtra(MainActivity.EXTRA_CATEGORY);
        String description = getIntent().getStringExtra(MainActivity.EXTRA_DESCRIPTION);
        int priority = getIntent().getIntExtra(MainActivity.EXTRA_PRIORITY, 1);

        String summary = "Kategoria: " + category + "\n\n"
                + "Opis: " + description + "\n\n"
                + "Priorytet: " + priority;

        tvSummary.setText(summary);
    }
}
