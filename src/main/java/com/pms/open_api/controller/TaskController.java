package com.pms.open_api.controller;

import com.pms.open_api.service.TaskService;
import com.pms.open_api.util.JsonResponse;
import com.pms.open_api.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/openApi/task/")
@Validated
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/getTaskList")
    public JsonResponse getTaskList(
            @RequestParam(value = "beginTime") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date beginTime,
            @RequestParam(value = "endTime") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date endTime
    ){
        if (beginTime.after(endTime)){
            return Response.error(1,"查询时间错误");
        }


        Map filter = new HashMap();
        filter.put("begin_time",beginTime);
        filter.put("end_time",endTime);


        List list = this.taskService.getTaskList(filter);

        return Response.success(list);
    }
}
