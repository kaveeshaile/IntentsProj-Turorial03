package com.example.intentsproj;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.inputmethodservice.ExtractEditText;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText et1;
    EditText et2;

    String st1,st2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
//Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.activity_custom_toast, (ViewGroup)
                findViewById(R.id.custom_toast_layout));
//Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();






        et1 = findViewById(R.id.editText2);
        et2 = findViewById(R.id.editText3);
        button = findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {


                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                Toast.makeText(getApplicationContext(),"You Just click the button!",Toast.LENGTH_SHORT).show();
                st1=et1.getText().toString();
                st2=et2.getText().toString();
                i.putExtra("value1",st1);
                i.putExtra("value2",st2);

                startActivity(i);
                finish();






            }


        });




           // Context context = getApplicationContext();
           // CharSequence message = "You just clicked the OK button";
           // int duration = Toast.LENGTH_SHORT;
           // Toast toast = Toast.makeText(context, message, duration);
           // toast.show();//
}





}