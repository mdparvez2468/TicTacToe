package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    String b1Value,b2Value,b3Value,b4Value,b5Value,b6Value,b7Value,b8Value,b9Value;

    int flag = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);


    }

    public void click(View view) {

        Button clickButton = (Button) view;

        if (clickButton.getText().toString().equals("")){
            count++;

            if (flag==0){

                clickButton.setText("X");
                flag = 1;

            } else {

                clickButton.setText("O");
                flag = 0;
            }

            if (count>4){

                b1Value = b1.getText().toString();
                b2Value = b2.getText().toString();
                b3Value = b3.getText().toString();
                b4Value = b4.getText().toString();
                b5Value = b5.getText().toString();
                b6Value = b6.getText().toString();
                b7Value = b7.getText().toString();
                b8Value = b8.getText().toString();
                b9Value = b9.getText().toString();

                if (b1Value.equals(b2Value) && b2Value.equals(b3Value) && !b1Value.equals("")){
                    Toast.makeText(this, "Winner: "+b1Value, Toast.LENGTH_SHORT).show();
                    gameRestart();

                } else if (b4Value.equals(b5Value) && b5Value.equals(b6Value) && !b4Value.equals("")){
                    Toast.makeText(this, "Winner: "+b4Value, Toast.LENGTH_SHORT).show();
                    gameRestart();

                } else if (b7Value.equals(b8Value) && b8Value.equals(b9Value) && !b7Value.equals("")){
                    Toast.makeText(this, "Winner: "+b7Value, Toast.LENGTH_SHORT).show();
                    gameRestart();

                } else if (b1Value.equals(b4Value) && b4Value.equals(b7Value) && !b1Value.equals("")){
                    Toast.makeText(this, "Winner: "+b1Value, Toast.LENGTH_SHORT).show();
                    gameRestart();

                } else if (b2Value.equals(b5Value) && b5Value.equals(b8Value) && !b2Value.equals("")){
                    Toast.makeText(this, "Winner: "+b2Value, Toast.LENGTH_SHORT).show();
                    gameRestart();

                } else if (b3Value.equals(b6Value) && b6Value.equals(b9Value) && !b3Value.equals("")){
                    Toast.makeText(this, "Winner: "+b3Value, Toast.LENGTH_SHORT).show();
                    gameRestart();

                } else if (b1Value.equals(b5Value) && b5Value.equals(b9Value) && !b1Value.equals("")){
                    Toast.makeText(this, "Winner: "+b1Value, Toast.LENGTH_SHORT).show();
                    gameRestart();

                } else if (b3Value.equals(b5Value) && b5Value.equals(b7Value) && !b3Value.equals("")){
                    Toast.makeText(this, "Winner: "+b3Value, Toast.LENGTH_SHORT).show();
                    gameRestart();

                } else if (count==9){
                    Toast.makeText(this, "Drawn: ", Toast.LENGTH_SHORT).show();
                    gameRestart();
                }

            }

        }


    }
    public void gameRestart(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");

                count = 0;
                flag = 0;

            }
        },4000);


    }
}