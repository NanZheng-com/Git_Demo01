package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 产品管理对象 products
 * 
 * @author ruoyi
 * @date 2025-07-10
 */
public class SysProduct extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 产品id */
    private Long productId;

    /** 产品名 */
    @Excel(name = "产品名")
    private String productName;

    /** 集合名 */
    @Excel(name = "集合名")
    private String collectionName;

    public void setProductId(Long productId) 
    {
        this.productId = productId;
    }

    public Long getProductId() 
    {
        return productId;
    }

    public void setProductName(String productName) 
    {
        this.productName = productName;
    }

    public String getProductName() 
    {
        return productName;
    }

    public void setCollectionName(String collectionName) 
    {
        this.collectionName = collectionName;
    }

    public String getCollectionName() 
    {
        return collectionName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("productId", getProductId())
            .append("productName", getProductName())
            .append("collectionName", getCollectionName())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
