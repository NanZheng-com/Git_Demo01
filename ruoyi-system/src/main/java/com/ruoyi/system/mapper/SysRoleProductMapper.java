package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysRoleProduct;

/**
 * 角色产品关联表管理Mapper接口
 * 
 * @author ruoyi
 * @date 2025-07-10
 */
public interface SysRoleProductMapper 
{
    /**
     * 查询角色产品关联表管理
     * 
     * @param id 角色产品关联表管理主键
     * @return 角色产品关联表管理
     */
    public SysRoleProduct selectSysRoleProductById(Long id);

    /**
     * 查询角色产品关联表管理列表
     * 
     * @param sysRoleProduct 角色产品关联表管理
     * @return 角色产品关联表管理集合
     */
    public List<SysRoleProduct> selectSysRoleProductList(SysRoleProduct sysRoleProduct);

    /**
     * 新增角色产品关联表管理
     * 
     * @param sysRoleProduct 角色产品关联表管理
     * @return 结果
     */
    public int insertSysRoleProduct(SysRoleProduct sysRoleProduct);

    /**
     * 修改角色产品关联表管理
     * 
     * @param sysRoleProduct 角色产品关联表管理
     * @return 结果
     */
    public int updateSysRoleProduct(SysRoleProduct sysRoleProduct);

    /**
     * 删除角色产品关联表管理
     * 
     * @param id 角色产品关联表管理主键
     * @return 结果
     */
    public int deleteSysRoleProductById(Long id);

    /**
     * 批量删除角色产品关联表管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysRoleProductByIds(Long[] ids);
}
