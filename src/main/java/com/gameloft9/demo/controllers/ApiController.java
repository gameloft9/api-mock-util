package com.gameloft9.demo.controllers;

import com.gameloft9.demo.util.Constants;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 动态api处理controller，
 * 目前支持10个api注册，可手动添加
 * Created by gameloft9 on 2018/8/9.
 */
@Controller
@Slf4j
public class ApiController {
    @ResponseBody
    public String index1() {
        return getReturnMsg(Constants.msgs[1]);
    }

    @ResponseBody
    public String index2() {
        return getReturnMsg(Constants.msgs[2]);
    }

    @ResponseBody
    public String index3() {
        return getReturnMsg(Constants.msgs[3]);
    }

    @ResponseBody
    public String index4() {
        return getReturnMsg(Constants.msgs[4]);
    }

    @ResponseBody
    public String index5() {
        return getReturnMsg(Constants.msgs[5]);
    }

    @ResponseBody
    public String index6() {
        return getReturnMsg(Constants.msgs[6]);
    }

    @ResponseBody
    public String index7() {
        return getReturnMsg(Constants.msgs[7]);
    }

    @ResponseBody
    public String index8() {
        return getReturnMsg(Constants.msgs[8]);
    }

    @ResponseBody
    public String index9() {
        return getReturnMsg(Constants.msgs[9]);
    }

    @ResponseBody
    public String index10() {
        return getReturnMsg(Constants.msgs[10]);
    }

    /**
     * 拿到注册的返回报文
     * */
    private String getReturnMsg(String msg) {
        if (StringUtils.isBlank(msg)) {
            return "success";
        }

        return msg;
    }
}
