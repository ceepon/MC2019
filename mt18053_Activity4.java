package com.example.assign1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mt18053_Activity4 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mt18053_activity_4);
    //intent catch in the final activity
        Intent intent_catchfinal = getIntent();
        String nametext   = intent_catchfinal.getStringExtra(mt18053_Activity3.EXTRA_TEXT);//get  name
        String agetext1 = intent_catchfinal.getStringExtra(mt18053_Activity3.EXTRA_AGE);//get age
        String city   = intent_catchfinal.getStringExtra(mt18053_Activity3.EXTRA_CITY);//get city


        TextView textView1 = (TextView) findViewById(R.id.nameTextview4);//get name id
        TextView textView2 = (TextView) findViewById(R.id.agetext4);//get age id
        TextView textView3 = (TextView) findViewById(R.id.cityTextview4);//get city id

        textView1.setText(nametext);//set name
        textView2.setText(agetext1);//set age
        textView3.setText(city);//set city

        //button on click will call the home play activity throuhg an intent .
        Button button5 = (Button) findViewById(R.id.gotohome);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               playhome();
            }
        });


    }

    //function to go back to home activity //
    public void playhome(){
        Intent intent = new Intent(this, mt18053_MainActivity.class);
        startActivity(intent);
    }
}
