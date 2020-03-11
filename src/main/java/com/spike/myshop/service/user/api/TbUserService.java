package com.spike.myshop.service.user.api;

import com.github.pagehelper.PageInfo;
import com.spike.myshop.commons.domain.TbUser;

import java.util.List;

public interface TbUserService {
    List<TbUser> selectAll();
    PageInfo<TbUser> page(int start, int length, TbUser tbUser);
}
