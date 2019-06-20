package com.example.viewpager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Detail_activity extends AppCompatActivity {

    TextView title, subtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        title = findViewById(R.id.detail_title);
        subtitle = findViewById(R.id.detail_subtitle);

        Intent intent = getIntent();
        String titlestr = intent.getStringExtra("title");
        String subtitlestr = intent.getStringExtra("subtitle");

        title.setText(titlestr);
        subtitle.setText(subtitlestr);

    }
}
