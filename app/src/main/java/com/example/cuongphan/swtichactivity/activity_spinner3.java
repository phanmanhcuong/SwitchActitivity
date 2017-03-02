package com.example.cuongphan.swtichactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_spinner3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner3);
    }
    public void switch_to_activity1(View v) {
        Intent newActivity = new Intent(this, Activity_Spinner1.class);
        startActivity(newActivity);
    }
}
