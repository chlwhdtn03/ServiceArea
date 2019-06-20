package com.example.viewpager;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends BaseAdapter {

    ArrayList<Item> items;

    public ItemAdapter(ArrayList<Item> items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,null);
        TextView title = view.findViewById(R.id.item_title);
        TextView subtitle = view.findViewById(R.id.item_subtitle);

        Item item = items.get(position);
        String str_title = item.getTitle(), str_subtitle = item.getSubtitle();

        title.setText(str_title);
        subtitle.setText(str_subtitle);

        title.setText(items.get(position).getTitle());
        subtitle.setText(items.get(position).getSubtitle());
        return view;
    }
}
