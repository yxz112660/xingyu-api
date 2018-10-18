package com.yxz.xingyuornament.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author : niithub
 * @description : 请求微信公众平台的接口
 * @date : 2018/7/18
 */
@Component
@FeignClient(url = "https://api.weixin.qq.com", name = "weChatAPIClient")
public interface WeChatAPIClient {

    /**
     * 微信公众号-获取accessToken
     *
     * @param postEntity
     * @param token
     * @return
     */
    @PostMapping(value = "/cgi-bin/message/template/send?access_token={token}", consumes = "application/json")
    String sendTemplate(@PathVariable("token") String token, String postEntity);
}
