package com.zbaohuang.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.joanzapata.android.BaseAdapterHelper;
import com.joanzapata.android.QuickAdapter;
import com.zbaohuang.model.HealthFoodModel;
import com.zbaohuang.model.VolunteerModel;
import com.zbaohuang.xyh.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HealthFoodFragment extends Fragment {


    List<HealthFoodModel> foodModels;

    QuickAdapter<HealthFoodModel> quickAdapter;

    ListView listView;

    View rootView;

    public HealthFoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_health_food, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        listView = (ListView)rootView.findViewById(R.id.listview);

        foodModels = new ArrayList<HealthFoodModel>();
        foodModels.add(new HealthFoodModel());
        foodModels.add(new HealthFoodModel());
        foodModels.add(new HealthFoodModel());
        foodModels.add(new HealthFoodModel());
        foodModels.add(new HealthFoodModel());
        foodModels.add(new HealthFoodModel());
        foodModels.add(new HealthFoodModel());
        foodModels.add(new HealthFoodModel());
        foodModels.add(new HealthFoodModel());
        foodModels.add(new HealthFoodModel());

        quickAdapter = new QuickAdapter<HealthFoodModel>(getActivity(),R.layout.item_health_food) {
            @Override
            protected void convert(BaseAdapterHelper helper, HealthFoodModel item) {

            }
        };

        listView.setAdapter(quickAdapter);

        quickAdapter.addAll(foodModels);
    }
}
