package com.example.captpicture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view)
    {
        Log.i("info", "Button Pressed ");
        EditText editText = findViewById(R.id.editText2);
        String amountInDollors = editText.getText().toString();
        double d = Double.parseDouble(amountInDollors);
        double r = d * 71.0;
        String amountInRupees = Double.toString(r) ;
        Log.i("info", amountInRupees);
        Toast.makeText(this, "The amount in rupees is: "+ amountInRupees, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
