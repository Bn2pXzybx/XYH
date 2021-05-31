package com.zbaohuang.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.joanzapata.android.BaseAdapterHelper;
import com.joanzapata.android.QuickAdapter;
import com.zbaohuang.xyh.R;

import java.util.ArrayList;
import java.util.List;

public class VideoManagerActivity extends AppCompatActivity {

    ListView listView;
    List<String> userList;
    QuickAdapter<String> quickAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_manager);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        listView = (ListView)findViewById(R.id.listview);
        userList = new ArrayList<String>();
        userList.add("");
        userList.add("");
        userList.add("");
        userList.add("");
        userList.add("");

        quickAdapter = new QuickAdapter<String>(this,R.layout.item_device_manager) {
            @Override
            protected void convert(BaseAdapterHelper helper, String item) {

            }
        };

        listView.setAdapter(quickAdapter);
        quickAdapter.addAll(userList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(VideoManagerActivity.this,VideoDetailActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_analysis, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home){
            onBackPressed();
            return true;
        } else if(item.getItemId() == R.id.menu_manager){
            Intent intent = new Intent(VideoManagerActivity.this,AddVideoActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

}
