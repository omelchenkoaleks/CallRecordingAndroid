package com.omelchenkoaleks.callrecordingandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton startAndOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startAndOff = findViewById(R.id.toggleButton);
    }

    public void toogleButton(View view) {

        boolean checked = ((ToggleButton) view).isChecked();

        if (checked) {

            Intent intent = new Intent(this, RecordingService.class);
            startService(intent);
            Toast.makeText(getApplicationContext(), "Call Recording STARTED", Toast.LENGTH_SHORT).show();

        } else {

            Intent intent = new Intent(this, RecordingService.class);
            stopService(intent);
            Toast.makeText(getApplicationContext(), "Call Recording STOP", Toast.LENGTH_SHORT).show();
        }
    }
}
