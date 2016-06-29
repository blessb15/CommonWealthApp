package com.example.guest.commonwealthand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CampsActivity extends AppCompatActivity {
    @Bind(R.id.listView) ListView mListView;
    private String[] camps = new String[] {"Summer Skate Camp Session 1 6/20 - 6/23 Sold out! $295",
            "Summer Skate Camp Session 2 6/27 - 6/30 Sold out! $295"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camps);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, camps);
        mListView.setAdapter(adapter);


    }
}
