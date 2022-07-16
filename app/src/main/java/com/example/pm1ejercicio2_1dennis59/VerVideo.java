package com.example.pm1ejercicio2_1dennis59;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.VideoView;

public class VerVideo extends AppCompatActivity {

    Spinner listVideo;
    VideoView videoViewer;
    Button btnregresar, btnver;
    private String[] lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_video);


        videoViewer = (VideoView) findViewById(R.id.videoView3);
        btnregresar = (Button) findViewById(R.id.btnregresar);
        btnver = (Button) findViewById(R.id.btnver);
        listVideo = (Spinner) findViewById(R.id.Spinner);
        lista=fileList();

        ArrayAdapter<String> adapter=new ArrayAdapter<>( this, android.R.layout.simple_spinner_item,lista);
        listVideo.setAdapter(adapter);

        btnver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verVideo(view);
            }
        });

        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK |Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });
    }
    public void verVideo(View v)
    {
        int pos=listVideo.getSelectedItemPosition();
        videoViewer.setVideoPath(getFilesDir()+"/"+lista[pos]);
        videoViewer.start();
    }
}