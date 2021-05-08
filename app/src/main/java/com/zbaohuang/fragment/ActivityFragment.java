package com.zbaohuang.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.joanzapata.android.BaseAdapterHelper;
import com.joanzapata.android.QuickAdapter;
import com.zbaohuang.activity.ActivityDetailActivity;
import com.zbaohuang.model.ActivityModel;
import com.zbaohuang.model.WarningModel;
import com.zbaohuang.xyh.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;

public class ActivityFragment extends Fragment {
    ListView listView;
    List<ActivityModel> activityModelList;

    View rootView;
    QuickAdapter<ActivityModel> quickAdapter;

    public ActivityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_activity, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);

        getActivity().setTitle("活动广场（全部）");

        initData();
        listView = ButterKnife.findById(rootView, R.id.listView);

        quickAdapter = new QuickAdapter<ActivityModel>(getActivity(),R.layout.item_activity) {
            @Override
            protected void convert(BaseAdapterHelper helper, ActivityModel item) {
            }
        };
        listView.setAdapter(quickAdapter);
        quickAdapter.addAll(activityModelList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), ActivityDetailActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initData(){
        activityModelList = new ArrayList<ActivityModel>();
        activityModelList.add(new ActivityModel("太极拳","2016-03-30 07:00-09:00"," 每天清晨,春晖社区“慧老驿站”的活动场总是热闹非凡,太极拳队队员们在教练的带领下,练着太极拳、挥着太极剑、舞着太极扇。","深圳市南山区中山公园广场","200m",0));
        activityModelList.add(new ActivityModel("太极拳","2016-03-30 07:00-09:00"," 每天清晨,春晖社区“慧老驿站”的活动场总是热闹非凡,太极拳队队员们在教练的带领下,练着太极拳、挥着太极剑、舞着太极扇。","深圳市南山区中山公园广场","200m",0));
        activityModelList.add(new ActivityModel("太极拳","2016-03-30 07:00-09:00"," 每天清晨,春晖社区“慧老驿站”的活动场总是热闹非凡,太极拳队队员们在教练的带领下,练着太极拳、挥着太极剑、舞着太极扇。","深圳市南山区中山公园广场","200m",0));
        activityModelList.add(new ActivityModel("太极拳","2016-03-30 07:00-09:00"," 每天清晨,春晖社区“慧老驿站”的活动场总是热闹非凡,太极拳队队员们在教练的带领下,练着太极拳、挥着太极剑、舞着太极扇。","深圳市南山区中山公园广场","200m",0));
        activityModelList.add(new ActivityModel("太极拳","2016-03-30 07:00-09:00"," 每天清晨,春晖社区“慧老驿站”的活动场总是热闹非凡,太极拳队队员们在教练的带领下,练着太极拳、挥着太极剑、舞着太极扇。","深圳市南山区中山公园广场","200m",0));
        activityModelList.add(new ActivityModel("太极拳","2016-03-30 07:00-09:00"," 每天清晨,春晖社区“慧老驿站”的活动场总是热闹非凡,太极拳队队员们在教练的带领下,练着太极拳、挥着太极剑、舞着太极扇。","深圳市南山区中山公园广场","200m",0));
        activityModelList.add(new ActivityModel("太极拳","2016-03-30 07:00-09:00"," 每天清晨,春晖社区“慧老驿站”的活动场总是热闹非凡,太极拳队队员们在教练的带领下,练着太极拳、挥着太极剑、舞着太极扇。","深圳市南山区中山公园广场","200m",0));
        activityModelList.add(new ActivityModel("太极拳","2016-03-30 07:00-09:00"," 每天清晨,春晖社区“慧老驿站”的活动场总是热闹非凡,太极拳队队员们在教练的带领下,练着太极拳、挥着太极剑、舞着太极扇。","深圳市南山区中山公园广场","200m",0));
        activityModelList.add(new ActivityModel("太极拳","2016-03-30 07:00-09:00"," 每天清晨,春晖社区“慧老驿站”的活动场总是热闹非凡,太极拳队队员们在教练的带领下,练着太极拳、挥着太极剑、舞着太极扇。","深圳市南山区中山公园广场","200m",0));

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_activity_type,menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case  R.id.menu_type_all:
            {
                getActivity().setTitle("活动广场（全部）");
            }
                break;
            case  R.id.menu_type_sport:
            {
                getActivity().setTitle("活动广场（运动）");
            }
                break;
            case  R.id.menu_type_dance:
            {
                getActivity().setTitle("活动广场（歌舞）");
            }
                break;

            case  R.id.menu_type_healath:
            {
                getActivity().setTitle("活动广场（体检）");
            }
                break;
            case  R.id.menu_type_other:
            {
                getActivity().setTitle("活动广场（休闲）");
            }
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
