package com.wgallery.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * 首页。
 *
 * @author wuzhen
 * @version Version 1.0, 2016-05-10
 */
public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                startActivity(new Intent(this, SimpleWGalleryActivity.class));
                break;

            case R.id.btn2:
                startActivity(new Intent(this, WithWGalleryAdapterActivity.class));
                break;

            default:
                break;
        }
    }

    @Override
    protected boolean isDisplayHomeAsUp() {
        return false;
    }
}
