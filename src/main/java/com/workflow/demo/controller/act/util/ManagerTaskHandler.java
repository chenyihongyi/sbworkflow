package com.workflow.demo.controller.act.util;

import com.workflow.demo.util.Jurisdiction;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.apache.shiro.session.Session;

/**
 * 指定下一任务待办人
 * @Author: Elvis
 * @Date: 2019/9/5 22:31
 */
public class ManagerTaskHandler implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
        Session session = Jurisdiction.getSession();
        session.setAttribute("TASKID", delegateTask.getId());			//任务ID
        session.setAttribute("YAssignee", delegateTask.getAssignee());	//默认待办人
    }



}
