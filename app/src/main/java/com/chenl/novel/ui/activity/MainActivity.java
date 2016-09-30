package com.chenl.novel.ui.activity;

import android.support.annotation.NonNull;
import android.view.Menu;

import com.chenl.novel.R;
import com.chenl.novel.presenter.MainPresenter;
import com.chenl.novel.ui.view.MainView;
import com.chenl.novel.util.L;

public class MainActivity extends BaseActivity implements MainView {

    MainPresenter mPresenter;

    @Override
    protected void initView() {
    }

    @Override
    protected CharSequence getDefaultTitle() {
        return getString(R.string.app_name);
    }

    @Override
    protected void initPersenter() {
        mPresenter = new MainPresenter();
        mPresenter.attachView(this);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }

    @NonNull
    @Override
    protected int getLayoutResId() {
        return R.layout.activity_main;
    }
}
