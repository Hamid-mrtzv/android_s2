package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    Button my_button;
    EditText my_input;
    TextView my_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "On Create", Toast.LENGTH_SHORT).show();

        my_button = findViewById(R.id.button);
        my_text = findViewById(R.id.text);
        my_input = findViewById(R.id.my_input);

        my_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = my_input.getText().toString();
                my_text.setText(str);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "On Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this, "On restart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "On resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "On pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "On stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "On destroy", Toast.LENGTH_SHORT).show();
    }
}