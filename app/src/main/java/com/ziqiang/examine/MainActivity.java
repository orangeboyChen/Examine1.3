package com.ziqiang.examine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get instance
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);

        //Set onClickListener
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.button1:
                Toast.makeText(MainActivity.this,"Hello world!",Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Intent intent=new Intent()
                        .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK)
                        .setClass(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                break;
        }
    }
}
