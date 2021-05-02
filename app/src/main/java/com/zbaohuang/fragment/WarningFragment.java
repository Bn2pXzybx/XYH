package com.zbaohuang.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.joanzapata.android.BaseAdapterHelper;
import com.joanzapata.android.QuickAdapter;
import com.zbaohuang.model.WarningModel;
import com.zbaohuang.xyh.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;

public class WarningFragment extends Fragment {

    ListView listView;
    List<WarningModel> warningModelList;

    View rootView;
    QuickAdapter quickAdapter;

    public WarningFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_warning, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initData();
        listView = ButterKnife.findById(rootView, R.id.listView);

        quickAdapter = new QuickAdapter(getActivity(),R.layout.item_warning) {
            @Override
            protected void convert(BaseAdapterHelper helper, Object item) {

            }
        };
        listView.setAdapter(quickAdapter);
        quickAdapter.addAll(warningModelList);
    }

    private void initData(){
        warningModelList = new ArrayList<WarningModel>();
        warningModelList.add(new WarningModel("红红助手","2016-03-21 21:22","亲爱的黄先生，刚刚系统监测到家中有人摔倒了，请你及时查看并处理，以免意外发生...",""));
        warningModelList.add(new WarningModel("红红助手","2016-03-21 21:22","亲爱的黄先生，刚刚系统监测到家中有人摔倒了，请你及时查看并处理，以免意外发生...",""));
        warningModelList.add(new WarningModel("红红助手","2016-03-21 21:22","亲爱的黄先生，刚刚系统监测到家中有人摔倒了，请你及时查看并处理，以免意外发生...",""));
        warningModelList.add(new WarningModel("红红助手","2016-03-21 21:22","亲爱的黄先生，刚刚系统监测到家中有人摔倒了，请你及时查看并处理，以免意外发生...",""));
        warningModelList.add(new WarningModel("红红助手","2016-03-21 21:22","亲爱的黄先生，刚刚系统监测到家中有人摔倒了，请你及时查看并处理，以免意外发生...",""));
        warningModelList.add(new WarningModel("红红助手","2016-03-21 21:22","亲爱的黄先生，刚刚系统监测到家中有人摔倒了，请你及时查看并处理，以免意外发生...",""));
        warningModelList.add(new WarningModel("红红助手","2016-03-21 21:22","亲爱的黄先生，刚刚系统监测到家中有人摔倒了，请你及时查看并处理，以免意外发生...",""));

    }
}
