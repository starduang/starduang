package com.milotnt.service.impl;

import com.milotnt.mapper.AdminMapper;
import com.milotnt.pojo.Admin;
import com.milotnt.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ChenXing
 * @date 2022/8/10
 */

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin adminLogin(Admin admin) {
        return adminMapper.selectByAccountAndPassword(admin);
    }
}
