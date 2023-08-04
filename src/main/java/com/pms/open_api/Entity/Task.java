package com.pms.open_api.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class Task {
    public interface insertGroup{

    }

    public interface updateGroup{

    }

    @NotNull(message = "任务id不能为空",groups = updateGroup.class)
    private Integer id;

    private transient String moduleCode;
    private transient String moduleName;

    @NotNull(message = "类型不能为空",groups = insertGroup.class)
    private Integer type;

    @NotNull(message = "关联模块不能为空",groups = insertGroup.class)
    private Integer moduleId;

    private Integer isMilestone;

    private String taskType;

    private Integer topParentId;

    private Integer parentId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date scheduleStartTime;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date scheduleEndTime;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date actualStartTime;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date actualEndTime;

    private Integer planTime;

    private Integer status;

    private Integer riskStatus;

    private Integer frontTaskId;

    private BigDecimal amountMoney;

    private BigDecimal actualMoney;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date deletedAt;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Integer createBy;

    private String createUser;

    private Integer updateBy;

    private  String updateUser;

    //private transient List<Task> children;

}
