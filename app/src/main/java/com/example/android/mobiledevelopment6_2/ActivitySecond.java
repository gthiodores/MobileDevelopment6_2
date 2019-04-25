package com.example.android.mobiledevelopment6_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ActivitySecond extends AppCompatActivity {
    private TextView mTextData1, mTextData2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mTextData1 = findViewById(R.id.text_data1);
        mTextData2 = findViewById(R.id.text_data2);

        if (this.getIntent().getExtras() != null) {
            Bundle bundle = this.getIntent().getExtras();
            mTextData1.setText(bundle.getString("data1"));
            mTextData2.setText(bundle.getString("data2"));
        } else {
            if (this.getIntent().hasExtra("data1") && this.getIntent().hasExtra("data2"))
            {
                mTextData1.setText(this.getIntent().getStringExtra("data1"));
                mTextData2.setText(this.getIntent().getStringExtra("data2"));
            } else
                Toast.makeText(
                        ActivitySecond.this,
                        "Data kosong atau tidak terkirim",
                        Toast.LENGTH_SHORT
                ).show();
        }
    }
}
