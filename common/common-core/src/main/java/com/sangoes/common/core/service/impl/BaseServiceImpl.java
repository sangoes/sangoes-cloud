package com.sangoes.common.core.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sangoes.common.core.service.IBaseService;
import org.springframework.stereotype.Service;

/**
 * Copyright (c) sangoes 2018
 * https://github.com/sangoes
 * 基础服务类实现类
 *
 * @author jerrychir
 * @date 2019 2019/2/20 3:08 PM
 */
@Service
public class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements IBaseService<T> {
}
