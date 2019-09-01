package com.workflow.demo.service.system.impl;

import com.workflow.demo.entity.system.Role;
import com.workflow.demo.dao.RoleMapper;
import com.workflow.demo.service.system.RoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
	
}
