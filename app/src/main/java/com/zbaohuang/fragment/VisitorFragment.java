package com.zbaohuang.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.joanzapata.android.BaseAdapterHelper;
import com.joanzapata.android.QuickAdapter;
import com.zbaohuang.activity.VolunteerActivity;
import com.zbaohuang.model.CareWarningModel;
import com.zbaohuang.model.VolunteerModel;
import com.zbaohuang.xyh.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class VisitorFragment extends Fragment {


    List<VolunteerModel> volunteerModels;

    QuickAdapter<VolunteerModel> quickAdapter;

    ListView listView;

    View rootView;

    public VisitorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_visitor, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        listView = (ListView)rootView.findViewById(R.id.listview);

        volunteerModels = new ArrayList<VolunteerModel>();
        volunteerModels.add(new VolunteerModel());
        volunteerModels.add(new VolunteerModel());
        volunteerModels.add(new VolunteerModel());
        volunteerModels.add(new VolunteerModel());
        volunteerModels.add(new VolunteerModel());
        volunteerModels.add(new VolunteerModel());
        volunteerModels.add(new VolunteerModel());
        volunteerModels.add(new VolunteerModel());
        volunteerModels.add(new VolunteerModel());
        volunteerModels.add(new VolunteerModel());

        quickAdapter = new QuickAdapter<VolunteerModel>(getActivity(),R.layout.item_visitor) {
            @Override
            protected void convert(BaseAdapterHelper helper, VolunteerModel item) {

            }
        };

        listView.setAdapter(quickAdapter);

        quickAdapter.addAll(volunteerModels);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), VolunteerActivity.class);
                startActivity(intent);
            }
        });
    }

}
