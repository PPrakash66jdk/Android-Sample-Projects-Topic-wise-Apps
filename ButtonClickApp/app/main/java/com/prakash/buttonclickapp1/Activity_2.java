package com.prakash.buttonclickapp1;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity_2 extends AppCompatActivity {

    Button b5, b7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(new Vivz_Handler());

        b7 = (Button) findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Log.i("logcheck","Button-7 was clicked...!!!");
                Toast.makeText(getApplication() ,"Button-7 was clicked...!!!",Toast.LENGTH_SHORT).show();

            }
        }   );

    }


    class Vivz_Handler implements View.OnClickListener{

        @Override
        public void onClick(View view) {

            Log.i("logcheck","Button-5 was clicked...!!!");

            Toast.makeText(getApplication() ,"Button-5 was clicked...!!!",Toast.LENGTH_SHORT).show();

        }
    }




}
