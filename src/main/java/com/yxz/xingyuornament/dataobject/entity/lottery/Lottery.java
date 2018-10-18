package com.yxz.xingyuornament.dataobject.entity.lottery;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Lottery {
    private int id;
    private String userId;
    private Float expenditure;//支出
    private Float income;//收入
    private Integer cpType;
    private Integer clientType;
    private LocalDateTime payTime;


}
