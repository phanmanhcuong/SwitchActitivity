package com.example.cuongphan.swtichactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Spinner1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__spinner1);
    }
    public void switch_to_activity2(View v) {
        Intent newActivity = new Intent(this, activity_spinner3.class);
        startActivity(newActivity);
    }
}
