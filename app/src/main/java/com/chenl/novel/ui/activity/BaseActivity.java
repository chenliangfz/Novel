package com.chenl.novel.ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.chenl.novel.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by ChenLiang on 16/9/23.
 */

public abstract class BaseActivity extends AppCompatActivity {

    private Unbinder mButterKnifeBinder;

    @Nullable
    @BindView(R.id.custom_toolbar)
    Toolbar mToolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        initTheme();
        mButterKnifeBinder = ButterKnife.bind(this);
        initToolbar();
        initPersenter();
        initView();
    }

    private void initTheme() {
    }

    private void initToolbar() {
        if (mToolbar != null) {
            mToolbar.setTitle(getDefaultTitle());
            setSupportActionBar(mToolbar);
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null){
                actionBar.setDisplayHomeAsUpEnabled(true);
            }
        }
    }

    @NonNull
    protected abstract CharSequence getDefaultTitle();

    /**
     * 初始化Persenter
     **/
    protected abstract void initPersenter();


    protected abstract void initView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mButterKnifeBinder.unbind();
    }

    @NonNull
    protected abstract int getLayoutResId();


}



