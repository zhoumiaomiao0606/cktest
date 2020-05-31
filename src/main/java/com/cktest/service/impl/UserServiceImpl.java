package com.cktest.service.impl;

import com.cktest.pojo.User;
import com.cktest.mapper.UserMapper;
import com.cktest.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 周周
 * @since 2020-05-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
