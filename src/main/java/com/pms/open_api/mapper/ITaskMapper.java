package com.pms.open_api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ITaskMapper extends BaseMapper {

    List getTaskList(Map query);

}
