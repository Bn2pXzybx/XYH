package com.zbaohuang.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.marshalchen.ultimaterecyclerview.UltimateRecyclerviewViewHolder;
import com.marshalchen.ultimaterecyclerview.UltimateViewAdapter;
import com.zbaohuang.model.VisitorRecordModel;
import com.zbaohuang.xyh.R;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by zbaohuang on 16/3/26.
 */
public class VisitorRecordAdapter extends UltimateViewAdapter<RecyclerView.ViewHolder> {

    private List<VisitorRecordModel> recordModels;

    public VisitorRecordAdapter(List<VisitorRecordModel> recordModels) {
        this.recordModels = recordModels;
    }

    @Override
    public RecyclerView.ViewHolder getViewHolder(View view) {
        return new UltimateRecyclerviewViewHolder(view);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_visitor_record,viewGroup,false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public int getAdapterItemCount() {
        return recordModels.size();
    }

    @Override
    public long generateHeaderId(int position) {

        if (hasHeaderView()) position--;

        Log.e("generateHeaderId","position ==" + position +" "+recordModels.get(position).getIntDateTime() + "");
        return recordModels.get(position).getIntDateTime();
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public RecyclerView.ViewHolder onCreateHeaderViewHolder(ViewGroup viewGroup) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_visitor_header,viewGroup,false);

        HeaderViewHolder viewHolder = new HeaderViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindHeaderViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        Log.e("onBindHeaderViewHolder","position ==" + position);
    }

    class ViewHolder extends UltimateRecyclerviewViewHolder{

        TextView datetimeTextview;
        ImageView camareImageView;

        public ViewHolder(View itemView) {
            super(itemView);

            datetimeTextview = (TextView)itemView.findViewById(R.id.datetimeTextView);
            camareImageView = (ImageView)itemView.findViewById(R.id.visitorImageView);

        }
    }

    class HeaderViewHolder extends UltimateRecyclerviewViewHolder{

        TextView dateTextView;
        TextView countTextView;
        public HeaderViewHolder(View itemView) {
            super(itemView);
            dateTextView = (TextView)itemView.findViewById(R.id.headerDatetimeTextView);
            countTextView = (TextView)itemView.findViewById(R.id.visitorCountTextView);
        }
    }


}
