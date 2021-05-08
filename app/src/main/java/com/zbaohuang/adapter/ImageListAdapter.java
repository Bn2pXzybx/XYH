package com.zbaohuang.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.zbaohuang.xyh.R;

import java.util.List;

/**
 * Created by zbaohuang on 16/3/26.
 */
public class ImageListAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    public List<Integer>   imageResIdList;

    public ImageListAdapter(Context context) {
        super();
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return imageResIdList.size();
    }

    @Override
    public Object getItem(int position) {
        return imageResIdList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.image_list_item, null);
            holder = new ViewHolder();
            holder.imageView = (ImageView)convertView.findViewById(R.id.image_list_image);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder)convertView.getTag();
        }
        holder.imageView.setImageResource(imageResIdList.get(position));
        return convertView;
    }

    public List<Integer> getImageList() {
        return imageResIdList;
    }

    public void setImageList(List<Integer> imageList) {
        this.imageResIdList = imageList;
    }

    /**
     * ViewHolder
     *
     * @author Trinea 2012-11-22
     */
    static class ViewHolder {

        ImageView imageView;
    }

}
