package com.luban.demo.request;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author Yang Hao
 * @date 2019/11/17 21:07
 */
@Data
public class WorkUpdateRequest {

    private String title;

    private String description;

    private String coverImageUrl;

    private List<Object> pages;

    private Date updateTime = new Date();

    private boolean publish;

    private boolean template;
}
