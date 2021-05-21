package com.zbaohuang.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.joanzapata.android.BaseAdapterHelper;
import com.joanzapata.android.QuickAdapter;
import com.zbaohuang.model.CareWarningModel;
import com.zbaohuang.xyh.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CareWarningFragment extends Fragment {

    List<CareWarningModel> careWarningModels;

    QuickAdapter<CareWarningModel> quickAdapter;

    ListView listView;

    View rootView;

    public CareWarningFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_care_warning, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        listView = (ListView)rootView.findViewById(R.id.careWarningListView);

        careWarningModels = new ArrayList<CareWarningModel>();
        careWarningModels.add(new CareWarningModel("","","","","",""));
        careWarningModels.add(new CareWarningModel("","","","","",""));
        careWarningModels.add(new CareWarningModel("","","","","",""));
        careWarningModels.add(new CareWarningModel("","","","","",""));
        careWarningModels.add(new CareWarningModel("","","","","",""));
        careWarningModels.add(new CareWarningModel("","","","","",""));
        careWarningModels.add(new CareWarningModel("","","","","",""));
        careWarningModels.add(new CareWarningModel("","","","","",""));

        quickAdapter = new QuickAdapter<CareWarningModel>(getActivity(),R.layout.item_care_warning) {
            @Override
            protected void convert(BaseAdapterHelper helper, CareWarningModel item) {

            }
        };

        listView.setAdapter(quickAdapter);

        quickAdapter.addAll(careWarningModels);
    }
}
