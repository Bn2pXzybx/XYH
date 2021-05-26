package com.zbaohuang.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zbaohuang.model.AnalysisModel;
import com.zbaohuang.xyh.R;

import java.util.List;

/**
 * Created by zbaohuang on 16/3/29.
 */
public class AnalysisAdapter extends BaseAdapter {

    private Context context;
    private List<AnalysisModel> analysisModels;

    public AnalysisAdapter(Context context, List<AnalysisModel> analysisModels) {
        this.context = context;
        this.analysisModels = analysisModels;
    }

    @Override
    public int getCount() {
        return analysisModels.size();
    }

    @Override
    public Object getItem(int position) {
        return analysisModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        return position % 2 == 0 ?0:1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        int type = getItemViewType(position);
        if (type == 0){

            //左

            convertView = LayoutInflater.from(context).inflate(R.layout.item_analysis_left,parent,false);

        } else {

            //右
            convertView = LayoutInflater.from(context).inflate(R.layout.item_analysis_right,parent,false);
        }


        return convertView;
    }


    class ViewHolder {
        TextView timeTextView;
        ImageView imageView;
        TextView attriTextView;
    }

}
