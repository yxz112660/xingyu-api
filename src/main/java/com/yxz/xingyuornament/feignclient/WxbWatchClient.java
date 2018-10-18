package com.yxz.xingyuornament.feignclient;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Component
@FeignClient(url="http://open.umeox.com:8080",name="wxbWatchClient")
@Headers({"Accept: application/json", "Content-Type: application/json"})
public interface WxbWatchClient {

        @PostMapping(value="/api/v1/devices/{devCode}/{function}?access_token={accessToken}",consumes = "application/json",produces = "application/json")
        String post(@PathVariable("devCode")String devCode,@PathVariable("accessToken")String accessToken,@PathVariable("function")String function,String json);

        @GetMapping(value="/devices/{devCode}/cmd/location?access_token={accessToken}&fuid={fuid}")
        String locationGet(@PathVariable("devCode")String devCode,@PathVariable("accessToken")String accessToken,@PathVariable("fuid")String fuid);

        @GetMapping(value="/api/v1/devices/{devCode}/{function}?access_token={accessToken}")
        String get(@PathVariable("devCode")String devCode,@PathVariable("accessToken")String accessToken,@PathVariable("function")String function);

        @PostMapping(value = "/api/v1/oauth2/accessToken",consumes = "application/json",produces = "application/json")
        String getAccessToken(String json);
}