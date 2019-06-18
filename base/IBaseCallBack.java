package com.example.mygeeknews.base;

public interface IBaseCallBack<T> {
    //正确的
    void onSuccess(T t);
    //错误的
    void onFile(String data);
}
