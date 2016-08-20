package com.prakash.buttonclickapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1,button2,button6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button3);
        button1.setOnClickListener(this);

        button2 =(Button) findViewById(R.id.button4);
        button2.setOnClickListener(this);

        button6 =(Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
    }

    public void do_something_on_button_click(View v)
    {
//        Log.i("logcheck","======>>>> Button "+v.getId()+  "was clicked");
//
//        Toast.makeText(this,"Button was clicked",Toast.LENGTH_SHORT).show();

        if(v.getId() == R.id.button1)
        {

        Log.i("logcheck","======>>>> Button1 was clicked");

        Toast.makeText(this,"Button1 was clicked",Toast.LENGTH_SHORT).show();

        }
        else if(v.getId() == R.id.button2)
        {
            Log.i("logcheck","======>>>> Button2 was clicked");

            Toast.makeText(this,"Button2 was clicked",Toast.LENGTH_SHORT).show();

        }

    }


    @Override
    public void onClick(View view)
    {

        if(view.getId() == R.id.button3)
        {
            Log.i("logcheck","Button-3 was clicked...!!!");

            Toast.makeText(this,"Button-3 was clicked...!!!",Toast.LENGTH_SHORT).show();

        }
        else if(view.getId() == R.id.button4 )
        {
            Log.i("logcheck","Button-4 was clicked...!!!");

            Toast.makeText(this,"Button-4 was clicked...!!!",Toast.LENGTH_SHORT).show();

        }

        else if(view.getId() == R.id.button6 )
        {

            Intent intent = new Intent(this, Activity_2.class);
            startActivity(intent);

        }




    }
}
