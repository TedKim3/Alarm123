package com.example.alarm1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AlarmListActivity extends Activity {
    private ListView alarmListView;
    private ArrayAdapter<String> alarmAdapter;
    private ArrayList<String> alarmList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_list);

        alarmListView = findViewById(R.id.alarmListView);

        // 알람 데이터 가져오기 (임시 데이터 예시)
        alarmList = getAlarmData();

        // 알람 어댑터 초기화
        alarmAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alarmList);

        // 알람 어댑터를 ListView에 연결
        alarmListView.setAdapter(alarmAdapter);
    }

    private ArrayList<String> getAlarmData() {
        // 알람 데이터를 가져오는 로직을 구현해야 함
        // SharedPreferences 또는 데이터베이스에서 알람 데이터를 가져와서 ArrayList에 추가하는 방식을 선택하여 구현해야 함.
        // 임시로 예시 데이터를 반환하는 코드
        ArrayList<String> alarms = new ArrayList<>();
        alarms.add("알람 1");
        alarms.add("알람 2");
        alarms.add("알람 3");
        return alarms;
    }
}
