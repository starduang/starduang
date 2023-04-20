package com.milotnt.mapper;

import com.milotnt.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ChenXing
 * @date 2022/8/10
 */

@Mapper
public interface AdminMapper {

    Admin selectByAccountAndPassword(Admin admin);

}
