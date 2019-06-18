package com.example.mygeeknews.base;

public abstract class BaseMvpActivity<V extends BaseView, M extends BaseModel, P extends BasePresenter> extends BaseActivity {

    protected P mPresenter;

    @Override
    protected void initMvp() {
        super.initMvp();
        //初始化P层
        mPresenter = initPresenter();
        //判断是不是null
        if (mPresenter != null) {
            //连接V层
            mPresenter.attachView(initMvpView());
            //初始化M层
            mPresenter.initModel(initMvpModel());
        }
    }

    protected abstract M initMvpModel();

    protected abstract V initMvpView();

    protected abstract P initPresenter();

    //解绑
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.pClear();
        mPresenter = null;
    }
}
