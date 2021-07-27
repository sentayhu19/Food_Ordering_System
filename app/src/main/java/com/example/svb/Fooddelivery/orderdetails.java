package com.example.svb.Fooddelivery;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
public class orderdetails extends AppCompatActivity {
    TextView listView, priceView;
    String list_choice;
    Double price_et,price_usd;
    ImageButton button1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderdetails);
        listView =(TextView)findViewById(R.id.listView);
        priceView=(TextView)findViewById(R.id.priceView);
        //Getting passed value from MainActivity
        Bundle bundle = getIntent().getExtras();
        list_choice = bundle.getString("choices");
        price_et = bundle.getDouble("price");
        listView.setText(list_choice);
        price_usd=price_et/44;
        priceView.setText(price_et.toString() + "  Ethiopian birr \n"+ price_usd.toString() + "  USD");


        button1 = (ImageButton) findViewById(R.id.pay);
        button1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           openActivity2();
                                       }


                                   }

        );

    }
    public void openActivity2() {
        Intent intent = new Intent(this, amole.class);
        startActivity(intent);

    }
}