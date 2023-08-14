package com.pms.open_api.Entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 项目任务主表
 * @TableName pms_task
 */
@TableName(value ="pms_task")
public class Task implements Serializable {

    public interface insertGroup{

    }

    public interface updateGroup{

    }

    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    @NotNull(message = "任务id不能为空",groups = updateGroup.class)
    private Integer id;

    /**
     * 任务类型，10项目，20询盘,30订单
     */
    @NotNull(message = "类型不能为空",groups = insertGroup.class)
    private Integer type;

    /**
     * 关联的模块 ID，如项目id
     */
    @NotNull(message = "关联模块不能为空",groups = insertGroup.class)
    private Integer moduleId;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 任务所属层级
     */
    private Integer taskTier;

    /**
     * 任务类型
     */
    private String taskType;

    /**
     * 顶层任务id
     */
    private Integer topParentId;

    /**
     * 父级任务
     */
    private Integer parentId;

    /**
     * 预计开始时间
     */
    private Date scheduleStartTime;

    /**
     * 预计结束时间
     */
    private Date scheduleEndTime;

    /**
     * 实际开始实际
     */
    private Date actualStartTime;

    /**
     * 实际结束时间
     */
    private Date actualEndTime;

    /**
     * 是否为里程碑，1是，0否
     */
    private Integer isMilestone;

    /**
     * 预计工时
     */
    private Integer planTime;

    /**
     * 任务描述
     */
    private String describe;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 风险状态
     */
    private Integer riskStatus;

    /**
     * 前面一个任务id
     */
    private Integer frontTaskId;

    /**
     * 合同金额
     */
    private BigDecimal amountMoney;

    /**
     * 
     */
    @TableLogic
    private Date deletedAt;

    /**
     * 
     */
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private String createTime;

    /**
     * 
     */
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private String  updateTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建人id
     */
    private Integer createBy;

    /**
     * 最后更新人
     */
    private String updateUser;

    /**
     * 
     */
    private Integer updateBy;

    /**
     * 实际收入
     */
    private BigDecimal actualMoney;

    /**
     * 任务编号
     */
    private String taskCode;

    /**
     * 归属部门
     */
    private Integer taskDepartmentId;

    /**
     * 任务等级，自定义
     */
    private Integer taskPriority;

    /**
     * 任务等级名称
     */
    private String taskPriorityText;

    /**
     * 任务等级颜色
     */
    private String taskPriorityColor;

    /**
     * 关联模块编号
     */
    private transient String moduleCode;

    /**
     * 关联模块名称
     */
    private transient String moduleName;

    /**
     * 子级任务
     */
    private transient List<Task> children;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 任务类型，2项目，3询盘,1订单
     */
    public Integer getType() {
        return type;
    }

    /**
     * 任务类型，2项目，3询盘,1订单
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 关联的模块 ID，如项目id
     */
    public Integer getModuleId() {
        return moduleId;
    }

    /**
     * 关联的模块 ID，如项目id
     */
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * 任务名称
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * 任务名称
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * 任务所属层级
     */
    public Integer getTaskTier() {
        return taskTier;
    }

    /**
     * 任务所属层级
     */
    public void setTaskTier(Integer taskTier) {
        this.taskTier = taskTier;
    }

    /**
     * 任务类型
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * 任务类型
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * 顶层任务id
     */
    public Integer getTopParentId() {
        return topParentId;
    }

    /**
     * 顶层任务id
     */
    public void setTopParentId(Integer topParentId) {
        this.topParentId = topParentId;
    }

    /**
     * 父级任务
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 父级任务
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 预计开始时间
     */
    public Date getScheduleStartTime() {
        return scheduleStartTime;
    }

    /**
     * 预计开始时间
     */
    public void setScheduleStartTime(Date scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
    }

    /**
     * 预计结束时间
     */
    public Date getScheduleEndTime() {
        return scheduleEndTime;
    }

    /**
     * 预计结束时间
     */
    public void setScheduleEndTime(Date scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
    }

    /**
     * 实际开始实际
     */
    public Date getActualStartTime() {
        return actualStartTime;
    }

    /**
     * 实际开始实际
     */
    public void setActualStartTime(Date actualStartTime) {
        this.actualStartTime = actualStartTime;
    }

    /**
     * 实际结束时间
     */
    public Date getActualEndTime() {
        return actualEndTime;
    }

    /**
     * 实际结束时间
     */
    public void setActualEndTime(Date actualEndTime) {
        this.actualEndTime = actualEndTime;
    }

    /**
     * 是否为里程碑，1是，0否
     */
    public Integer getIsMilestone() {
        return isMilestone;
    }

    /**
     * 是否为里程碑，1是，0否
     */
    public void setIsMilestone(Integer isMilestone) {
        this.isMilestone = isMilestone;
    }

    /**
     * 预计工时
     */
    public Integer getPlanTime() {
        return planTime;
    }

