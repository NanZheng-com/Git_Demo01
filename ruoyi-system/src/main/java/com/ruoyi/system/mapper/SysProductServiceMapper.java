package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysProductService;

/**
 * 产品服务关联表管理Mapper接口
 * 
 * @author ruoyi
 * @date 2025-07-10
 */
public interface SysProductServiceMapper 
{
    /**
     * 查询产品服务关联表管理
     * 
     * @param id 产品服务关联表管理主键
     * @return 产品服务关联表管理
     */
    public SysProductService selectSysProductServiceById(Long id);

    /**
     * 查询产品服务关联表管理列表
     * 
     * @param sysProductService 产品服务关联表管理
     * @return 产品服务关联表管理集合
     */
    public List<SysProductService> selectSysProductServiceList(SysProductService sysProductService);

    /**
     * 新增产品服务关联表管理
     * 
     * @param sysProductService 产品服务关联表管理
     * @return 结果
     */
    public int insertSysProductService(SysProductService sysProductService);

    /**
     * 修改产品服务关联表管理
     * 
     * @param sysProductService 产品服务关联表管理
     * @return 结果
     */
    public int updateSysProductService(SysProductService sysProductService);

    /**
     * 删除产品服务关联表管理
     * 
     * @param id 产品服务关联表管理主键
     * @return 结果
     */
    public int deleteSysProductServiceById(Long id);

    /**
     * 批量删除产品服务关联表管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysProductServiceByIds(Long[] ids);
}
