package com.spike.myshop.service.user.api;

import com.spike.myshop.commons.domain.TbUser;

import java.util.List;

public interface TbUserService {
    List<TbUser> selectAll();
}
