package com.essalud.essalud;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.essalud.essalud.adapter.PictureAdapterRecyclerView;
import com.essalud.essalud.model.Picture;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        showToolBar("",false);
        RecyclerView picturesRecycler = (RecyclerView) findViewById(R.id.pictureRecycler);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        picturesRecycler.setLayoutManager(linearLayoutManager);
        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buildPictures(),R.layout.cardview_picture,this);
        picturesRecycler.setAdapter(pictureAdapterRecyclerView);
    }

    public ArrayList<Picture> buildPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();

        pictures.add(new Picture(R.drawable.essalud,"QUIENES","SOMOS",R.drawable.hospital, R.color.card_linear,R.color.trasparent_cardlinear,R.color.contrastcard_linear));
        pictures.add(new Picture(R.drawable.tratamientos,"AREAS Y","SERVICIOS",R.drawable.tratamiento,R.color.card_areas,R.color.transparent_areasCard,R.color.contrastcard_areas
        ));

        pictures.add(new Picture(R.drawable.doctores,"NUESTRO","EQUIPO",R.drawable.doctor,R.color.card_equipo,R.color.trasnparent_cardequipo,R.color.contrastcard_equipo));

        pictures.add(new Picture(R.drawable.paciente,"PACIENTE","INICIAR SESION",R.drawable.phone,R.color.card_login,R.color.trasnparent_card_login,R.color.contrastcard_login));
        pictures.add(new Picture(R.drawable.local,"NUESTRA","UBUCACION",R.drawable.localizacion,R.color.card_local,R.color.trasnparent_card_local,R.color.contrastcard_local));

        return pictures;
    }
    public void showToolBar(String tittle, boolean upButton){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }
}
