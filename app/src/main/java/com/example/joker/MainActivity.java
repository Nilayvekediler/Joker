package com.example.joker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1;
    ImageView image;
    TextView text;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    private void addListenerOnButton() {
        image= (ImageView) findViewById(R.id.img);
        button1= (Button) findViewById(R.id.btn);
        text= (TextView) findViewById(R.id.txt);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("Hahahaha bu foto benden olsun!");
                image.setImageResource(R.drawable.joker);
            }
        });


    }
}