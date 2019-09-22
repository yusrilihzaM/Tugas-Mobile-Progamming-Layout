package com.yusril.tugaspertemuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yusril.tugaspertemuan5.Dialog.Dialog;
import com.yusril.tugaspertemuan5.FrameLayout.FrameLayout;
import com.yusril.tugaspertemuan5.InflaterLayout.Adapter.Activity.InflaterLayout;
import com.yusril.tugaspertemuan5.LinearLayout.LinearLayout;
import com.yusril.tugaspertemuan5.RelativeLayout.Relative_Layout;
import com.yusril.tugaspertemuan5.TableLayout.TableLayout;

public class MainActivity extends AppCompatActivity {
    private Button linearLayout,relativeLayout,frameLayout,tableLayout,LayoutInflater,dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout=findViewById(R.id.Linear_Layout);
        relativeLayout=findViewById(R.id.Relative_Layout);
        frameLayout=findViewById(R.id.FrameLayout);
        tableLayout=findViewById(R.id.tableLayout);
        LayoutInflater=findViewById(R.id.LayoutInflater);
        dialog=findViewById(R.id.Dialog);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LinearLayout.class));
            }
        });
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Relative_Layout.class));
            }
        });
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FrameLayout.class));
            }
        });
        tableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TableLayout.class));
            }
        });
        tableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,TableLayout.class));
            }
        });
        LayoutInflater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, InflaterLayout.class));
            }
        });
        dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Dialog.class));
            }
        });
    }
}
