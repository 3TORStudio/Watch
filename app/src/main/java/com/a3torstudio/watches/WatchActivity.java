package com.a3torstudio.watches;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class WatchActivity extends AppCompatActivity {
    public static final String EXTRA_WATCH = "watchNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch);

        int watchNo = (Integer)getIntent().getExtras().get(EXTRA_WATCH);
        Watch watch = Watch.watches[watchNo];

        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(watch.getSourceId());
        photo.setContentDescription(watch.getBrand());

        TextView brand = (TextView)findViewById(R.id.brand);
        brand.setText(watch.getBrand());

        TextView model = (TextView)findViewById(R.id.model);
        model.setText(watch.getModel());

        TextView usuality = (TextView)findViewById(R.id.usuality);
        usuality.setText(watch.getUsuality());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(watch.getDescription());

    }
}
