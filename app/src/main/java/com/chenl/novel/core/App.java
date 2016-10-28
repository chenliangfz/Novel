package com.chenl.novel.core;

import android.app.Application;

import com.chenl.novel.core.component.DaggerAppComponent;
import com.chenl.novel.core.manager.FileManager;
import com.chenl.novel.util.L;

import javax.inject.Inject;

/**
 * Created by ChenLiang on 16/9/30.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
