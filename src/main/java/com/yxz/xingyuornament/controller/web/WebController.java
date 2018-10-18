package com.yxz.xingyuornament.controller.web;
import com.yxz.xingyuornament.dto.ReturnMsg;
import com.yxz.xingyuornament.service.lottery.LotteryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : yxz
 * @param : web
 * @create_date : 2018/7/20
 */
@RestController
@Slf4j
public class WebController {

    @Autowired
    private LotteryService lotteryService;
    @PostMapping(value = "/lottery/info")
    public ReturnMsg getInfo() {
        return lotteryService.lotteryInfo();
    }
}
