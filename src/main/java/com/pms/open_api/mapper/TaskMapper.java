package com.pms.open_api.mapper;

import com.pms.open_api.Entity.Task;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
* @author lhz
* @description 针对表【pms_task(项目任务主表)】的数据库操作Mapper
* @createDate 2023-08-09 16:09:50
* @Entity com.pms.open_api.Entity.Task
*/
public interface TaskMapper extends BaseMapper<Task> {
    List getTaskList(Map query);
}




