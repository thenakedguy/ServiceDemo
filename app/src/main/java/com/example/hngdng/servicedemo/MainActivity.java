package com.example.hngdng.servicedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnOpen;
    private Button btnStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOpen = (Button) findViewById(R.id.btnOpen);
        btnStop = (Button) findViewById(R.id.btnStop);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nono(View v);
            }

            private void nono(View view) {
            int id = view.getId();
            if (id == R.id.btnOpen) {

            }
            else if (id == R.id.btnStop) {

            }
            }
        });
    }
}
