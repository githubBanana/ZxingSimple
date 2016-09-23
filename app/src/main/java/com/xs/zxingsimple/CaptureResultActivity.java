package com.xs.zxingsimple;

import android.content.Intent;

import com.src.zf.cy.zxing.CaptureActivity;

/**
 * @version V1.0 <描述当前版本功能>
 * @author: Xs
 * @date: 2016-09-23 14:18
 * @email Xs.lin@foxmail.com
 */
public class CaptureResultActivity extends CaptureActivity {

    @Override
    protected void dealResult(String text) {
        Intent intent = new Intent(CaptureResultActivity.this,ShowActivity.class);
        intent.putExtra("text",text);
        startActivity(intent);
        finish();
    }
}
