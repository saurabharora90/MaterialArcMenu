package com.sa90.arcdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.sa90.materialarcmenu.ArcMenu;

public class MainActivity extends AppCompatActivity {

    ArcMenu arcMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        arcMenu = (ArcMenu) findViewById(R.id.arcMenu);

        findViewById(R.id.fab1).setOnClickListener(subMenuClickListener);
        findViewById(R.id.tvNext).setOnClickListener(mNextClickListener);
    }

    private View.OnClickListener subMenuClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            arcMenu.toggleMenu();
        }
    };

    private View.OnClickListener mNextClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, ImageButtonActivity.class);
            startActivity(intent);
        }
    };
}
