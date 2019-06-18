package com.jiyun.mvp1.net;

import android.util.Log;

import com.jiyun.mvp1.utils.ToastUtil;

import io.reactivex.Observer;

/**
 * Created by $lzj on 2019/6/4.
 */
public abstract class BaseObserver<T> implements Observer<T> {

    private final String TAG = getClass().getName();

    @Override
    public void onError(Throwable e) {
        Log.d(TAG, "onError: "+e.toString());
        ToastUtil.showShort("数据加载失败");
    }

    @Override
    public void onComplete() {
        Log.d(TAG, "onComplete: ");
    }

}
