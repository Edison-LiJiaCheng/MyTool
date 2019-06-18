package com.example.mygeeknews.base;

import java.util.ArrayList;

public class BasePresenter <V extends BaseView,M extends BaseModel>{

    //把Model放入集合中
    protected ArrayList<BaseModel>list=new ArrayList();

    //必须持有M和V的引用
    protected V mView;
    protected M mModel;

    public void attachView(V initMvpView) {
        //连接
        mView=initMvpView;
        list.add(mModel);
    }

    public void initModel(M initMvpModel) {
        //初始化
        mModel=initMvpModel;
    }

    public void pClear(){
        //不是null设成null
        if(mView!=null){
            mModel=null;
        }

        if (list==null&&list.size()>0){
            for (BaseModel baseModel : list) {
                baseModel.clear();
            }
        }

        if (mModel!=null){
            mView=null;
        }
    }

}
