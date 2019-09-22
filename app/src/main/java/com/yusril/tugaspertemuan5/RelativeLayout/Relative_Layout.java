package com.yusril.tugaspertemuan5.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yusril.tugaspertemuan5.R;

public class Relative_Layout extends AppCompatActivity {
    private Button Btn1,Btn2,Btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative__layout);
        Btn1=findViewById(R.id.Relative_Layout1);
        Btn2=findViewById(R.id.Relative_Layout2);
        Btn3=findViewById(R.id.Relative_Layout_Button);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Relative_Layout.this,RelativeLayout1.class));
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Relative_Layout.this,RelativeLayout2.class));
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Relative_Layout.this,RelativeLayoutButton.class));
            }
        });
    }
}
