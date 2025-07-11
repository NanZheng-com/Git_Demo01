package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysProductMapper;
import com.ruoyi.system.domain.SysProduct;
import com.ruoyi.system.service.ISysProductService;

/**
 * 产品管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-10
 */
@Service
public class SysProductServiceImpl implements ISysProductService 
{
    @Autowired
    private SysProductMapper sysProductMapper;

    /**
     * 查询产品管理
     * 
     * @param productId 产品管理主键
     * @return 产品管理
     */
    @Override
    public SysProduct selectSysProductByProductId(Long productId)
    {
        return sysProductMapper.selectSysProductByProductId(productId);
    }

    /**
     * 查询产品管理列表
     * 
     * @param sysProduct 产品管理
     * @return 产品管理
     */
    @Override
    public List<SysProduct> selectSysProductList(SysProduct sysProduct)
    {
        return sysProductMapper.selectSysProductList(sysProduct);
    }

    /**
     * 新增产品管理
     * 
     * @param sysProduct 产品管理
     * @return 结果
     */
    @Override
    public int insertSysProduct(SysProduct sysProduct)
    {
        sysProduct.setCreateTime(DateUtils.getNowDate());
        return sysProductMapper.insertSysProduct(sysProduct);
    }

    /**
     * 修改产品管理
     * 
     * @param sysProduct 产品管理
     * @return 结果
     */
    @Override
    public int updateSysProduct(SysProduct sysProduct)
    {
        sysProduct.setUpdateTime(DateUtils.getNowDate());
        return sysProductMapper.updateSysProduct(sysProduct);
    }

    /**
     * 批量删除产品管理
     * 
     * @param productIds 需要删除的产品管理主键
     * @return 结果
     */
    @Override
    public int deleteSysProductByProductIds(Long[] productIds)
    {
        return sysProductMapper.deleteSysProductByProductIds(productIds);
    }

    /**
     * 删除产品管理信息
     * 
     * @param productId 产品管理主键
     * @return 结果
     */
    @Override
    public int deleteSysProductByProductId(Long productId)
    {
        return sysProductMapper.deleteSysProductByProductId(productId);
    }
}
