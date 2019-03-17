package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    EditText firstNumber,secondNumber;
    TextView resultText;
    Button addButton,subButton,mulButton,divButton;
    int fNum, sNum;
    float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber=findViewById(R.id.firstNumber);
        secondNumber=findViewById(R.id.secondNumber);
        resultText=findViewById(R.id.resultText);
        addButton=findViewById(R.id.addButton);
        subButton=findViewById(R.id.subButton);
        mulButton=findViewById(R.id.mulButton);
        divButton=findViewById(R.id.divButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readNumber();
                result=(float)fNum+sNum;
                resultText.setText(getString(R.string.result_value,result));

            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readNumber();
                result=(float)fNum-sNum;
                resultText.setText(getString(R.string.result_value,result));
            }
        });

        mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readNumber();
                result=(float)fNum*sNum;
                resultText.setText(getString(R.string.result_value,result));

            }
        });

        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readNumber();
                result=(float)fNum/sNum;
                resultText.setText(getString(R.string.result_value,result));
            }
        });


    }

    public void readNumber(){
        fNum=Integer.parseInt(firstNumber.getText().toString());
        sNum=Integer.parseInt(secondNumber.getText().toString());
    }


}
