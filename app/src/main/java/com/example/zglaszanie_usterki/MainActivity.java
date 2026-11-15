
package com.example.zglaszanie_usterki;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spCategory;
    EditText etDescription, etPriority;
    Button btnNext;

    public static final String EXTRA_CATEGORY = "CATEGORY";
    public static final String EXTRA_DESCRIPTION = "DESCRIPTION";
    public static final String EXTRA_PRIORITY = "PRIORITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spCategory = findViewById(R.id.spCategory);
        etDescription = findViewById(R.id.etDescription);
        etPriority = findViewById(R.id.etPriority);
        btnNext = findViewById(R.id.btnNext);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.categories,
                android.R.layout.simple_spinner_item
        );

        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );

        spCategory.setAdapter(adapter);

        btnNext.setOnClickListener(v -> {
            String description = etDescription.getText().toString();
            String priorityText = etPriority.getText().toString();

            if (description.isEmpty()) {
                etDescription.setError("Wpisz opis");
                return;
            }

            if (priorityText.isEmpty()) {
                etPriority.setError("Wpisz priorytet");
                return;
            }

            int priority = Integer.parseInt(priorityText);

            if (priority < 1 || priority > 5) {
                etPriority.setError("Podaj liczbe od 1 do 5");
                return;
            }

            Intent intent = new Intent(MainActivity.this, SummaryActivity.class);

            intent.putExtra(EXTRA_CATEGORY,
                    spCategory.getSelectedItem().toString());

            intent.putExtra(EXTRA_DESCRIPTION, description);
            intent.putExtra(EXTRA_PRIORITY, priority);

            startActivity(intent);
        });
    }
}
