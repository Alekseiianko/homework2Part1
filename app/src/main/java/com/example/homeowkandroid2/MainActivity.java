package com.example.homeowkandroid2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private TextView textViewMessage;
    private TextView name;
    private TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.clear);
        textViewMessage = findViewById(R.id.message);
        name = findViewById(R.id.editText);
        email = findViewById(R.id.editText2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = name.getText().toString();
                String text2 = email.getText().toString();
                textViewMessage.setText("Подписка на рассылку успешно оформлена для пользователя " + text1 + " на электронный адрес " + text2 );
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("");
                email.setText("");
                textViewMessage.setText("");
            }
        });

    }
}
