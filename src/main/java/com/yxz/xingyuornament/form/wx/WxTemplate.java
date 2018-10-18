package com.yxz.xingyuornament.form.wx;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @author : niithub
 * @description :
 * @date : 2018/6/29
 */
@Data
public class WxTemplate implements Serializable {

    private String source;
    private String url;
    private String appId;
    private String title;
    private Map<String, WxTemplateInfo> templates;
}
