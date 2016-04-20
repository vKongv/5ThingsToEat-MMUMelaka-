package com.example.vkongv.a5thingstoeatmmumelaka;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Create an array of 5 shops
    Shop[] allShop = new Shop[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initialize all shop's data into views
        for(int i = 0; i< 5; i++){
            allShop[i] = new Shop();
            switch(i){
                case 0:
                    allShop[i].setName("LC Vegetarian Restaurant");
                    allShop[i].setAddress("https://www.google.com.my/maps/place/Lc+Vegetarian/@2.244613,102.2717222,17z/data=!3m1!4b1!4m2!3m1!1s0x31d1eff47e1f865f:0x6e587ba8c244f5fa?hl=en");
                    allShop[i].setType("Chinese");
                    allShop[i].setOperatingHour("10am - 10pm");
                    allShop[i].setDescription("This restaurant offers a wide range and tasty vegetarian food. Their butter fried mushroom is their signature dish.");
                    //Set name for text view
                    TextView tv = (TextView) findViewById(R.id.shop_name_one_text_view);
                    tv.setText(allShop[i].getName());
                    //Set image for image view
                    ImageView iv = (ImageView) findViewById(R.id.shop_image_one);
                    iv.setImageResource(R.drawable.vegetarian);
                    break;
                case 1:
                    allShop[i].setName("Mori Cafe");
                    allShop[i].setAddress("https://www.google.com.my/maps/place/Mori+Cafe/@2.2526387,102.2744087,17z/data=!3m1!4b1!4m2!3m1!1s0x31d1e55e36ca5d9f:0x7410eb92477d66d?hl=en");
                    allShop[i].setType("Western + Asian");
                    allShop[i].setOperatingHour("12pm - 12am");
                    allShop[i].setDescription("This restaurant offers food that mix between Asian and Western cuisine with cheap price. They also offers bubble milk tea that is delicious.");
                    //Set name for text view
                    TextView tv2 = (TextView) findViewById(R.id.shop_name_two_text_view);
                    tv2.setText(allShop[i].getName());
                    //Set image for image view
                    ImageView iv2 = (ImageView) findViewById(R.id.shop_image_two);
                    iv2.setImageResource(R.drawable.western);
                    break;
                case 2:
                    allShop[i].setName("MMU Corner");
                    allShop[i].setAddress("https://www.google.com.my/maps/place/MMU+Corner/@2.2457959,102.272334,17z/data=!3m1!4b1!4m2!3m1!1s0x31d1eff463765749:0xea1648223e9d02c?hl=en");
                    allShop[i].setType("Chinese Food Court");
                    allShop[i].setOperatingHour("5pm - 10pm");
                    allShop[i].setDescription("This is a food court that contains a variety of Chinese food stalls and offer cheap price food that suit the student's needs. Mixed rice stall is the best choice among students.");
                    //Set name for text view
                    TextView tv3 = (TextView) findViewById(R.id.shop_name_three_text_view);
                    tv3.setText(allShop[i].getName());
                    //Set image for image view
                    ImageView iv3 = (ImageView) findViewById(R.id.shop_image_three);
                    iv3.setImageResource(R.drawable.chinese);
                    break;
                case 3:
                    allShop[i].setName("Restaurant Gulf");
                    allShop[i].setAddress("https://www.google.com.my/maps/place/restoran+gulf/@2.255027,102.2746879,18z/data=!4m5!1m2!2m1!1sRestaurant+Gulf!3m1!1s0x31d1e55e00ca830d:0xb5ea62400049bc4a?hl=en");
                    allShop[i].setType("Mamak + Arabian");
                    allShop[i].setOperatingHour("6pm - 6am");
                    allShop[i].setDescription("They offer a great range of local food such as fried rice and also arabian food such as Tandoori Ayam. Their signature dishes are Naan and Tandoori Ayam");
                    //Set name for text view
                    TextView tv4 = (TextView) findViewById(R.id.shop_name_four_text_view);
                    tv4.setText(allShop[i].getName());
                    //Set image for image view
                    ImageView iv4 = (ImageView) findViewById(R.id.shop_image_four);
                    iv4.setImageResource(R.drawable.arabian);
                    break;
                case 4:
                    allShop[i].setName("Windmills");
                    allShop[i].setAddress("https://www.google.com/maps/place/The+Windmill+Station+(TWS+%2302)/@2.253862,102.2751283,17z/data=!3m1!4b1!4m2!3m1!1s0x31d1e5607a9504a9:0x710b8dff98ab4847");
                    allShop[i].setType("Western + Local");
                    allShop[i].setOperatingHour("9am - 11pm");
                    allShop[i].setDescription("This is a high-class western food restaurant (at least for students) that also offer local food menu. They have some set menus which are great for students choice. Their western food quality is great.");
                    //Set name for text view
                    TextView tv5 = (TextView) findViewById(R.id.shop_name_five_text_view);
                    tv5.setText(allShop[i].getName());
                    //Set image for image view
                    ImageView iv5 = (ImageView) findViewById(R.id.shop_image_five);
                    iv5.setImageResource(R.drawable.western);
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * View the shop's details based on user selection
     * @param view is the view that trigger the event
     */
    public void viewShop(View view){
        //Intent for the new activity
        Intent activityTwo = new Intent(getApplicationContext(), Main2Activity.class);

        //Store shop's data based on different shop
        if (view.getId() == R.id.shop_one_linear) {
            activityTwo.putExtra("name", allShop[0].getName());
            activityTwo.putExtra("address", allShop[0].getAddress());
            activityTwo.putExtra("type", allShop[0].getType());
            activityTwo.putExtra("hour", allShop[0].getOperatingHour());
            activityTwo.putExtra("description", allShop[0].getDescription());
            activityTwo.putExtra("image",R.drawable.vegetarian);
        }
        else if (view.getId() == R.id.shop_two_linear){
            activityTwo.putExtra("name", allShop[1].getName());
            activityTwo.putExtra("address", allShop[1].getAddress());
            activityTwo.putExtra("type", allShop[1].getType());
            activityTwo.putExtra("hour", allShop[1].getOperatingHour());
            activityTwo.putExtra("description", allShop[1].getDescription());
            activityTwo.putExtra("image",R.drawable.western);
        }
        else if (view.getId() == R.id.shop_three_linear){
            activityTwo.putExtra("name", allShop[2].getName());
            activityTwo.putExtra("address", allShop[2].getAddress());
            activityTwo.putExtra("type", allShop[2].getType());
            activityTwo.putExtra("hour", allShop[2].getOperatingHour());
            activityTwo.putExtra("description", allShop[2].getDescription());
            activityTwo.putExtra("image",R.drawable.chinese);
        }
        else if (view.getId() == R.id.shop_four_linear){
            activityTwo.putExtra("name", allShop[3].getName());
            activityTwo.putExtra("address", allShop[3].getAddress());
            activityTwo.putExtra("type", allShop[3].getType());
            activityTwo.putExtra("hour", allShop[3].getOperatingHour());
            activityTwo.putExtra("description", allShop[3].getDescription());
            activityTwo.putExtra("image",R.drawable.arabian);
        }
        else if (view.getId() == R.id.shop_five_linear){
            activityTwo.putExtra("name", allShop[4].getName());
            activityTwo.putExtra("address", allShop[4].getAddress());
            activityTwo.putExtra("type", allShop[4].getType());
            activityTwo.putExtra("hour", allShop[4].getOperatingHour());
            activityTwo.putExtra("description", allShop[4].getDescription());
            activityTwo.putExtra("image",R.drawable.western);
        }
        else{
            Log.e("MainActivity", "Error in function viewShop if else statement");
        }

        //Start the new activity
        startActivity(activityTwo);
    }
}
