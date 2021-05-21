package com.zbaohuang.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.joanzapata.android.BaseAdapterHelper;
import com.joanzapata.android.QuickAdapter;
import com.zbaohuang.fragment.CommentModel;
import com.zbaohuang.xyh.R;

import java.util.ArrayList;
import java.util.List;

public class VolunteerActivity extends AppCompatActivity {

    List<CommentModel> commentModels;
    QuickAdapter<CommentModel> quickAdapter;

    ListView listView;
    View headerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView = (ListView)findViewById(R.id.listview);

        headerView = LayoutInflater.from(this).inflate(R.layout.header_detail_volunteer,null,false);
        listView.addHeaderView(headerView);

        commentModels = new ArrayList<CommentModel>();
        commentModels.add(new CommentModel());
        commentModels.add(new CommentModel());
        commentModels.add(new CommentModel());
        commentModels.add(new CommentModel());
        commentModels.add(new CommentModel());
        commentModels.add(new CommentModel());
        commentModels.add(new CommentModel());

        quickAdapter = new QuickAdapter<CommentModel>(this,R.layout.item_comment) {
            @Override
            protected void convert(BaseAdapterHelper helper, CommentModel item) {

            }
        };
        listView.setAdapter(quickAdapter);
        quickAdapter.addAll(commentModels);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home){
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
