package com.sangoes.common.core.utils.page;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Copyright (c) sangoes 2018
 * https://github.com/sangoes
 * 封装查询参数
 *
 * @author jerrychir
 * @date 2019 2019/2/20 3:15 PM
 */
@EqualsAndHashCode(callSuper = false)
@Data
public class PageQuery extends LinkedHashMap<String, Object> {

    private static final long serialVersionUID = 1L;
    /**
     * 当前页码
     */
    private long current = 1;
    /**
     * 每页条数
     */
    private long pageSize = 10;
    /**
     * 升序
     */
    private boolean isAsc = true;
    /**
     * 排序名称
     */
    private String sorter;

    /**
     * Instantiates a new Query.
     *
     * @param params the params
     */
    public PageQuery(Map<String, Object> params) {
        this.putAll(params);
        // 分页参数
        Object currentObj = params.get("current");
        Object sizeObj = params.get("pageSize");
        // 排序
        Object sorterObj = params.get("sorter");
        // 当前页
        if (ObjectUtil.isNotNull(currentObj)) {
            this.current = Long.valueOf(currentObj.toString());
        }
        //
        if (ObjectUtil.isNotNull(sizeObj)) {
            this.pageSize = Long.valueOf(sizeObj.toString());
        }
        // 排序
        if (ObjectUtil.isNotNull(sorterObj)) {
            String[] values = sorterObj.toString().split("_");
            this.sorter = StrUtil.toSymbolCase(values[0], '_');
            if (StrUtil.equals(values[1], "descend")) {
                this.isAsc = false;
            }
        }
        // 移除
        this.remove("current");
        this.remove("pageSize");
        this.remove("sorter");
    }

}

