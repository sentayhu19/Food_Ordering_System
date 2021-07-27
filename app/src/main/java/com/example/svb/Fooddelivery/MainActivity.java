package com.example.svb.Fooddelivery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button pbutton, Bbutton, pabutton;
    String choice = "";
    Double price = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        pbutton = (Button) findViewById(R.id.pbutton);
        Bbutton = (Button) findViewById(R.id.Bbutton);
        pabutton = (Button) findViewById(R.id.pabutton);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add_to_list(View view) {
        if (view == findViewById(R.id.pbutton)) {
            choice = choice + "pizza" + "\n";
            price = price + 300;
        } else if (view == findViewById(R.id.Bbutton)) {
            choice = choice + "burger" + "\n";
            price = price + 150;
        } else if (view == findViewById(R.id.pabutton)) {
            choice = choice + "pastry" + "\n";
            price = price + 50;
        }
    }
    public void placeOrder(View view){
        Intent i = new Intent(MainActivity.this, orderdetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choice);
        bundle.putDouble("price",price);
        i.putExtras(bundle);
        startActivity(i);
    }
}