    /**
     * 预计工时
     */
    public void setPlanTime(Integer planTime) {
        this.planTime = planTime;
    }

    /**
     * 任务描述
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 任务描述
     */
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    /**
     * 状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 风险状态
     */
    public Integer getRiskStatus() {
        return riskStatus;
    }

    /**
     * 风险状态
     */
    public void setRiskStatus(Integer riskStatus) {
        this.riskStatus = riskStatus;
    }

    /**
     * 前面一个任务id
     */
    public Integer getFrontTaskId() {
        return frontTaskId;
    }

    /**
     * 前面一个任务id
     */
    public void setFrontTaskId(Integer frontTaskId) {
        this.frontTaskId = frontTaskId;
    }

    /**
     * 合同金额
     */
    public BigDecimal getAmountMoney() {
        return amountMoney;
    }

    /**
     * 合同金额
     */
    public void setAmountMoney(BigDecimal amountMoney) {
        this.amountMoney = amountMoney;
    }

    /**
     * 
     */
    public Date getDeletedAt() {
        return deletedAt;
    }

    /**
     * 
     */
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * 
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 创建人
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 创建人
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * 创建人id
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * 创建人id
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * 最后更新人
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * 最后更新人
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    /**
     * 
     */
    public Integer getUpdateBy() {
        return updateBy;
    }

    /**
     * 
     */
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 实际收入
     */
    public BigDecimal getActualMoney() {
        return actualMoney;
    }

    /**
     * 实际收入
     */
    public void setActualMoney(BigDecimal actualMoney) {
        this.actualMoney = actualMoney;
    }

    /**
     * 任务编号
     */
    public String getTaskCode() {
        return taskCode;
    }

    /**
     * 任务编号
     */
    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    /**
     * 归属部门
     */
    public Integer getTaskDepartmentId() {
        return taskDepartmentId;
    }

    /**
     * 归属部门
     */
    public void setTaskDepartmentId(Integer taskDepartmentId) {
        this.taskDepartmentId = taskDepartmentId;
    }

    /**
     * 任务等级，自定义
     */
    public Integer getTaskPriority() {
        return taskPriority;
    }

    /**
     * 任务等级，自定义
     */
    public void setTaskPriority(Integer taskPriority) {
        this.taskPriority = taskPriority;
    }

    /**
     * 任务等级名称
     */
    public String getTaskPriorityText() {
        return taskPriorityText;
    }

    /**
     * 任务等级名称
     */
    public void setTaskPriorityText(String taskPriorityText) {
        this.taskPriorityText = taskPriorityText;
    }

    /**
     * 任务等级颜色
     */
    public String getTaskPriorityColor() {
        return taskPriorityColor;
    }

    /**
     * 任务等级颜色
     */
    public void setTaskPriorityColor(String taskPriorityColor) {
        this.taskPriorityColor = taskPriorityColor;
    }

    public String getModuleCode(){
        return moduleCode;
    }

    public void setModuleCode(String moduleCode){
        this.moduleCode = moduleCode;
    }

    public String getModuleName(){
        return moduleName;
    }

    public void setModuleName(String moduleName){
        this.moduleName = moduleName;
    }

    public List<Task> getChildren(){
        return children;
    }

