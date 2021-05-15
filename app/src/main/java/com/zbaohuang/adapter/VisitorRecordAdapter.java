package com.zbaohuang.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zbaohuang.model.VisitorRecordModel;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by zbaohuang on 16/3/26.
 */
public class VisitorRecordAdapter extends BaseAdapter {

    private Context context;
    private List<VisitorRecordModel> visitorRecordModelList;

    public VisitorRecordAdapter(Context context, List<VisitorRecordModel> visitorRecordModelList) {
        this.context = context;
        this.visitorRecordModelList = visitorRecordModelList;
    }

    @Override
    public int getCount() {
        return visitorRecordModelList.size();
    }

    @Override
    public Object getItem(int position) {
        return visitorRecordModelList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return visitorRecordModelList.get(position).getIntDateTime();
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        int type = getItemViewType(position);

        VisitorRecordModel model = visitorRecordModelList.get(position);

        if (model.getIntDateTime() == type){

        }

        return null;
    }

    class HeaderViewHolder{
        TextView dateTextView;
        TextView countTextView;
    }

    class ViewHolder{
        TextView timeTextView;
        ImageView imageView;
    }

}
