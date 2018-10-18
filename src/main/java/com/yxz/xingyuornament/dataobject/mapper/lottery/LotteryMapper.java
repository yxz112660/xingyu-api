package com.yxz.xingyuornament.dataobject.mapper.lottery;

import com.yxz.xingyuornament.annotation.TargetDataSource;
import com.yxz.xingyuornament.dataobject.entity.lottery.Lottery;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LotteryMapper {
    @Select("SELECT id,user_id,expenditure,income,pay_time,client_type FROM db_cp")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "user_id", property = "userId"),
            @Result(column = "expenditure", property = "expenditure"),
            @Result(column = "income", property = "income"),
            @Result(column = "pay_time", property = "payTime"),
            @Result(column = "client_type", property = "clientType"),
    })
    @TargetDataSource("xcx")
    List<Lottery> selectAll();
}
