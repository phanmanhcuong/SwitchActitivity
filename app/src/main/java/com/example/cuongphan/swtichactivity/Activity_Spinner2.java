package com.example.cuongphan.swtichactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by CuongPhan on 2/28/2017.
 */

public class Activity_Spinner2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner2);
    }
    public void switch_to_activity1(View v){
        Intent newActivity = new Intent(this, Activity_Spinner1.class);
        startActivity(newActivity);
    }
}
