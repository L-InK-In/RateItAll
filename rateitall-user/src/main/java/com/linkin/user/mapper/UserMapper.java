package com.linkin.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.linkin.common.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
