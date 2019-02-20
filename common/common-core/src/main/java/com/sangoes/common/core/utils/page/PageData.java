package com.sangoes.common.core.utils.page;

import lombok.Data;

import java.util.Collections;
import java.util.List;

/**
 * Copyright (c) sangoes 2018
 * https://github.com/sangoes
 * 分页结果 总条数 分页行
 *
 * @author jerrychir
 * @date 2019 2019/2/20 3:14 PM
 */
@Data
public class PageData<T> {
    /**
     * The Total.
     */

    private Pagination pagination;
    /**
     * The list.
     */
    private List<T> list = Collections.emptyList();

    /**
     * 无参构造函数
     */
    public PageData() {
    }

    /**
     * Instantiates a new Table data.
     *
     * @param pagination the pagination
     * @param list       the list
     */
    public PageData(Pagination pagination, List<T> list) {
        this.pagination = pagination;
        this.list = list;
    }

}

