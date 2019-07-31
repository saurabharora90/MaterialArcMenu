package com.sa90.arcdemo;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.snackbar.Snackbar;
import com.sa90.materialarcmenu.ArcMenu;
import com.sa90.materialarcmenu.StateChangeListener;

public class MainActivity extends AppCompatActivity {

    ArcMenu arcMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        arcMenu = findViewById(R.id.arcMenu);
        arcMenu.setRadius(getResources().getDimension(R.dimen.radius));

        arcMenu.setStateChangeListener(new StateChangeListener() {
            @Override
            public void onMenuOpened() {
                Snackbar.make(arcMenu, "Menu Opened", Snackbar.LENGTH_SHORT).show();

                if(arcMenu.mDrawable instanceof Animatable)
                    ((Animatable) arcMenu.mDrawable).start();
            }

            @Override
            public void onMenuClosed() {
                Snackbar.make(arcMenu, "Menu Closed", Snackbar.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.fab1).setOnClickListener(subMenuClickListener);
        findViewById(R.id.tvNext).setOnClickListener(mNextClickListener);
        findViewById(R.id.tvAnimationDemo).setOnClickListener(mAnimationTimeDemoClickListener);
        findViewById(R.id.tvTopPlacement).setOnClickListener(mTopPlacementClickListener);
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

    private View.OnClickListener mAnimationTimeDemoClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, AnimationTimeActivity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener mTopPlacementClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, TopPlacementSampleActivity.class);
            startActivity(intent);
        }
    };
}
