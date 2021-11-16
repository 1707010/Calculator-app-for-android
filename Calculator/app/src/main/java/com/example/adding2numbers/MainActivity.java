package com.example.adding2numbers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button,button2,button3,button4,button5,button6;
    private TextView textView,textView2,textView3;
    private EditText   editText,editText2,editText3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
editText=findViewById(R.id.editTextNumber);
editText2=findViewById(R.id.editTextNumber2);
//editText3=findViewById(R.id.editTextTextPersonName);
button=findViewById(R.id.button);
button2=findViewById(R.id.button2);
button3=findViewById(R.id.button3);
button4=findViewById(R.id.button4);
button5=findViewById(R.id.button5);
button6=findViewById(R.id.button6);
textView=findViewById(R.id.textView);
textView2=findViewById(R.id.textView2);
textView3=findViewById(R.id.textView3);



//button 1 (addition)
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
  String  s=editText.getText().toString();
  String s2=editText2.getText().toString();
  if (!TextUtils.isEmpty(s)&&!TextUtils.isEmpty(s2)) {
      double num1 = Double.parseDouble(s);
      double num2 = Double.parseDouble(s2);
      double total = num1 + num2;
      Toast.makeText(getApplicationContext(), "App developed by Rohit nehara", Toast.LENGTH_SHORT).show();
      textView3.setText("sum of both the numbers are " + total);
  }
  else{
      Toast.makeText(getApplicationContext(), "Empty set", Toast.LENGTH_SHORT).show();
  }
    }
});
     //button 2 (Substraction)
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  s=editText.getText().toString();
                String s2=editText2.getText().toString();
                if (!TextUtils.isEmpty(s)&&!TextUtils.isEmpty(s2)){
                    int num1 =Integer.parseInt(s);
                    int num2 = Integer.parseInt(s2);
                    int total=num1 - num2;
                    Toast.makeText(getApplicationContext(), "App developed by Rohit nehara", Toast.LENGTH_SHORT).show();
                    textView3.setText("Diffrence  of both the numbers are "+total);

                }
                else{
                    Toast.makeText(getApplicationContext(), "Empty  set", Toast.LENGTH_SHORT).show();
                }

            }
        });
        //button 3
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  s=editText.getText().toString();
                String s2=editText2.getText().toString();
                if (!TextUtils.isEmpty(s)&&!TextUtils.isEmpty(s2)){
                    int num1 =Integer.parseInt(s);
                    int num2 = Integer.parseInt(s2);
                    int total=num1*num2;
                    Toast.makeText(getApplicationContext(), "App developed by Rohit nehara", Toast.LENGTH_SHORT).show();
                    textView3.setText("Product of both the numbers are "+total);

                }
                else{
                    Toast.makeText(getApplicationContext(), "Empty  set", Toast.LENGTH_SHORT).show();
                }

            }
        });
        //button 4
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  s=editText.getText().toString();
                String s2=editText2.getText().toString();
                if (!TextUtils.isEmpty(s)&&!TextUtils.isEmpty(s2)){
                    int num1 =Integer.parseInt(s);
                    int num2 = Integer.parseInt(s2);
                    double total=(double) (1.0*num1/num2);
                    Toast.makeText(getApplicationContext(), "App developed by Rohit nehara", Toast.LENGTH_SHORT).show();
                    textView3.setText("Ratio  of both the numbers are "+total);

                }
                else{
                    Toast.makeText(getApplicationContext(), "Empty  set", Toast.LENGTH_SHORT).show();
                }

            }
        });

        //button 5
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  s=editText.getText().toString();
                String s2=editText2.getText().toString();
                if (!TextUtils.isEmpty(s)&&!TextUtils.isEmpty(s2)){
                    int num1 =Integer.parseInt(s);
                    int num2 = Integer.parseInt(s2);
                    double total=(double) (1.0*num1/num2)*100;
                    Toast.makeText(getApplicationContext(), "App developed by Rohit nehara", Toast.LENGTH_SHORT).show();
                    textView3.setText("Percentage  of both the numbers are "+total+"%");

                }
                else{
                    Toast.makeText(getApplicationContext(), "Empty  set", Toast.LENGTH_SHORT).show();
                }

            }
        });
        //button 6
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  s=editText.getText().toString();
                String s2=editText2.getText().toString();
                if (!TextUtils.isEmpty(s)&&!TextUtils.isEmpty(s2)){
                    int num1 =Integer.parseInt(s);
                    int num2 = Integer.parseInt(s2);
                    for (int i=1;i<=num2;i++){
                        int total = num1*i;
                        textView3.setText( num1+"X"+i+"="+total);
                    }

                    Toast.makeText(getApplicationContext(), "App developed by Rohit nehara", Toast.LENGTH_SHORT).show();


                }
                else{
                    Toast.makeText(getApplicationContext(), "Empty  set", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}