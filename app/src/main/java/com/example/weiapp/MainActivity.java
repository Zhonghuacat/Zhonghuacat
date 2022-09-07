package com.example.weiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.text_view_hello_world);

        String strHello = getResources().getText(R.string.Hello2).toString();

        final int[] i = {1};
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i[0] = i[0] +1;
                if(i[0] %2==0)
                    textView.setText(strHello);
                else
                    textView.setText("Hello World!!!");
            }
        });


    }
}