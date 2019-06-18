package com.example.mygeeknews.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.mygeeknews.utils.Logger;

import java.util.List;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    private static final String TAG = "BaseActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //初始化视图
        setContentView(getLayoutId());
        //找控件
        ButterKnife.bind(this);
        //定义方法
        initMvp();
        initView();
        initData();
        initListener();
    }

    protected void initListener() {

    }

    protected void initData() {

    }

    protected void initView() {

    }

    protected void initMvp() {

    }

    protected abstract int getLayoutId();

}
