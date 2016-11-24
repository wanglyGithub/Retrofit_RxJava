package com.wangly.newsinfo.presenter;

/**
 * Created by wangly on 2016/11/23.
 */

public interface BasePresenter<T extends BaseView> {
    void initData();
}
;