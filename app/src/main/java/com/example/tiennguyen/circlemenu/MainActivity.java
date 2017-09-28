package com.example.tiennguyen.circlemenu;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    FloatingActionButton fab_1, fab_2, fab_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // floating menu
        fab_1 = (FloatingActionButton)findViewById(R.id.fab_1);
        fab_2 = (FloatingActionButton)findViewById(R.id.fab_2);
        fab_3 = (FloatingActionButton)findViewById(R.id.fab_3);



//        FilterMenuLayout layout1 = (FilterMenuLayout) findViewById(R.id.filter_menu1);
//        attachMenu1(layout1);
//
//        FilterMenuLayout layout2 = (FilterMenuLayout) findViewById(R.id.filter_menu2);
//        attachMenu2(layout2);

        FilterMenuLayout layout3 = (FilterMenuLayout) findViewById(R.id.filter_menu3);
        attachMenu3(layout3);

//        FilterMenuLayout layout4 = (FilterMenuLayout) findViewById(R.id.filter_menu4);
//        attachMenu4(layout4);
    }
    private FilterMenu attachMenu1(FilterMenuLayout layout){
        return new FilterMenu.Builder(this)
                .addItem(R.drawable.ic_action_clock)
                .addItem(R.drawable.ic_action_clock)
                .addItem(R.drawable.ic_action_info)
                .addItem(R.drawable.ic_action_io)
                .addItem(R.drawable.ic_action_location_2)
                .attach(layout)
                .withListener(listener)
                .build();
    }
//    private FilterMenu attachMenu2(FilterMenuLayout layout){
//        return new FilterMenu.Builder(this)
//                .addItem(R.drawable.ic_action_clock)
//                .addItem(R.drawable.ic_action_clock)
//                .addItem(R.drawable.ic_action_info)
//                .addItem(R.drawable.ic_action_location_2)
//                .attach(layout)
//                .withListener(listener)
//                .build();
//    }
    private FilterMenu attachMenu3(FilterMenuLayout layout){
        return new FilterMenu.Builder(this)
                .addItem(R.drawable.ic_action_clock)
                .addItem(R.drawable.ic_action_clock)
                .addItem(R.drawable.ic_action_location_2)
                .addItem(R.drawable.ic_action_location_2)
                .attach(layout)
                .withListener(listener)
                .build();
    }
//    private FilterMenu attachMenu4(FilterMenuLayout layout){
//        return new FilterMenu.Builder(this)
//                .inflate(R.menu.menu_filter)
//                .attach(layout)
//                .withListener(listener)
//                .build();
//    }



    FilterMenu.OnMenuChangeListener listener = new FilterMenu.OnMenuChangeListener() {

        @Override
        public void onMenuItemClick(View view, int position) {
            Toast.makeText(MainActivity.this, "Touched position " + position, Toast.LENGTH_SHORT).show();
            showFloatingMenu();
        }

        @Override
        public void onMenuCollapse() {

        }


        @Override
        public void onMenuExpand() {

        }
    };

    private void showFloatingMenu(){
        fab_1.show();
        fab_2.show();
        fab_3.show();
    }

    public void closeFloatingMenu(){
        fab_1.hide();
        fab_2.hide();
        fab_3.hide();
    }
}