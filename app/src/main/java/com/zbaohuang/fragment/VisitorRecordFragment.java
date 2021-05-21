package com.zbaohuang.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.joanzapata.android.BaseAdapterHelper;
import com.joanzapata.android.QuickAdapter;
import com.marshalchen.ultimaterecyclerview.UltimateRecyclerView;
import com.marshalchen.ultimaterecyclerview.stickyheadersrecyclerview.StickyRecyclerHeadersDecoration;
import com.zbaohuang.adapter.VisitorRecordAdapter;
import com.zbaohuang.model.VisitorRecordModel;
import com.zbaohuang.xyh.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class VisitorRecordFragment extends Fragment {

    private View rootView;
    private UltimateRecyclerView listView;
    private VisitorRecordAdapter adapter;
    private LinearLayoutManager linearLayoutManager;
    private List<VisitorRecordModel> visitorLists;

    public VisitorRecordFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_visitor_record, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listView = (UltimateRecyclerView)rootView.findViewById(R.id.listView);
        listView.setHasFixedSize(false);
        linearLayoutManager = new LinearLayoutManager(getActivity());
        listView.setLayoutManager(linearLayoutManager);

        visitorLists = new ArrayList<VisitorRecordModel>();
        visitorLists.add(new VisitorRecordModel("2016-03-21 12:20",""));
        visitorLists.add(new VisitorRecordModel("2016-03-21 12:20",""));
        visitorLists.add(new VisitorRecordModel("2016-03-20 12:20",""));
        visitorLists.add(new VisitorRecordModel("2016-03-20 12:20",""));
        visitorLists.add(new VisitorRecordModel("2016-03-20 12:20",""));
        visitorLists.add(new VisitorRecordModel("2016-03-10 12:20",""));
        visitorLists.add(new VisitorRecordModel("2016-03-10 12:20",""));

        adapter = new VisitorRecordAdapter(visitorLists);
        listView.setAdapter(adapter);

        StickyRecyclerHeadersDecoration headersDecoration = new StickyRecyclerHeadersDecoration(adapter);
        listView.addItemDecoration(headersDecoration);

        listView.enableLoadmore();
        listView.setOnLoadMoreListener(new UltimateRecyclerView.OnLoadMoreListener() {
            @Override
            public void loadMore(int i, int i1) {
                listView.reenableLoadmore();
            }
        });



        listView.setDefaultOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                listView.setRefreshing(false);
            }
        });

    }
}
