package com.yxz.xingyuornament.feignclient;

import com.yxz.xingyuornament.form.wx.AccessToken;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author : niithub
 * @description : 获取accessToken
 * @date : 2018/7/11
 */
@Component
@FeignClient(url = "http://", name = "shareJoyAPIClient")
public interface ShareJoyAPIClient {

    /**
     * 微信公众号-获取accessToken
     *
     * @param accessToken
     * @return
     */
    @PostMapping(value = "/wx/getaccesstoken", consumes = "application/json")
    String getAccessToken(AccessToken accessToken);
}
