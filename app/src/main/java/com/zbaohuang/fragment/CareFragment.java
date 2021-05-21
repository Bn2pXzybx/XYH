package com.zbaohuang.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import com.zbaohuang.adapter.CarePageAdapter;
import com.zbaohuang.xyh.R;

import java.util.ArrayList;
import java.util.List;

import info.hoang8f.android.segmented.SegmentedGroup;

public class CareFragment extends Fragment {

    View rootView;
    SegmentedGroup segmented;
    CareWarningFragment warningFragment;
    VisitorFragment visitorFragment;
    HealthFoodFragment foodFragment;

    List<Fragment> fragments;

    ViewPager viewPager;

    CarePageAdapter adapter;

    public CareFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_care, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        segmented = (SegmentedGroup)getActivity().findViewById(R.id.segmented);

        segmented.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {



                if (checkedId == R.id.button21){

                    viewPager.setCurrentItem(0,true);

                } else if(checkedId == R.id.button22){

                    viewPager.setCurrentItem(1,true);
                } else if(checkedId == R.id.button33){
                    viewPager.setCurrentItem(2,true);
                }
            }
        });

        viewPager = (ViewPager)getActivity().findViewById(R.id.view_pager);

        fragments = new ArrayList<Fragment>();
        fragments.add(new CareWarningFragment());
        fragments.add(new VisitorFragment());
        fragments.add(new HealthFoodFragment());

        adapter = new CarePageAdapter(getFragmentManager(),fragments);
        viewPager.setAdapter(adapter);

    }
}
