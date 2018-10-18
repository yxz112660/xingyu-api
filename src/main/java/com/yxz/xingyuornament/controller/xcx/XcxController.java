package com.yxz.xingyuornament.controller.xcx;
import com.yxz.xingyuornament.dto.ReturnMsg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : yxz
 * @param : 小程序
 * @create_date : 2018/7/20
 */
@RestController
@Slf4j
public class XcxController {

    @PostMapping(value = "/get/xcx")
    public ReturnMsg get(@RequestBody String xcx) {
        log.info(xcx);
        return null;
    }
}
