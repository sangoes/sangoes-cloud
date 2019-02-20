package com.sangoes.common.core.utils.page;

import lombok.Data;

/**
 * Copyright (c) sangoes 2018
 * https://github.com/sangoes
 * 分页
 *
 * @author jerrychir
 * @date 2019 2019/2/20 3:12 PM
 */
@Data
public class Pagination {
    /**
     * 总条数
     */
    private long total;

    private long pageSize;

    private long currentPage;

    /**
     * @param total
     */
    public Pagination(long total) {
        this.total = total;
    }

    /**
     * @param total
     * @param pageSize
     * @param currentPage
     */
    public Pagination(long total, long pageSize, long currentPage) {
        this.total = total;
        this.pageSize = pageSize;
        this.currentPage = currentPage;
    }
}

