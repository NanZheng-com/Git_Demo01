package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysRoleProductMapper;
import com.ruoyi.system.domain.SysRoleProduct;
import com.ruoyi.system.service.ISysRoleProductService;

/**
 * 角色产品关联表管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-10
 */
@Service
public class SysRoleProductServiceImpl implements ISysRoleProductService 
{
    @Autowired
    private SysRoleProductMapper sysRoleProductMapper;

    /**
     * 查询角色产品关联表管理
     * 
     * @param id 角色产品关联表管理主键
     * @return 角色产品关联表管理
     */
    @Override
    public SysRoleProduct selectSysRoleProductById(Long id)
    {
        return sysRoleProductMapper.selectSysRoleProductById(id);
    }

    /**
     * 查询角色产品关联表管理列表
     * 
     * @param sysRoleProduct 角色产品关联表管理
     * @return 角色产品关联表管理
     */
    @Override
    public List<SysRoleProduct> selectSysRoleProductList(SysRoleProduct sysRoleProduct)
    {
        return sysRoleProductMapper.selectSysRoleProductList(sysRoleProduct);
    }

    /**
     * 新增角色产品关联表管理
     * 
     * @param sysRoleProduct 角色产品关联表管理
     * @return 结果
     */
    @Override
    public int insertSysRoleProduct(SysRoleProduct sysRoleProduct)
    {
        sysRoleProduct.setCreateTime(DateUtils.getNowDate());
        return sysRoleProductMapper.insertSysRoleProduct(sysRoleProduct);
    }

    /**
     * 修改角色产品关联表管理
     * 
     * @param sysRoleProduct 角色产品关联表管理
     * @return 结果
     */
    @Override
    public int updateSysRoleProduct(SysRoleProduct sysRoleProduct)
    {
        return sysRoleProductMapper.updateSysRoleProduct(sysRoleProduct);
    }

    /**
     * 批量删除角色产品关联表管理
     * 
     * @param ids 需要删除的角色产品关联表管理主键
     * @return 结果
     */
    @Override
    public int deleteSysRoleProductByIds(Long[] ids)
    {
        return sysRoleProductMapper.deleteSysRoleProductByIds(ids);
    }

    /**
     * 删除角色产品关联表管理信息
     * 
     * @param id 角色产品关联表管理主键
     * @return 结果
     */
    @Override
    public int deleteSysRoleProductById(Long id)
    {
        return sysRoleProductMapper.deleteSysRoleProductById(id);
    }
}
