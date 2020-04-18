package com.yussefsaidi.dagger2examplenew;

import dagger.Component;

@Component
public interface CarComponent {

    void inject(MainActivity mainActivity);
}
