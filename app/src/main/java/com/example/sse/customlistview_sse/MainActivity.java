package com.example.sse.customlistview_sse;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

//Step-By-Step, Setting up the ListView
    RecyclerView recyclerView;
    String s1[],s2[];
    Button button;
    RatingBar ratingBar;
    int episodeImages[] = {R.drawable.st_spocks_brain,
            R.drawable.st_arena__kirk_gorn,
            R.drawable.st_this_side_of_paradise__spock_in_love,
            R.drawable.st_mirror_mirror__evil_spock_and_good_kirk,
            R.drawable.st_platos_stepchildren__kirk_spock,
            R.drawable.st_the_naked_time__sulu_sword,
            R.drawable.st_the_trouble_with_tribbles__kirk_tribbles};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.lvEpisodes);
        s1 = getResources().getStringArray(R.array.episodes);
        s2 = getResources().getStringArray(R.array.episode_descriptions);
        int episodeImages[] = {R.drawable.st_spocks_brain,
                R.drawable.st_arena__kirk_gorn,
                R.drawable.st_this_side_of_paradise__spock_in_love,
                R.drawable.st_mirror_mirror__evil_spock_and_good_kirk,
                R.drawable.st_platos_stepchildren__kirk_spock,
                R.drawable.st_the_naked_time__sulu_sword,
                R.drawable.st_the_trouble_with_tribbles__kirk_tribbles};
        MyAdapter myAdapter = new MyAdapter(this,s1,s2,episodeImages,button,ratingBar);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        return super.onCreateOptionsMenu(menu);   //get rid of default behavior.

        // Inflate the menu; this adds items to the action bar
        getMenuInflater().inflate(R.menu.my_test_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.mnu_zero) {
            Toast.makeText(getBaseContext(), "Menu Zero.", Toast.LENGTH_LONG).show();
            return true;
        }

        if (id == R.id.mnu_one) {
            Toast.makeText(getBaseContext(), "Ring ring, Hi Mom.", Toast.LENGTH_LONG).show();
            return true;
        }

        if (id == R.id.mnu_three) {
             Toast.makeText(getBaseContext(), "Hangup it's a telemarketer.", Toast.LENGTH_LONG).show();
            return true;
        }

            return super.onOptionsItemSelected(item);  //if none of the above are true, do the default and return a boolean.
    }
}

