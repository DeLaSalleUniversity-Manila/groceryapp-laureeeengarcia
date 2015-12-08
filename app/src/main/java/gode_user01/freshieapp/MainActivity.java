package gode_user01.freshieapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;


public class MainActivity extends Activity {

    String[] main_menu = {
            "Fresh Food",
            "Food Cupboard",
            "Frozen Food",
            "Drinks",
            "Health and Beauty",
            "Household"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, main_menu);
        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        Intent goToFreshFood = new Intent(MainActivity.this, FreshFood.class);
                        startActivity(goToFreshFood);
                        break;

                    case 1:
                        Intent goToFoodCB = new Intent(MainActivity.this, FoodCB.class);
                        startActivity(goToFoodCB);
                        break;

                    case 2:
                        Intent goToFrozenFood = new Intent(MainActivity.this, FrozenFood.class);
                        startActivity(goToFrozenFood);
                        break;

                    case 3:
                        Intent goToDrinks = new Intent(MainActivity.this, Drinks.class);
                        startActivity(goToDrinks);
                        break;

                    case 4:
                        Intent goToHaB = new Intent(MainActivity.this, HaB.class);
                        startActivity(goToHaB);
                        break;

                    case 5:
                        Intent goToHH = new Intent(MainActivity.this, HH.class);
                        startActivity(goToHH);
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
