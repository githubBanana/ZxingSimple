package com.xs.zxingsimple;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * @version V1.0 <描述当前版本功能>
 * @author: Xs
 * @date: 2016-09-23 14:30
 * @email Xs.lin@foxmail.com
 */
public class ShowActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        TextView mTvShow = (TextView) findViewById(R.id.tv_show);
        String text = getIntent().getStringExtra("text");
        mTvShow.setText(text);
    }
}
