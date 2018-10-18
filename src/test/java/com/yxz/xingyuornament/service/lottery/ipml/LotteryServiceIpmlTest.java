package com.yxz.xingyuornament.service.lottery.ipml;

import com.yxz.xingyuornament.service.lottery.LotteryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAsync
@Slf4j
public class LotteryServiceIpmlTest {
    @Autowired
    private LotteryService lotteryService;

    @Test
    public void lotteryInfo() {
        log.info("信息：【{}】"+lotteryService.lotteryInfo());
    }
}