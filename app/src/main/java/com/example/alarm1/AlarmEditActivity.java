package com.example.alarm1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;

public class AlarmEditActivity extends Activity {
    private TimePicker timePicker;
    private EditText memoEditText;
    private EditText medicationEditText;
    private Button saveButton;

    private Alarm alarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_edit);

        timePicker = findViewById(R.id.timePicker);
        memoEditText = findViewById(R.id.memoEditText);
        medicationEditText = findViewById(R.id.medicationEditText);
        saveButton = findViewById(R.id.saveButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour = timePicker.getCurrentHour();
                int minute = timePicker.getCurrentMinute();
                String memo = memoEditText.getText().toString();
                String medication = medicationEditText.getText().toString();

                ArrayList<String> medications = new ArrayList<>();
                medications.add(medication);

                alarm = new Alarm(hour, minute, memo, medications);

                // 알람 저장 후 메시지 표시
                saveAlarm();
            }
        });
    }

    private void saveAlarm() {
        // 알람 저장 로직 추가
        // 알람 데이터를 SharedPreferences 또는 데이터베이스에 저장하는 방식을 선택하여 구현해야 함.

        // 저장 성공 시 메시지 표시
        Toast.makeText(this, "알람이 저장되었습니다.", Toast.LENGTH_SHORT).show();

        // 알람 목록 화면으로 이동
        openAlarmListActivity();
    }

    private void openAlarmListActivity() {
        Intent intent = new Intent(AlarmEditActivity.this, AlarmListActivity.class);
        startActivity(intent);
        finish(); // 알람 생성/편집 화면을 종료
    }
}
