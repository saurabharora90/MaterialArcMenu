package com.sa90.arcdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.sa90.materialarcmenu.ArcMenu;

public class AnimationTimeActivity extends AppCompatActivity {

    ArcMenu arcMenu;
    Button btnSet;
    EditText etAnimationTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_time);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        arcMenu = findViewById(R.id.arcMenu);
        btnSet = findViewById(R.id.btnSet);
        etAnimationTime = findViewById(R.id.etAnimationTime);

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
