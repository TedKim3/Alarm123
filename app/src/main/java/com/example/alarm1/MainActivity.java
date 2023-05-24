package com.example.alarm1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    private Button addAlarmButton;
    private Button viewAlarmsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addAlarmButton = findViewById(R.id.addAlarmButton);
        viewAlarmsButton = findViewById(R.id.viewAlarmsButton);

        addAlarmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlarmEditActivity();
            }
        });

        viewAlarmsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlarmListActivity();
            }
        });
    }

    private void openAlarmEditActivity() {
        Intent intent = new Intent(MainActivity.this, AlarmEditActivity.class);
        startActivity(intent);
    }

    private void openAlarmListActivity() {
        Intent intent = new Intent(MainActivity.this, AlarmListActivity.class);
        startActivity(intent);
    }
}
