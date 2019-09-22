package com.yusril.tugaspertemuan5.Dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.yusril.tugaspertemuan5.R;

public class Dialog extends AppCompatActivity {
    private Button  btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        btn1=findViewById(R.id.one_button_alert);
        btn2=findViewById(R.id.two_button_alert);
        btn3=findViewById(R.id.three_button_alert);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(Dialog.this);
                builder.setTitle("Contoh alert");
                builder.setMessage("Alert depan dengan 1 Action Button");
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.e("Info","OK");
                    }
                });builder.show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(Dialog.this);
                builder.setTitle("Contoh alert");
                builder.setMessage("Alert depan dengan 2 Action Button");
                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.e("Info","NO");
                    }
                });builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.e("Info","YES");
                    }
                });builder.show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder=new AlertDialog.Builder(Dialog.this);
                builder.setTitle("Contoh alert");
                builder.setMessage("Alert depan dengan 3 Action Button");
                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.e("Info","NO");
                    }
                });builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.e("Info","YES");
                    }
                });builder.setNeutralButton("BATAL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.e("Info","BATAL");
                    }
                });builder.show();
            }
        });
    }
}
