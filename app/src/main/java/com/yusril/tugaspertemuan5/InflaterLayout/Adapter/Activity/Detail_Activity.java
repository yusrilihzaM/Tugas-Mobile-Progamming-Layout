package com.yusril.tugaspertemuan5.InflaterLayout.Adapter.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.yusril.tugaspertemuan5.InflaterLayout.Adapter.Model.FilmModel;
import com.yusril.tugaspertemuan5.R;

public class Detail_Activity extends AppCompatActivity {
    public static final String EXTRA_MOVIE= "extra_movie";
    ImageView photo;
    TextView diskripsi, textname;
    FilmModel film;
    ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_);
        photo=findViewById(R.id.img_photo);
        diskripsi=findViewById(R.id.deskripsi);
        textname=findViewById(R.id.txt_name);
        film=getIntent().getParcelableExtra(EXTRA_MOVIE);


        textname.setText(film.getName());
        diskripsi.setText(film.getDescription());
        photo.setImageResource(film.getPhoto());
        back=findViewById(R.id.btn_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
