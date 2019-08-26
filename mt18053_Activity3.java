package com.example.assign1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class mt18053_Activity3 extends Activity {

    public static final String EXTRA_TEXT = "EXTRA_TEXT";
    public static final String EXTRA_AGE = "EXTRA_AGE";
    public static final String EXTRA_CITY = "EXTRA_CITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt18053_activity_3);

        Intent intent_catch3 = getIntent();
        String nametext   = intent_catch3.getStringExtra(mt18053_Activity2.EXTRA_TEXT);
        int age_text1 = intent_catch3.getIntExtra(mt18053_Activity2.EXTRA_AGE,0);

    // finding the textview ids where the name needs to be printed
        TextView textView1 = (TextView) findViewById(R.id.nameTextview3);
        TextView textView2 = (TextView) findViewById(R.id.ageview3);


    //set the name in the textview filed of name and age
        textView1.setText(nametext);
        textView2.setText(""+age_text1);


        //on click button goto4button it goes to activity 4 and ask to enter city
        Button activity4button = (Button) findViewById(R.id.goto4button);
        activity4button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                displayCity();
            }
        });
    }

    //fuction for the intent to activity 4 wiht extra message of name age and city
    public void displayCity(){

        TextView nameview = (TextView) findViewById(R.id.nameTextview3);//name field capture
        String nametext = nameview.getText().toString();
        EditText cityedit = (EditText)findViewById(R.id.cityEditText) ;//city field captured
        String citytext11 = cityedit.getText().toString();
        TextView age = (TextView)findViewById(R.id.ageview3) ;//age field  capture
        String age11 = age.getText().toString();
        Intent intent = new Intent(this, mt18053_Activity4.class);//intent message to activity 4
        intent.putExtra(EXTRA_TEXT, nametext);
        intent.putExtra(EXTRA_AGE,age11);
        intent.putExtra(EXTRA_CITY,citytext11);
        startActivity(intent);
    }
}
