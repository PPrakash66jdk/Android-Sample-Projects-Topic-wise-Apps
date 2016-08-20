package com.prakash.checkboxtestapp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = (CheckBox)findViewById(R.id.checkBox);
        checkBox.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        CheckBox ch = (CheckBox)view;

        if( ch.isChecked())
        {

            Toast.makeText(MainActivity.this, "You ordered Coffee with Sugar...!!!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(MainActivity.this, "Great ur maintaining Diet...!!!", Toast.LENGTH_SHORT).show();

        }


    }
}
