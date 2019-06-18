package com.example.mygeeknews.base;

public abstract class BaseMvpFragment<V extends BaseView, M extends BaseModel, P extends BasePresenter> extends BaseFragment {

    protected P mPresenter;

    @Override
    protected void initMvp() {
        super.initMvp();
        mPresenter = initPresenter();
        if (mPresenter != null) {
            mPresenter.attachView(initMvpView());
            mPresenter.initModel(initMvpModel());
        }
    }

    protected abstract M initMvpModel();

    protected abstract V initMvpView();

    protected abstract P initPresenter();

    @Override
    public void onDestroy() {
        super.onDestroy();
        mPresenter.pClear();
        mPresenter = null;
    }
}
