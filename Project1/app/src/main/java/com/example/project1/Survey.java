package com.example.project1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Survey extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_survey);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) ->
        {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RadioGroup islandChoiceGroup = findViewById(R.id.islandChoiceGroup);
        Button submitButton = findViewById(R.id.submitButton);
        EditText foodText = findViewById(R.id.foodText);

        submitButton.setOnClickListener(view ->
        {
            int selectedId = islandChoiceGroup.getCheckedRadioButtonId();
            String foodChoice = foodText.getText().toString().trim(); // Trim to avoid spaces being considered valid

            if (selectedId == -1)
            {
                Toast.makeText(Survey.this, "Please select an island!", Toast.LENGTH_SHORT).show();
                return;
            }

            if (foodChoice.isEmpty())
            {
                Toast.makeText(Survey.this, "Please enter your favorite food!", Toast.LENGTH_SHORT).show();
                return;
            }

            RadioButton choiceSelected = findViewById(selectedId);
            String selectedText = choiceSelected.getText().toString();

            Toast.makeText(Survey.this, "Island: " + selectedText + "\nFood: " + foodChoice, Toast.LENGTH_SHORT).show();
        });
    }
}