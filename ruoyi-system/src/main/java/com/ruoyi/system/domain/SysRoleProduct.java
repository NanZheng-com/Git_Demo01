package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 角色产品关联表管理对象 role_products
 * 
 * @author ruoyi
 * @date 2025-07-10
 */
public class SysRoleProduct extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增id */
    private Long id;

    /** 角色id */
    private Long roleId;

    /** 产品id */
    private Long productId;

    /** 更新时间 */
    @Excel(name = "更新时间")
    private String updateTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setRoleId(Long roleId) 
    {
        this.roleId = roleId;
    }

    public Long getRoleId() 
    {
        return roleId;
    }

    public void setProductId(Long productId) 
    {
        this.productId = productId;
    }

    public Long getProductId() 
    {
        return productId;
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
            .append("id", getId())
            .append("roleId", getRoleId())
            .append("productId", getProductId())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updataTime", getUpdateTime())
            .toString();
    }
}
