package com.example.vkongv.a5thingstoeatmmumelaka;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String mapUrl = ""; //To store the map url of the shop
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Initialize all views
        TextView nameText = (TextView) findViewById(R.id.shop_name_text_view_2);
        ImageView shopImage = (ImageView) findViewById(R.id.shop_image_2);
        TextView descriptionText = (TextView) findViewById(R.id.shop_description_text_view);
        TextView typeText = (TextView) findViewById(R.id.shop_type_text_view);
        TextView hourText = (TextView) findViewById(R.id.shop_hour_text_view);

        //Retrieve intent data from previous activity
        Intent i = getIntent();
        String name = i.getStringExtra("name");
        String description = i.getStringExtra("description");
        String type = i.getStringExtra("type");
        mapUrl = i.getStringExtra("address");
        String hour = i.getStringExtra("hour");
        int imageId = i.getIntExtra("image",0);

        //Set data to the views
        nameText.setText(name);
        descriptionText.setText(description);
        typeText.setText("Type: " + type);
        hourText.setText("Operation Hour: " + hour);
        shopImage.setImageResource(imageId);
    }

    /**
     * Use Google Map to show the location of the shop
     * @param view is the view that trigger the event
     */
    public void openGoogleMaps(View view){
        Intent navigation = new Intent (Intent.ACTION_VIEW, Uri.parse(mapUrl)); //Need to change to map uri from users
        startActivity(navigation);
    }
}
