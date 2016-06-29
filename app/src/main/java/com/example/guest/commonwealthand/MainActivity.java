package com.example.guest.commonwealthand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.skateShop)TextView mSkateShop;
    @Bind(R.id.about) TextView mAbout;
    @Bind(R.id.camps) TextView mCamps;
    @Bind(R.id.contact) TextView mContact;
    @Bind(R.id.events) TextView mEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSkateShop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SkateShopActivity.class);
                startActivity(intent);
            }
        });
        mCamps.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CampsActivity.class);
                startActivity(intent);
            }
        });

    }
}
