package com.pms.open_api.service;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface TaskService {

    List getTaskList(Map query);



}
