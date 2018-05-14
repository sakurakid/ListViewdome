package com.example.hasee.listviewdome;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by hasee on 2018/5/14.
 */

public class MyAdapter extends BaseAdapter {
    private LayoutInflater mInflater;//得到一个LayoutInfalter对象引入布局
    private ArrayList<HashMap<String,Object>>listItem;
    public MyAdapter(Context context, ArrayList<HashMap<String,Object>>listItem){
        this.mInflater = LayoutInflater.from(context);
        this.listItem = listItem;
    }
    @Override
    public int getCount() {
        return 0;
    }//返回了适配器中数据条目的个数

    @Override
    public Object getItem(int position) {
        return null;
    }//返回在列表中的指定的索引对应的行id

    @Override
    public long getItemId(int position) {
        return 0;
    }
    //布局里面的控件声明一个类
    static class ViewHolder{
        public ImageView img;
        public TextView title;
        public TextView text;
        public Button btn;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView==null){
            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.item,null);
            holder.img = (ImageView)convertView.findViewById(R.id.iv_image);
            holder.title = (TextView)convertView.findViewById(R.id.tv_title);
            holder.text = (TextView)convertView.findViewById(R.id.tv_item);
            holder.btn = (Button)convertView.findViewById(R.id.btn_buttom);
        }else {
            holder = (ViewHolder)convertView.getTag();
        }

        holder.title.setText((String)listItem.get(position).get("ItemTitle"));
        holder.text.setText((String)listItem.get(position).get("ItemText"));
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return convertView;
    }//返回了指定索引的视图
}
