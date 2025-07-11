package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 服务管理对象 services
 * 
 * @author ruoyi
 * @date 2025-07-10
 */
public class SysService extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 服务id */
    private Long serviceId;

    /** 服务名 */
    private String serviceName;

    /** 更新时间 */
    @Excel(name = "更新时间")
    private String updateTime;

    public void setServiceId(Long serviceId) 
    {
        this.serviceId = serviceId;
    }

    public Long getServiceId() 
    {
        return serviceId;
    }

    public void setServiceName(String serviceName) 
    {
        this.serviceName = serviceName;
    }

    public String getServiceName() 
    {
        return serviceName;
    }

    public void setUpdateTime(String updateTime)
    {
        this.updateTime = updateTime;
    }

    public String getUpdate()
    {
        return updateTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("serviceId", getServiceId())
            .append("serviceName", getServiceName())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updataTime", getUpdateTime())
            .toString();
    }
}
