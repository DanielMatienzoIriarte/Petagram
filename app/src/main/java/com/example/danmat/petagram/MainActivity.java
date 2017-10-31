package com.example.danmat.petagram;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addStarIcon();
    }

    protected void addStarIcon() {
        FloatingActionButton myStarIcon = (FloatingActionButton) findViewById(R.id.star_icon);
        myStarIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getBaseContext(), getResources().getString(R.string.icon_text), Toast.LENGTH_SHORT).show();
                Snackbar.make(v, getResources().getString(R.string.icon_text), Snackbar.LENGTH_SHORT)
                        .setAction(getResources().getString(R.string.icon_text), new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Log.i("SNACKBAR", "Click on snackbar");
                            }
                        })
                        .setActionTextColor(getResources().getColor(R.color.colorPrimaryDark))
                        .show();
            }
        });
    }
}
