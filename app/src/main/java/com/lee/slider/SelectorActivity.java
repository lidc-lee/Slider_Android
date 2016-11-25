package com.lee.slider;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import com.lee.slider.support.MainActivity;

/**
 * Created by AA on 2016/11/25.
 */

public class SelectorActivity extends ListActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.app_name);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.options, android.R.layout.simple_list_item_1);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (i){
            case 0:
                Intent intent = new Intent(SelectorActivity.this,MainActivity.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(SelectorActivity.this, com.lee.slider.MainActivity.class);
                startActivity(intent1);
                break;
        }
    }
}
