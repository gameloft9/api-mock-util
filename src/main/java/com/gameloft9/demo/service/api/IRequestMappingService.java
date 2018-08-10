package com.gameloft9.demo.service.api;

/**
 * request映射服务
 * Created by gameloft9 on 2018/8/9.
 */
public interface IRequestMappingService {

    /**
     * 处理路由方法是否已经被占用
     * @param index
     * @return
     */
    public boolean hasMethodOccupied(String index);

    /**
     * api是否经注册
     * @param api
     * @param requestMethod 请求方法 post,get
     * @return
     */
    public boolean hasApiRegistered(String api,String requestMethod);

    /**
     * 注册api
     * @param index
     * @param api
     * @param requestMethod 请求方法 post,get
     * @param msg
     * @return
     */
    public boolean registerApi(String index,String api,String requestMethod,String msg);

    /**
     * 注销api
     * @param index
     * @param api
     * @param requestMethod 请求方法 post,get
     * @return
     */
    public boolean unregisterApi(String index,String api,String requestMethod);
}
