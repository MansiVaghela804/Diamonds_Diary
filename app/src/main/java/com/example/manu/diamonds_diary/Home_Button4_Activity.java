package com.example.manu.diamonds_diary;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Home_Button4_Activity extends AppCompatActivity {

    ImageView back;
    EditText edt1,edt2,edt3,edt4,edt5,edt6;
    Button btn1,btn2;
    MyDatabaseHelper dbhelper;
    TablePrice[] price = new TablePrice[20];
    String fnote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__button4_);
        back = (ImageView)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home_Button4_Activity.this,HomeActivity.class);
                startActivity(intent);
            }
        });
        dbhelper  = new MyDatabaseHelper(Home_Button4_Activity.this);
        edt1 = (EditText) findViewById(R.id.Edit_Text_1);
        edt2 = (EditText) findViewById(R.id.Edit_Text_2);
        edt3 = (EditText) findViewById(R.id.Edit_Text_3);
        edt4 = (EditText) findViewById(R.id.Edit_Text_4);
        edt5 = (EditText) findViewById(R.id.Edit_Text_5);
        edt6 = (EditText) findViewById(R.id.Edit_Text_6);
        btn1 = (Button) findViewById(R.id.Save);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TablePrice price = new TablePrice();
                price.setPrice1(Integer.valueOf(edt1.getText().toString()));
                price.setPrice2(Integer.valueOf(edt2.getText().toString()));
                price.setPrice3(Integer.valueOf(edt3.getText().toString()));
                price.setPrice4(Integer.valueOf(edt4.getText().toString()));
                price.setPrice5(Integer.valueOf(edt5.getText().toString()));
                price.setPrice6(Integer.valueOf(edt6.getText().toString()));
                Toast.makeText(Home_Button4_Activity.this, "ભાવ સેવ થઈ ગયા", Toast.LENGTH_SHORT).show();
                dbhelper.insertprice(price);
            }
        });
        btn2 = (Button) findViewById(R.id.show);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fnote = "";
                Cursor c = dbhelper.getPrice();
                if(c.isBeforeFirst()){
                    c.moveToFirst();
                }
                do{
                    TablePrice price = new TablePrice();
                    String mprice1 = c.getString(c.getColumnIndex(TablePrice.COLUMN_PRICE_1));
                    String mprice2 = c.getString(c.getColumnIndex(TablePrice.COLUMN_PRICE_2));
                    String mprice3 = c.getString(c.getColumnIndex(TablePrice.COLUMN_PRICE_3));
                    String mprice4 = c.getString(c.getColumnIndex(TablePrice.COLUMN_PRICE_4));
                    String mprice5 = c.getString(c.getColumnIndex(TablePrice.COLUMN_PRICE_5));
                    String mprice6 = c.getString(c.getColumnIndex(TablePrice.COLUMN_PRICE_6));
                    price.setPrice1(Integer.valueOf(mprice1));
                    price.setPrice2(Integer.valueOf(mprice2));
                    price.setPrice3(Integer.valueOf(mprice3));
                    price.setPrice4(Integer.valueOf(mprice4));
                    price.setPrice5(Integer.valueOf(mprice5));
                    price.setPrice6(Integer.valueOf(mprice6));
                    fnote = fnote + price.getPrice1() + "-" + price.getPrice2() + "-" + price.getPrice3()
                    + "-"+ price.getPrice4() + "-" + price.getPrice5() + "-" + price.getPrice4() + " \n";
                    Toast.makeText(Home_Button4_Activity.this, "Show", Toast.LENGTH_SHORT).show();
                }while(c.moveToNext());

                TextView tv = findViewById(R.id.textView);
                tv.setText(fnote);

            }
        });

    }
}
