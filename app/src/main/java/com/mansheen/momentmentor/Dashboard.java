package com.mansheen.momentmentor;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Dashboard extends AppCompatActivity {

    TextView q1, q2, q3, q4;
    EditText input;
    Button get_help_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);

        input = findViewById(R.id.et_situation);
        get_help_button = findViewById(R.id.get_help_button);
        q1 = findViewById(R.id.q1);
        q2 = findViewById(R.id.q2);
        q3 = findViewById(R.id.q3);
        q4 = findViewById(R.id.q4);

        q1.setOnClickListener(v -> {
            starChat(q1.getText().toString());
        });

        q2.setOnClickListener(v -> {
            starChat(q2.getText().toString());
        });

        q3.setOnClickListener(v -> {
            starChat(q3.getText().toString());
        });

        q4.setOnClickListener(v -> {
            starChat(q4.getText().toString());
        });

        get_help_button.setOnClickListener(v -> {
            starChat(input.getText().toString());
        });

    }

    public void starChat(String query) {
        Intent i = new Intent(this, ChatWindow.class);
        i.putExtra("msg", query);
        startActivity(i);
    }
}