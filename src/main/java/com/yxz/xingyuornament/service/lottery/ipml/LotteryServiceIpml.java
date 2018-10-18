package com.yxz.xingyuornament.service.lottery.ipml;

import com.yxz.xingyuornament.dataobject.entity.lottery.Lottery;
import com.yxz.xingyuornament.dataobject.mapper.lottery.LotteryMapper;
import com.yxz.xingyuornament.dto.ReturnMsg;
import com.yxz.xingyuornament.service.lottery.LotteryService;
import com.yxz.xingyuornament.utils.ReturnUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LotteryServiceIpml implements LotteryService {
    @Autowired
    private LotteryMapper lotteryMapper;
    @Override
    public ReturnMsg<Lottery> lotteryInfo() {
        return ReturnUtil.success(lotteryMapper.selectAll());
    }
}
