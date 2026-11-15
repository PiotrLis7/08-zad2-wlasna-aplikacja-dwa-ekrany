
package com.example.zglaszanie_usterki;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SummaryActivity extends AppCompatActivity {

    TextView tvSummary;
    Button btnConfirm, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        tvSummary = findViewById(R.id.tvSummary);
        btnConfirm = findViewById(R.id.btnConfirm);
        btnCancel = findViewById(R.id.btnCancel);

        String category = getIntent().getStringExtra(MainActivity.EXTRA_CATEGORY);
        String description = getIntent().getStringExtra(MainActivity.EXTRA_DESCRIPTION);
        int priority = getIntent().getIntExtra(MainActivity.EXTRA_PRIORITY, 1);

        String summary = "Kategoria: " + category + "\n\n"
                + "Opis: " + description + "\n\n"
                + "Priorytet: " + priority;

        tvSummary.setText(summary);

        btnConfirm.setOnClickListener(v -> {
            Intent result = new Intent();
            setResult(RESULT_OK, result);
            finish();
        });

        btnCancel.setOnClickListener(v -> {
            setResult(RESULT_CANCELED);
            finish();
        });
    }
}
