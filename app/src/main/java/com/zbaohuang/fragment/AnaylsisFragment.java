package com.zbaohuang.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.zbaohuang.activity.DeviceManagerActivity;
import com.zbaohuang.adapter.AnalysisAdapter;
import com.zbaohuang.model.AnalysisModel;
import com.zbaohuang.xyh.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AnaylsisFragment extends Fragment {

    View rootView;
    View headerView;
    ListView listView;
    List<AnalysisModel> analysisModels;

    AnalysisAdapter adapter ;

    public AnaylsisFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_anaylsis, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setHasOptionsMenu(true);
        listView = (ListView)rootView.findViewById(R.id.listview);

        headerView = LayoutInflater.from(getActivity()).inflate(R.layout.header_analysis,null);
        listView.addHeaderView(headerView);

        analysisModels = new ArrayList<AnalysisModel>();
        analysisModels.add(new AnalysisModel());
        analysisModels.add(new AnalysisModel());
        analysisModels.add(new AnalysisModel());
        analysisModels.add(new AnalysisModel());
        analysisModels.add(new AnalysisModel());
        analysisModels.add(new AnalysisModel());
        analysisModels.add(new AnalysisModel());
        analysisModels.add(new AnalysisModel());
        analysisModels.add(new AnalysisModel());
        analysisModels.add(new AnalysisModel());
        analysisModels.add(new AnalysisModel());

        adapter = new AnalysisAdapter(getActivity(),analysisModels);
        listView.setAdapter(adapter);
    }


    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_analysis, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        if (item.getItemId() == R.id.menu_manager){

            Intent intent = new Intent(getActivity(), DeviceManagerActivity.class);
            startActivity(intent);


            return true;
        }



        return super.onOptionsItemSelected(item);
    }
}
