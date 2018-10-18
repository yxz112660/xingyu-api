package com.yxz.xingyuornament.service.lottery;

import com.yxz.xingyuornament.dataobject.entity.lottery.Lottery;
import com.yxz.xingyuornament.dto.ReturnMsg;

public interface LotteryService {
    /**
    * 查询cp信息
    * */
    ReturnMsg<Lottery> lotteryInfo();
}
