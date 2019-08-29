    package com.example.tgs_pwpbjava2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView mhasil;

    float var1, var2;
    boolean acceretion, reduction, division, multiplication;

    protected float txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mhasil = (TextView) findViewById(R.id.hasil);

        Button angka_0 =(Button) findViewById(R.id.no_0);
        angka_0.setOnClickListener(this);
        Button angka_1 =(Button) findViewById(R.id.no_1);
        angka_1.setOnClickListener(this);
        Button angka_2 =(Button) findViewById(R.id.no_2);
        angka_2.setOnClickListener(this);
        Button angka_3 =(Button) findViewById(R.id.no_3);
        angka_3.setOnClickListener(this);
        Button angka_4 =(Button) findViewById(R.id.no_4);
        angka_4.setOnClickListener(this);
        Button angka_5 =(Button) findViewById(R.id.no_5);
        angka_5.setOnClickListener(this);
        Button angka_6 =(Button) findViewById(R.id.no_6);
        angka_6.setOnClickListener(this);
        Button angka_7 =(Button) findViewById(R.id.no_7);
        angka_7.setOnClickListener(this);
        Button angka_8 =(Button) findViewById(R.id.no_8);
        angka_8.setOnClickListener(this);
        Button angka_9 =(Button) findViewById(R.id.no_9);
        angka_9.setOnClickListener(this);
        Button mtambah =(Button) findViewById(R.id.btn_tambah);
        mtambah.setOnClickListener(this);
        Button mkurang =(Button) findViewById(R.id.btn_kurang);
        mkurang.setOnClickListener(this);
        Button mkali =(Button) findViewById(R.id.btn_kali);
        mkali.setOnClickListener(this);
        Button mbagi =(Button) findViewById(R.id.btn_bagi);
        mbagi.setOnClickListener(this);
        Button mtitik =(Button) findViewById(R.id.titik);
        mtitik.setOnClickListener(this);
        Button mequals =(Button) findViewById(R.id.equals);
        mequals.setOnClickListener(this);
    }

        @Override
        public void onClick(View view) {

        switch (view.getId()){
            case R.id.AC:
                mhasil.setText(null);
                break;
            case R.id.no_0:
                mhasil.setText(mhasil.getText().toString().trim()+"0");
                break;
            case R.id.no_1:
                mhasil.setText(mhasil.getText().toString().trim()+"1");
                break;
            case R.id.no_2:
                mhasil.setText(mhasil.getText().toString().trim()+"2");
                break;
            case R.id.no_3:
                mhasil.setText(mhasil.getText().toString().trim()+"3");
                break;
            case R.id.no_4:
                mhasil.setText(mhasil.getText().toString().trim()+"4");
                break;
            case R.id.no_5:
                mhasil.setText(mhasil.getText().toString().trim()+"5");
                break;
            case R.id.no_6:
                mhasil.setText(mhasil.getText().toString().trim()+"6");
                break;
            case R.id.no_7:
                mhasil.setText(mhasil.getText().toString().trim()+"7");
                break;
            case R.id.no_8:
                mhasil.setText(mhasil.getText().toString().trim()+"8");
                break;
            case R.id.no_9:
                mhasil.setText(mhasil.getText().toString().trim()+"9");
                break;
            case R.id.titik:
                mhasil.setText(mhasil.getText().toString().trim()+".");
                break;

            case R.id.btn_tambah:
                var1 = Float.parseFloat(mhasil.getText().toString().trim()+"");
                acceretion = true;
                mhasil.setText(null);
                break;
            case R.id.btn_kurang:
                var1 = Float.parseFloat(mhasil.getText().toString().trim()+"");
                reduction = true;
                mhasil.setText(null);
                break;
            case R.id.btn_kali:
                var1 = Float.parseFloat(mhasil.getText().toString().trim()+"");
                multiplication = true;
                mhasil.setText(null);
                break;
            case R.id.btn_bagi:
                var1 = Float.parseFloat(mhasil.getText().toString().trim()+"");
                division = true;
                mhasil.setText(null);
                break;

            case R.id.equals:
                var2 = Float.parseFloat(mhasil.getText().toString().trim()+"");
                if (acceretion == true){
                    mhasil.setText(var1 + var2 +"");
                    acceretion = false;
                }
                else if (reduction == true){
                    mhasil.setText(var1 - var2 +"");
                    reduction = false;
                }
                else if (multiplication == true){
                    mhasil.setText(var1 * var2 +"");
                    multiplication = false;
                }
                else if (division == true){
                    mhasil.setText(var1 / var2 +"");
                    division = false;
                }
                break;




        }

        }
    }
