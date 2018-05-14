package com.example.hasee.listviewdome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private String[]name = new String[]{"笑笑","小怪","小乖"};
    private String[]address = new String[]{"地球","银河系","宇宙"};
    private String[]age = new String[]{"22","33","11"};
    private String[]start = new String[]{"摩羯座","天蝎座","双子座"};

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       listView = (ListView)findViewById(R.id.list_item);
//        final List<String> data = new ArrayList<String>();
//        //数据
//        for(int i = 0;i <20;i++){
//            data.add("第一行"+i);
//        }
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.activity_list_item,data);
//        //创建
//        listView.setAdapter(adapter);
//        //绑定

        //定义一个HashMap构成的链表以键值对的方式放数据
//        ArrayList<HashMap<String,Object>> listItem = new ArrayList<HashMap<String, Object>>();
//        //填充数据
//        for (int i = 0; i < name.length; i++) {
//            HashMap<String,Object> map = new HashMap<String,Object>();
//            map.put("name",name[i]);
//            map.put("address",address[i]);
//            map.put("age",age[i]);
//            map.put("start",start[i]);
//            listItem.add(map);
//        }
//        //构造simpleAdapter
//        SimpleAdapter simpleAdapter = new SimpleAdapter(
//                this,//上下文
//                listItem, //集合类的数据源
//                R.layout.list_item,//自己写的每行的布局
//                new String[]{"name","address","age","start"},//键值
//                new int[]{R.id.tv_name,R.id.tv_address,R.id.tv_whilesale,R.id.tv_price});//每行的每个元素的名字
//        listView.setAdapter(simpleAdapter);
        ArrayList<HashMap<String,Object>> listItem = new ArrayList<HashMap<String, Object>>();
        for (int i = 0; i < 100; i++) {
            HashMap<String,Object> map = new HashMap<String,Object>();
            map.put("ItemTitle","第"+i+"行");
            map.put("ItemText","第"+i+"行");
            listItem.add(map);
        }
        MyAdapter myAdapter = new MyAdapter(this,listItem);
        listView.setAdapter(myAdapter);

    }
}
