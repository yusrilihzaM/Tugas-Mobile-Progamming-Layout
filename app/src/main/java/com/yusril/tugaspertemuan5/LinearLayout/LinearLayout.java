package com.yusril.tugaspertemuan5.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yusril.tugaspertemuan5.R;

public class LinearLayout extends AppCompatActivity {
    private Button Btn1,Btn2,Btn3,Btn4,Btn5,Btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        Btn1=findViewById(R.id.Vertical_Linear_Layout);
        Btn2=findViewById(R.id.Horizontal_Linear_Layout);
        Btn3=findViewById(R.id.Vertical_Linear_Layout_Equal_High);
        Btn4=findViewById(R.id.Vertical_Linear_Layout_Leftover_High);
        Btn5=findViewById(R.id.Horizontal_Linear_Layout_Equal_High);
        Btn6=findViewById(R.id.Horizontal__Linear_Layout_Leftover_High);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LinearLayout.this,LinearLayoutVertical.class));
            }
        });
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LinearLayout.this,LinearLayoutHorizontal.class));
            }
        });
        Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LinearLayout.this,LinearLayoutVerticalEqualWeight.class));
            }
        });
        Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LinearLayout.this,LinearLayoutVerticalLeftoverWeight.class));
            }
        });
        Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LinearLayout.this,LinearLayoutHorizontalEqualWeight.class));
            }
        });
        Btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LinearLayout.this,LinearLayoutHorizontalLeftWeight.class));
            }
        });
    }
}
