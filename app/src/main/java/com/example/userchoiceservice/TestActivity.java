package com.example.userchoiceservice;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {
    RadioButton recordChoice;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        radioGroup=findViewById(R.id.radioGroup);
    }

    public void startRecording(View view) {
        int selectedChoiceId = radioGroup.getCheckedRadioButtonId();
        String choice = checkChoice(selectedChoiceId);
        Toast.makeText(TestActivity.this,"Started " + choice +  " Recording...", Toast.LENGTH_SHORT).show();
        if(choice!=null){
            //startRecording(choice);    based on choice call to Client OR SCS further
        }
    }

    public void stopRecording(View view) {
        int selectedChoiceId = radioGroup.getCheckedRadioButtonId();
        String choice = checkChoice(selectedChoiceId);
        Toast.makeText(TestActivity.this,"Stopping " + choice +  " Recording...", Toast.LENGTH_SHORT).show();
        if(choice!=null){
            //stopRecording(choice); based on choice call to Client OR SCS further
        }
    }

    public String checkChoice(int selectedChoiceId){
        switch (selectedChoiceId){
            case -1:
                Toast.makeText(TestActivity.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                return "-1";

            case R.id.radioClientRecord:
                return "Client";

            case R.id.radioSCSRecord:
                return "SCS";
        }
        return null;
    }
}