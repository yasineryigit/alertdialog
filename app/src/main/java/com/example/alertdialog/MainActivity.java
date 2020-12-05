package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void save(View v){
        AlertDialog.Builder uyari = new AlertDialog.Builder(this);

        uyari.setTitle("Save");
        uyari.setMessage("Emin misin?");
        uyari.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //save
                Toast.makeText(getApplicationContext(),"Saved", Toast.LENGTH_SHORT).show();
            }
        });
        uyari.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"Not Saved",Toast.LENGTH_SHORT).show();
            }
        });
        uyari.show();
    }
}
