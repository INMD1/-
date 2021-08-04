package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button clean, plus, subtract, divide;
    private View.OnClickListener plusc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //초기화
        clean = (Button) findViewById(R.id.clean);

        //수식
        plus = (Button) findViewById(R.id.plus);
        subtract = (Button) findViewById(R.id.subtract);
        divide = (Button) findViewById(R.id.divide);

        // 아읏풋
        TextView output = (TextView)findViewById(R.id.output);

        //인풋
        EditText  input = (EditText)findViewById(R.id.input1);
        EditText  input2 = (EditText)findViewById(R.id.input2);


        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 정수형으로 가져오기
                int num1 = Integer.parseInt(input.getText().toString());
                int num2 = Integer.parseInt(input2.getText().toString());
                //결과값 출력
                output.setText(Integer.toString(num1 + num2));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 정수형으로 가져오기
                int num1 = Integer.parseInt(input.getText().toString());
                int num2 = Integer.parseInt(input2.getText().toString());
                //결과값 출력
                output.setText(Integer.toString(num1 - num2));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 정수형으로 가져오기
                int num1 = Integer.parseInt(input.getText().toString());
                int num2 = Integer.parseInt(input2.getText().toString());
                //결과값 출력
                output.setText(Integer.toString(num1 / num2));
            }
        });

        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    input.setText("0");
                    input2.setText("0");
                    output.setText("결과값이 여기로 출력이 됨니다.");

            }
        });
    }
}
