package com.workflow.demo.service.system.impl;

import com.workflow.demo.entity.system.User;
import com.workflow.demo.dao.UserMapper;
import com.workflow.demo.service.system.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chenyihongyi
 * @since 2019-09-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
	
}
