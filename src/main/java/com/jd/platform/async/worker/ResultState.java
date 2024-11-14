package com.jd.platform.async.worker;

/**
 * 结果状态
 * @author wuweifeng wrote on 2019-11-19.
 */

// todo：还是第一次见这样用enum，只有声明，没有code和description，为什么要这么用呢？
public enum ResultState {
    SUCCESS,
    TIMEOUT,
    EXCEPTION,
    DEFAULT  //默认状态
}
