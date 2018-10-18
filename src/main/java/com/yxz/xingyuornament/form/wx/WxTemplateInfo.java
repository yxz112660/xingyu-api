package com.yxz.xingyuornament.form.wx;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author : niithub
 * @description :
 * @date : 2018/6/29
 */
@Data
public class WxTemplateInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String templateName;
    private String templateId;
    private String detailUrl;
    private Integer wxInfoId;
    private LocalDateTime createTime;
    private String description;

    private String source;
    private String url;
    private String appId;
    private String title;
}
