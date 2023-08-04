package com.pms.open_api.service.Impl;

import com.pms.open_api.Entity.Task;
import com.pms.open_api.mapper.ITaskMapper;
import com.pms.open_api.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private ITaskMapper iTaskMapper;

    @Override
    public List getTaskList(Map query) {
        List list = this.iTaskMapper.getTaskList(query);
        return list;
    }
}
