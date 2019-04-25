package com.example.android.mobiledevelopment6_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mButtonBundle, mButtonExtras;
    private EditText mEditData1, mEditData2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditData1 = findViewById(R.id.edit_data1);
        mEditData2 = findViewById(R.id.edit_data2);
    }

    public void sendBundle(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("data1", mEditData1.getText().toString());
        bundle.putString("data2", mEditData2.getText().toString());

        Intent intent = new Intent(MainActivity.this, ActivitySecond.class);
        intent.putExtras(bundle);

        startActivity(intent);
    }

    public void sendExtras(View view) {
        Intent intent = new Intent(MainActivity.this, ActivitySecond.class);
        intent.putExtra("data1", mEditData1.getText().toString());
        intent.putExtra("data2", mEditData2.getText().toString());

        startActivity(intent);
    }
}
