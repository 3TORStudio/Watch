package com.a3torstudio.watches;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

//test
public class BrandListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = getListView();

        //odebranie informacji o wciśniętym typie
        String usuality = (String) getIntent().getExtras().get("usuality");

        //utworzenie listy zegarków do wyświetlenia o określonym typie
        List<Watch> chosenWatches = new ArrayList<Watch>();

        for(int i = 0; i<Watch.watches.length;i++){
            if(Watch.watches[i].getUsuality().equals(usuality)){
                chosenWatches.add(Watch.watches[i]);
            }
        }
        //------------------------------------

        ArrayAdapter <String> listAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                chosenWatches //lista zegarkow o okreslonym typie
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
