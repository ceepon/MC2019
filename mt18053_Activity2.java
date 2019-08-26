package com.example.assign1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class mt18053_Activity2 extends Activity {
    public static final String EXTRA_TEXT = "EXTRA_TEXT";
    public static final String EXTRA_AGE = "EXTRA_AGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt18053_activity_2);

        Intent intent_catch_activity2 = getIntent(); //to catch the intent message and execute
        //extras string to catch ie addational message passed from 1st activity
        String name_text = intent_catch_activity2.getStringExtra(mt18053_MainActivity.EXTRA_TEXT);


        //finding the texview feild by id so as to set the name variable
        TextView textView1 = (TextView) findViewById(R.id.nameTextview2);
        textView1.setText(name_text);//set it in the view field

        //hold the button by id and on  click  call the function
        Button button_toast = (Button) findViewById(R.id.displayToast);
        button_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                displayToast();
            }
        });
        //hold the button by id and on  click  call the function
        Button age_button = (Button) findViewById(R.id.ageButton);
        age_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                displayAge();
            }
        });
        //hold the button by id and on  click  call the function
        Button countrybutton = (Button) findViewById(R.id.displayCountry);
        countrybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                displayCountry();
            }
        });

    }

    //function to display toast
    public void displayToast () {
        Toast.makeText(mt18053_Activity2.this, "You are in activity  2 ", Toast.LENGTH_SHORT).show();
    }

    //function to show the age instaneously after clicking the button
    // this shows the state save fuction while changing the orientation

    public void displayAge(){
        EditText editText1 = (EditText) findViewById(R.id.ageEditText2);
        String text1 = editText1.getText().toString();
        TextView textView1 = (TextView) findViewById(R.id.agetextview);


        textView1.setText(text1);
    }

    //this is the intent message function to activity 3
    public void displayCountry(){

        TextView nameview = (TextView) findViewById(R.id.nameTextview2);
        String nametext = nameview.getText().toString();
        EditText age_edit = (EditText)findViewById(R.id.ageEditText2) ;

        int ageint = Integer.parseInt(age_edit.getText().toString());
        Intent activity3_intent = new Intent(this, mt18053_Activity3.class);
        activity3_intent.putExtra(EXTRA_TEXT, nametext);//extra variable of name
        activity3_intent.putExtra(EXTRA_AGE,ageint);//extra variable for age passing to next activity
        startActivity(activity3_intent);
    }


}
