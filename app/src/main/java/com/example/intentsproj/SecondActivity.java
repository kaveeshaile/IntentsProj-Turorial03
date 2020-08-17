package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tv1,tv2,result;

    String st1,st2;
    Button add,sub,div,multi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv1 = findViewById(R.id.textView2);
        tv2 = findViewById(R.id.textView3);
        result=findViewById(R.id.result);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        div = findViewById(R.id.div);
        multi = findViewById(R.id.multi);
        st2 = getIntent().getExtras().getString("value1");
        st1 = getIntent().getExtras().getString("value2");

        tv1.setText(st1);
        tv2.setText(st2);
            //button click
        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(st1);
                int n2=Integer.parseInt(st2);
                Integer add = n1 + n2;
                result.setText(add.toString());


            }


            });

        sub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(st1);
                int n2=Integer.parseInt(st2);
                Integer sub = n1 - n2;
                result.setText(sub.toString());

            }


        });
        multi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(st1);
                int n2=Integer.parseInt(st2);
                Integer multi = n1 * n2;
                result.setText(multi.toString());

            }


        });
        div.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(st1);
                int n2=Integer.parseInt(st2);
                Integer div = n1/n2;
                result.setText(div.toString());

            }


        });





    }
}