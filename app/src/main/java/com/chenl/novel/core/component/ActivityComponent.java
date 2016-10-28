package com.chenl.novel.core.component;

import com.chenl.novel.ui.activity.MainActivity;

import dagger.Component;

/**
 * Created by ChenLiang on 16/10/25.
 */
@Component
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
