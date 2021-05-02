package com.zbaohuang.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import com.jakewharton.rxbinding.view.RxView;
import com.joanzapata.android.BaseAdapterHelper;
import com.joanzapata.android.QuickAdapter;
import com.zbaohuang.fragment.ActivityFragment;
import com.zbaohuang.fragment.AnaylsisFragment;
import com.zbaohuang.fragment.CareFragment;
import com.zbaohuang.fragment.EvaluatorFragment;
import com.zbaohuang.fragment.VideoLiveFragment;
import com.zbaohuang.fragment.VisitorRecordFragment;
import com.zbaohuang.fragment.WarningFragment;
import com.zbaohuang.model.DrawerMenuModel;
import com.zbaohuang.xyh.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    private ListView menuListView;
    private List<DrawerMenuModel> menuModelList;
    private QuickAdapter<DrawerMenuModel> quickAdapter;
    private View headerView;
    private View footerView;
    private DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();

    }

    private void initData(){
        menuModelList = new ArrayList<DrawerMenuModel>();

        menuModelList.add(new DrawerMenuModel(1,0,"视频直播", new VideoLiveFragment()));
        menuModelList.add(new DrawerMenuModel(2,0,"访客记录", new VisitorRecordFragment()));
        menuModelList.add(new DrawerMenuModel(3,0,"起居分析", new AnaylsisFragment()));
        menuModelList.add(new DrawerMenuModel(4,0,"异常报警", new WarningFragment()));
        menuModelList.add(new DrawerMenuModel(5,0,"活动广场", new ActivityFragment()));
        menuModelList.add(new DrawerMenuModel(6,0,"嘘寒问暖", new CareFragment()));
        menuModelList.add(new DrawerMenuModel(7,0,"爱心评估", new EvaluatorFragment()));

    }

    private void initView(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        headerView = (View) LayoutInflater.from(this).inflate(R.layout.header_drawer_menu,null,false);
        footerView = (View) LayoutInflater.from(this).inflate(R.layout.footer_drawer_menu,null,false);

        menuListView = (ListView)findViewById(R.id.left_drawer);
        menuListView.addHeaderView(headerView);
        menuListView.addFooterView(footerView);
        quickAdapter = new QuickAdapter<DrawerMenuModel>(this,R.layout.item_drawer_menu) {
            @Override
            protected void convert(BaseAdapterHelper helper, DrawerMenuModel item) {
                helper.setText(R.id.item_menu_tv_name,item.getName());
            }
        };

        menuListView.setAdapter(quickAdapter);
        quickAdapter.addAll(menuModelList);

        menuListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DrawerMenuModel menuModel = menuModelList.get(position - 1);
                Fragment fragment = menuModel.getFragmentName();
                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, fragment).commit();
                // update selected item and title, then close the drawer
                setTitle(menuModel.getName());

                drawer.closeDrawers();
            }
        });

        getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, menuModelList.get(0).getFragmentName()).commit();
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

}
