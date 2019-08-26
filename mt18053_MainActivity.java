package com.example.assign1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class mt18053_MainActivity extends Activity {

    public static final String EXTRA_TEXT = "EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt18053_activity_main);

        //  Internt method getIntent  to catch it from any-activity
        Intent intent = getIntent();


        Button button_gotoa2 = (Button) findViewById(R.id.enterNameButton);
        button_gotoa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAge();  //to call openAge function that will send an intent to open 2nd activity
                displayToast();//used to display a  toast
            }
        });


    }
    //the below method is to display a toast message and show its usage//
    public void displayToast () {
            Toast.makeText(mt18053_MainActivity.this, "Activity 2 started ", Toast.LENGTH_SHORT).show();
}


        //below function is used to send an intent message to open second activity and pass the extra variable
        //through the putExxtra function
        public void openAge(){

            EditText name = (EditText) findViewById(R.id.nameEditText);
            String text_name = name.getText().toString();//storing the value in a string of the name entered
            Intent second_activity_intent = new Intent(this, mt18053_Activity2.class);//sending intent msg
            second_activity_intent.putExtra(EXTRA_TEXT, text_name);//extra variable name
            startActivity(second_activity_intent);//starting the Activity
        }

}
