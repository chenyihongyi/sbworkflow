package com.workflow.demo.service.fhoa.impl;

import com.workflow.demo.entity.fhoa.Department;
import com.workflow.demo.mapper.dsno1.fhoa.DepartmentMapper;
import com.workflow.demo.service.fhoa.OaDepartmentService;
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
public class OaDepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements OaDepartmentService {
	
}
