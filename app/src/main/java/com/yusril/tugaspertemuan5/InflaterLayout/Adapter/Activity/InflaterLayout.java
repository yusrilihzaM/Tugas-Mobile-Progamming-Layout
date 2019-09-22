package com.yusril.tugaspertemuan5.InflaterLayout.Adapter.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.yusril.tugaspertemuan5.InflaterLayout.Adapter.Adapter.FilmAdapter;
import com.yusril.tugaspertemuan5.InflaterLayout.Adapter.Model.FilmModel;
import com.yusril.tugaspertemuan5.R;

import java.util.ArrayList;

public class InflaterLayout extends AppCompatActivity {
    private String[] dataName;
    private String[] dataDescription;
    private TypedArray dataPhoto;
    private FilmAdapter adapter;
    private ArrayList<FilmModel> films;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inflater_layout); adapter = new FilmAdapter(this);
        ListView listView = findViewById(R.id.lv_list);
        listView.setAdapter(adapter);

        prepare();
        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(InflaterLayout.this, films.get(i).getName(),Toast.LENGTH_SHORT).show();
                Intent moveWithDataIntent = new Intent(InflaterLayout.this, Detail_Activity.class);
                moveWithDataIntent.putExtra(Detail_Activity.EXTRA_MOVIE, films.get(i));
                startActivity(moveWithDataIntent);
            }
        });
    }
    private void prepare() {
        dataName = getResources().getStringArray(R.array.data_name);
        dataDescription = getResources().getStringArray(R.array.data_description);
        dataPhoto = getResources().obtainTypedArray(R.array.data_photo);
    }
    private void addItem() {
        films = new ArrayList<>();
        for (int i = 0; i < dataName.length; i++) {
            FilmModel film = new FilmModel();
            film.setPhoto(dataPhoto.getResourceId(i, -1));
            film.setName(dataName[i]);
            film.setDescription(dataDescription[i]);
            films.add(film);
        }
        adapter.setFilms(films);
    }
}
