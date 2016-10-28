package com.chenl.novel.ui.activity;

import android.support.annotation.NonNull;
import android.view.Menu;

import com.chenl.novel.R;
import com.chenl.novel.core.component.DaggerActivityComponent;
import com.chenl.novel.core.manager.FileManager;
import com.chenl.novel.presenter.MainPresenter;
import com.chenl.novel.ui.view.MainView;
import com.chenl.novel.util.L;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainView {

    @Inject
    MainPresenter mPresenter;

    @Inject
    FileManager mFileManager;

    @Override
    protected void initView() {
    }

    @Override
    protected CharSequence getDefaultTitle() {
        return getString(R.string.app_name);
    }

    @Override
    protected void initPresenter() {
        DaggerActivityComponent.builder().build().inject(this);
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
