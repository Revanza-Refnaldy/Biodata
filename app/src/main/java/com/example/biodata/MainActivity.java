package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2,et3;
    Button btnl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText) findViewById(R.id.editText1) ;
        et1=(EditText) findViewById(R.id.editText2) ;
        et1=(EditText) findViewById(R.id.editText3) ;
        Button btn1 = (Button) findViewById(R.id.button1);

        btn1.setOnClickListener (new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               et1.setText ("");
               et2.setText ("");
               et3.setText ("");
           }
        });
     }
}