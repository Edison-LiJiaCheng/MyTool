package com.example.mygeeknews.base;

import io.reactivex.disposables.CompositeDisposable;

public class BaseModel {
    //解除请求
    protected CompositeDisposable compositeDisposable = new CompositeDisposable();
    //清除方法
    public void clear() {
        compositeDisposable.clear();
    }
}
