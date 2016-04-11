package com.coolweather.app.util;
/**
 * HttpUtil 类中使用到了 HttpCallbackListener 接口来回调服务返回的结果
 * @author lenovo
 *
 */
public interface HttpCallbackListener {
	void onFinish(String response);
	void onError(Exception e);
}
