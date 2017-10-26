package com.a3torstudio.watches;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> listView,
                                            View view,
                                            int position,
                                            long id) {
                        if (position == 0){
                            Intent intent = new Intent(StartActivity.this, BrandListActivity.class);
                            startActivity(intent);
                        }
                    }
                };

        ListView listView = (ListView) findViewById(R.id.main_list);
        listView.setOnItemClickListener(itemClickListener);
    }
}
