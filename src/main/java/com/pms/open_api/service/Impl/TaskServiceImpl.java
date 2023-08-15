package com.pms.open_api.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pms.open_api.Entity.Task;
import com.pms.open_api.service.TaskService;
import com.pms.open_api.mapper.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* @author lhz
* @description 针对表【pms_task(项目任务主表)】的数据库操作Service实现
* @createDate 2023-08-09 16:09:50
*/
@Service
public class TaskServiceImpl extends ServiceImpl<TaskMapper, Task> implements TaskService{
    @Autowired
    private TaskMapper taskMapper;
    @Override
    public List<Task> getTaskList(Map query) {
        List<Task> list = taskMapper.getTaskList(query);

        return setTaskTree(list,0);
    }

    @Override
    public List<Task> getUpdateTaskList(Map query) {
        List<Task> list = taskMapper.getTaskList(query);
        return list;
    }

    @Override
    public Boolean addTask(Task task) {
        Integer row =  taskMapper.insert(task);
        if (row > 0){
            return true;
        }
        return false;
    }

    /**
     * 处理树形
     * @param list
     * @param parentId
     * @return
     */
    private List setTaskTree(List<Task> list ,Integer parentId)
    {
        List<Task> returnList = new ArrayList<>();
        for (Task item:list){
            if (item.getParentId().equals(parentId)){
                item.setChildren(setTaskTree(list,item.getId()));
                returnList.add(item);
            }
        }
        if (returnList.size() == 0){
            return null;
        }
        return returnList;
    }
}




