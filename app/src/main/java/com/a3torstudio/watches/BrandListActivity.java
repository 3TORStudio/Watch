package com.a3torstudio.watches;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
//test
public class BrandListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = getListView();

        ArrayAdapter <Watch> listAdapter = new ArrayAdapter<Watch>(
                this,
                android.R.layout.simple_list_item_1,
                Watch.watches
        );

        listView.setAdapter(listAdapter);

    }

    @Override
    protected void onListItemClick(ListView listView,
                                   View view,
                                   int position,
                                   long id) {
        Intent intent = new Intent(BrandListActivity.this, WatchActivity.class);
        intent.putExtra(WatchActivity.EXTRA_WATCH, (int) id);
        startActivity(intent);
    }
}