    public void setChildren(List<Task> children){
        this.children = children;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Task other = (Task) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getModuleId() == null ? other.getModuleId() == null : this.getModuleId().equals(other.getModuleId()))
            && (this.getTaskName() == null ? other.getTaskName() == null : this.getTaskName().equals(other.getTaskName()))
            && (this.getTaskTier() == null ? other.getTaskTier() == null : this.getTaskTier().equals(other.getTaskTier()))
            && (this.getTaskType() == null ? other.getTaskType() == null : this.getTaskType().equals(other.getTaskType()))
            && (this.getTopParentId() == null ? other.getTopParentId() == null : this.getTopParentId().equals(other.getTopParentId()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getScheduleStartTime() == null ? other.getScheduleStartTime() == null : this.getScheduleStartTime().equals(other.getScheduleStartTime()))
            && (this.getScheduleEndTime() == null ? other.getScheduleEndTime() == null : this.getScheduleEndTime().equals(other.getScheduleEndTime()))
            && (this.getActualStartTime() == null ? other.getActualStartTime() == null : this.getActualStartTime().equals(other.getActualStartTime()))
            && (this.getActualEndTime() == null ? other.getActualEndTime() == null : this.getActualEndTime().equals(other.getActualEndTime()))
            && (this.getIsMilestone() == null ? other.getIsMilestone() == null : this.getIsMilestone().equals(other.getIsMilestone()))
            && (this.getPlanTime() == null ? other.getPlanTime() == null : this.getPlanTime().equals(other.getPlanTime()))
            && (this.getDescribe() == null ? other.getDescribe() == null : this.getDescribe().equals(other.getDescribe()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRiskStatus() == null ? other.getRiskStatus() == null : this.getRiskStatus().equals(other.getRiskStatus()))
            && (this.getFrontTaskId() == null ? other.getFrontTaskId() == null : this.getFrontTaskId().equals(other.getFrontTaskId()))
            && (this.getAmountMoney() == null ? other.getAmountMoney() == null : this.getAmountMoney().equals(other.getAmountMoney()))
            && (this.getDeletedAt() == null ? other.getDeletedAt() == null : this.getDeletedAt().equals(other.getDeletedAt()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getActualMoney() == null ? other.getActualMoney() == null : this.getActualMoney().equals(other.getActualMoney()))
            && (this.getTaskCode() == null ? other.getTaskCode() == null : this.getTaskCode().equals(other.getTaskCode()))
            && (this.getTaskDepartmentId() == null ? other.getTaskDepartmentId() == null : this.getTaskDepartmentId().equals(other.getTaskDepartmentId()))
            && (this.getTaskPriority() == null ? other.getTaskPriority() == null : this.getTaskPriority().equals(other.getTaskPriority()))
            && (this.getTaskPriorityText() == null ? other.getTaskPriorityText() == null : this.getTaskPriorityText().equals(other.getTaskPriorityText()))
            && (this.getTaskPriorityColor() == null ? other.getTaskPriorityColor() == null : this.getTaskPriorityColor().equals(other.getTaskPriorityColor()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getModuleId() == null) ? 0 : getModuleId().hashCode());
        result = prime * result + ((getTaskName() == null) ? 0 : getTaskName().hashCode());
        result = prime * result + ((getTaskTier() == null) ? 0 : getTaskTier().hashCode());
        result = prime * result + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        result = prime * result + ((getTopParentId() == null) ? 0 : getTopParentId().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getScheduleStartTime() == null) ? 0 : getScheduleStartTime().hashCode());
        result = prime * result + ((getScheduleEndTime() == null) ? 0 : getScheduleEndTime().hashCode());
        result = prime * result + ((getActualStartTime() == null) ? 0 : getActualStartTime().hashCode());
        result = prime * result + ((getActualEndTime() == null) ? 0 : getActualEndTime().hashCode());
        result = prime * result + ((getIsMilestone() == null) ? 0 : getIsMilestone().hashCode());
        result = prime * result + ((getPlanTime() == null) ? 0 : getPlanTime().hashCode());
        result = prime * result + ((getDescribe() == null) ? 0 : getDescribe().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRiskStatus() == null) ? 0 : getRiskStatus().hashCode());
        result = prime * result + ((getFrontTaskId() == null) ? 0 : getFrontTaskId().hashCode());
        result = prime * result + ((getAmountMoney() == null) ? 0 : getAmountMoney().hashCode());
        result = prime * result + ((getDeletedAt() == null) ? 0 : getDeletedAt().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getActualMoney() == null) ? 0 : getActualMoney().hashCode());
        result = prime * result + ((getTaskCode() == null) ? 0 : getTaskCode().hashCode());
        result = prime * result + ((getTaskDepartmentId() == null) ? 0 : getTaskDepartmentId().hashCode());
        result = prime * result + ((getTaskPriority() == null) ? 0 : getTaskPriority().hashCode());
        result = prime * result + ((getTaskPriorityText() == null) ? 0 : getTaskPriorityText().hashCode());
        result = prime * result + ((getTaskPriorityColor() == null) ? 0 : getTaskPriorityColor().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", type=").append(type);
        sb.append(", moduleId=").append(moduleId);
        sb.append(",moduleCode=").append(moduleCode);
        sb.append(",moduleName=").append(moduleName);
        sb.append(", taskName=").append(taskName);
        sb.append(", taskTier=").append(taskTier);
        sb.append(", taskType=").append(taskType);
        sb.append(", topParentId=").append(topParentId);
        sb.append(", parentId=").append(parentId);
        sb.append(", scheduleStartTime=").append(scheduleStartTime);
        sb.append(", scheduleEndTime=").append(scheduleEndTime);
        sb.append(", actualStartTime=").append(actualStartTime);
        sb.append(", actualEndTime=").append(actualEndTime);
        sb.append(", isMilestone=").append(isMilestone);
        sb.append(", planTime=").append(planTime);
        sb.append(", describe=").append(describe);
        sb.append(", status=").append(status);
        sb.append(", riskStatus=").append(riskStatus);
        sb.append(", frontTaskId=").append(frontTaskId);
        sb.append(", amountMoney=").append(amountMoney);
        sb.append(", deletedAt=").append(deletedAt);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", actualMoney=").append(actualMoney);
        sb.append(", taskCode=").append(taskCode);
        sb.append(", taskDepartmentId=").append(taskDepartmentId);
        sb.append(", taskPriority=").append(taskPriority);
        sb.append(", taskPriorityText=").append(taskPriorityText);
        sb.append(", taskPriorityColor=").append(taskPriorityColor);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(",children=").append(children);
        sb.append("]");
        return sb.toString();
    }
}