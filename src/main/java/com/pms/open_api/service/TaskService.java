package com.pms.open_api.service;

import com.pms.open_api.Entity.Task;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
* @author lhz
* @description 针对表【pms_task(项目任务主表)】的数据库操作Service
* @createDate 2023-08-09 16:09:50
*/
public interface TaskService extends IService<Task> {

    List getTaskList(Map query);
}
