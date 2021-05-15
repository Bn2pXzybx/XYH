package com.zbaohuang.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.joanzapata.android.BaseAdapterHelper;
import com.joanzapata.android.QuickAdapter;
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
    private ListView listView;
    private VisitorRecordAdapter adapter;

    private List<VisitorRecordModel> visitorLists;

    public VisitorRecordFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_visitor_record, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listView = (ListView)rootView.findViewById(R.id.listView);
        visitorLists = new ArrayList<VisitorRecordModel>();
        visitorLists.add(new VisitorRecordModel("2016-03-21 12:20",""));
        visitorLists.add(new VisitorRecordModel("2016-03-21 12:20",""));
        visitorLists.add(new VisitorRecordModel("2016-03-20 12:20",""));
        visitorLists.add(new VisitorRecordModel("2016-03-20 12:20",""));
        visitorLists.add(new VisitorRecordModel("2016-03-20 12:20",""));
        visitorLists.add(new VisitorRecordModel("2016-03-10 12:20",""));
        visitorLists.add(new VisitorRecordModel("2016-03-10 12:20",""));

        adapter = new VisitorRecordAdapter(getActivity(),visitorLists);

        listView.setAdapter(adapter);

    }
}
