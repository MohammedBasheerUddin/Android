package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void changeCurrency(View view){

        EditText nameEditnumber = (EditText) findViewById(R.id.nameEditnumber);

        String amountInPounds = nameEditnumber.getText().toString();

        double amountInPoundsDouble=Double.parseDouble(amountInPounds);

        double amountInDollarsDouble = amountInPoundsDouble * 0.014 ;

        String amountInDollarsString = Double.toString(amountInDollarsDouble);

        Toast.makeText(this,"$"+amountInDollarsString, Toast.LENGTH_SHORT).show();



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}