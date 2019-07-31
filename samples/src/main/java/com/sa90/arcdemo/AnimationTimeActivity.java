package com.sa90.arcdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sa90.materialarcmenu.ArcMenu;

public class AnimationTimeActivity extends AppCompatActivity {

    ArcMenu arcMenu;
    Button btnSet;
    EditText etAnimationTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_time);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        arcMenu = (ArcMenu) findViewById(R.id.arcMenu);
        btnSet = (Button) findViewById(R.id.btnSet);
        etAnimationTime = (EditText) findViewById(R.id.etAnimationTime);

        btnSet.setOnClickListener(mSetClickListener);
    }

    private View.OnClickListener mSetClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String time = etAnimationTime.getText().toString();
            if(time.isEmpty() || time.length() == 0)
                return;
            try {
                arcMenu.setAnimationTime(Long.parseLong(time));
            }
            catch (NumberFormatException e) {
                Toast.makeText(AnimationTimeActivity.this, "Keyed in value is not a number", Toast.LENGTH_SHORT).show();
            }
        }
    };

    @Override
    public void onBackPressed() {
        if(arcMenu.isMenuOpened())
            arcMenu.toggleMenu();
        else
            super.onBackPressed();
    }

}
