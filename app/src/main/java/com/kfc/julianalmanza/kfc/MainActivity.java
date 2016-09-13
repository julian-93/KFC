package com.kfc.julianalmanza.kfc;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView megavariedad,descripcion_megavariedad,bucket7,descripcion_bucket7,megaeconomico,descripcion_megaeconomico,megasinigual;
    TextView descripcion_megasinigual,megafutbolero,descripcion_megafutbolero,mega1,descripcion_mega1,mega2,descripcion_mega2;
    TextView megahot,descripcion_megahot,megapop,descripcion_megapop,usuario_main;
    ImageView imagen_megavariedad,imagen_bucket7,imagen_megaeconomico,imagen_megasinigual,imagen_megafutbolero,imagen_mega1,imagen_mega2;
    ImageView imagen_megahot,imagen_megapop;
    String nombre,contraseña,correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainactivity);
        megavariedad=(TextView) findViewById(R.id.megavariedad);
        //bucket7=(TextView) findViewById(R.id.bucket7);
        descripcion_megavariedad=(TextView) findViewById(R.id.descripcion_megavariedad);
        imagen_megavariedad=(ImageView) findViewById(R.id.imagen_megavariedad);
        bucket7=(TextView) findViewById(R.id.bucket7);
        descripcion_bucket7=(TextView) findViewById(R.id.descripcion_bucket7);
        imagen_bucket7=(ImageView) findViewById(R.id.imagen_bucket7);
        megaeconomico=(TextView) findViewById(R.id.megaeconomico);
        descripcion_megaeconomico=(TextView) findViewById(R.id.descripcion_megaeconomico);
        imagen_megaeconomico=(ImageView) findViewById(R.id.imagen_megaeconomico);
        megasinigual=(TextView) findViewById(R.id.megasinigual);
        descripcion_megasinigual=(TextView) findViewById(R.id.descripcion_megasinigual);
        imagen_megasinigual=(ImageView) findViewById(R.id.imagen_megasinigual);
        megafutbolero=(TextView) findViewById(R.id.megafutbolero);
        descripcion_megafutbolero=(TextView) findViewById(R.id.descripcion_megafutbolero);
        imagen_megafutbolero=(ImageView) findViewById(R.id.imagen_megafutbolero);
        mega1=(TextView) findViewById(R.id.mega1);
        descripcion_mega1=(TextView) findViewById(R.id.descripcion_mega1);
        imagen_mega1=(ImageView) findViewById(R.id.imagen_mega1);
        mega2=(TextView) findViewById(R.id.mega2);
        descripcion_mega2=(TextView) findViewById(R.id.descripcion_mega2);
        imagen_mega2=(ImageView) findViewById(R.id.imagen_mega_2);
        megahot=(TextView) findViewById(R.id.megahot);
        descripcion_megahot=(TextView) findViewById(R.id.descripcion_megahot);
        imagen_megahot=(ImageView) findViewById(R.id.imagen_megahot);
        megapop=(TextView) findViewById(R.id.megapop);
        descripcion_megapop=(TextView) findViewById(R.id.descripcion_megapop);
        imagen_megapop=(ImageView) findViewById(R.id.imagen_megapop);
        usuario_main=(TextView) findViewById(R.id.usuario_main);
        Bundle extra =getIntent().getExtras();
        String texto=getString(R.string.user);
        texto=texto+"\n"+extra.getString("nombre");
        usuario_main.setText(texto);
        nombre=extra.getString("nombre");
        contraseña=extra.getString("contraseña");
        correo=extra.getString("correo");

        megavariedad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(descripcion_megavariedad.getVisibility()==View.GONE){
                    descripcion_megavariedad.setVisibility(View.VISIBLE);
                    imagen_megavariedad.setVisibility(View.VISIBLE);
                    megavariedad.setTextColor(Color.WHITE);
                    megavariedad.setBackgroundColor(getResources().getColor(R.color.brown));
                }else{
                    descripcion_megavariedad.setVisibility(View.GONE);
                    imagen_megavariedad.setVisibility(View.GONE);
                    megavariedad.setTextColor(getResources().getColor(R.color.black));
                    megavariedad.setBackgroundColor(getResources().getColor(R.color.lightgray));
                }
            }
        });
        bucket7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(descripcion_bucket7.getVisibility()==View.GONE){
                    descripcion_bucket7.setVisibility(View.VISIBLE);
                    imagen_bucket7.setVisibility(View.VISIBLE);
                    bucket7.setTextColor(Color.WHITE);
                    bucket7.setBackgroundColor(getResources().getColor(R.color.brown));
                }else{
                    descripcion_bucket7.setVisibility(View.GONE);
                    imagen_bucket7.setVisibility(View.GONE);
                    bucket7.setTextColor(getResources().getColor(R.color.black));
                    bucket7.setBackgroundColor(getResources().getColor(R.color.lightgray));
                }
            }
        });
        megaeconomico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(descripcion_megaeconomico.getVisibility()==View.GONE){
                    descripcion_megaeconomico.setVisibility(View.VISIBLE);
                    imagen_megaeconomico.setVisibility(View.VISIBLE);
                    megaeconomico.setTextColor(Color.WHITE);
                    megaeconomico.setBackgroundColor(getResources().getColor(R.color.brown));
                }else{
                    descripcion_megaeconomico.setVisibility(View.GONE);
                    imagen_megaeconomico.setVisibility(View.GONE);
                    megaeconomico.setTextColor(getResources().getColor(R.color.black));
                    megaeconomico.setBackgroundColor(getResources().getColor(R.color.lightgray));
                }
            }
        });
        megasinigual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(descripcion_megasinigual.getVisibility()==View.GONE){
                    descripcion_megasinigual.setVisibility(View.VISIBLE);
                    imagen_megasinigual.setVisibility(View.VISIBLE);
                    megasinigual.setTextColor(Color.WHITE);
                    megasinigual.setBackgroundColor(getResources().getColor(R.color.brown));
                }else{
                    descripcion_megasinigual.setVisibility(View.GONE);
                    imagen_megasinigual.setVisibility(View.GONE);
                    megasinigual.setTextColor(getResources().getColor(R.color.black));
                    megasinigual.setBackgroundColor(getResources().getColor(R.color.lightgray));
                }
            }
        });
        megafutbolero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(descripcion_megafutbolero.getVisibility()==View.GONE){
                    descripcion_megafutbolero.setVisibility(View.VISIBLE);
                    imagen_megafutbolero.setVisibility(View.VISIBLE);
                    megafutbolero.setTextColor(Color.WHITE);
                    megafutbolero.setBackgroundColor(getResources().getColor(R.color.brown));
                }else{
                    descripcion_megafutbolero.setVisibility(View.GONE);
                    imagen_megafutbolero.setVisibility(View.GONE);
                    megafutbolero.setTextColor(getResources().getColor(R.color.black));
                    megafutbolero.setBackgroundColor(getResources().getColor(R.color.lightgray));
                }
            }
        });
        mega1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(descripcion_mega1.getVisibility()==View.GONE){
                    descripcion_mega1.setVisibility(View.VISIBLE);
                    imagen_mega1.setVisibility(View.VISIBLE);
                    mega1.setTextColor(Color.WHITE);
                    mega1.setBackgroundColor(getResources().getColor(R.color.brown));
                }else{
                    descripcion_mega1.setVisibility(View.GONE);
                    imagen_mega1.setVisibility(View.GONE);
                    mega1.setTextColor(getResources().getColor(R.color.black));
                    mega1.setBackgroundColor(getResources().getColor(R.color.lightgray));
                }
            }
        });
        mega2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(descripcion_mega2.getVisibility()==View.GONE){
                    descripcion_mega2.setVisibility(View.VISIBLE);
                    imagen_mega2.setVisibility(View.VISIBLE);
                    mega2.setTextColor(Color.WHITE);
                    mega2.setBackgroundColor(getResources().getColor(R.color.brown));
                }else{
                    descripcion_mega2.setVisibility(View.GONE);
                    imagen_mega2.setVisibility(View.GONE);
                    mega2.setTextColor(getResources().getColor(R.color.black));
                    mega2.setBackgroundColor(getResources().getColor(R.color.lightgray));
                }
            }
        });
        megahot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(descripcion_megahot.getVisibility()==View.GONE){
                    descripcion_megahot.setVisibility(View.VISIBLE);
                    imagen_megahot.setVisibility(View.VISIBLE);
                    megahot.setTextColor(Color.WHITE);
                    megahot.setBackgroundColor(getResources().getColor(R.color.brown));
                }else{
                    descripcion_megahot.setVisibility(View.GONE);
                    imagen_megahot.setVisibility(View.GONE);
                    megahot.setTextColor(getResources().getColor(R.color.black));
                    megahot.setBackgroundColor(getResources().getColor(R.color.lightgray));
                }
            }
        });
        megapop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(descripcion_megapop.getVisibility()==View.GONE){
                    descripcion_megapop.setVisibility(View.VISIBLE);
                    imagen_megapop.setVisibility(View.VISIBLE);
                    megapop.setTextColor(Color.WHITE);
                    megapop.setBackgroundColor(getResources().getColor(R.color.brown));
                }else{
                    descripcion_megapop.setVisibility(View.GONE);
                    imagen_megapop.setVisibility(View.GONE);
                    megapop.setTextColor(getResources().getColor(R.color.black));
                    megapop.setBackgroundColor(getResources().getColor(R.color.lightgray));
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        switch (id){
            case(R.id.Miperfil):

                Intent intent= new Intent(this,Miperfil.class);
                intent.putExtra("nombre",nombre);
                intent.putExtra("contraseña",contraseña);
                intent.putExtra("correo",correo);
                startActivity(intent);
                break;
            case(R.id.mPrincipal):
                break;

        }

        return super.onOptionsItemSelected(item);
    }

}
