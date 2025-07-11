package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysProductServiceMapper;
import com.ruoyi.system.domain.SysProductService;
import com.ruoyi.system.service.ISysProductServiceService;

/**
 * 产品服务关联表管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-10
 */
@Service
public class SysProductServiceServiceImpl implements ISysProductServiceService 
{
    @Autowired
    private SysProductServiceMapper sysProductServiceMapper;

    /**
     * 查询产品服务关联表管理
     * 
     * @param id 产品服务关联表管理主键
     * @return 产品服务关联表管理
     */
    @Override
    public SysProductService selectSysProductServiceById(Long id)
    {
        return sysProductServiceMapper.selectSysProductServiceById(id);
    }

    /**
     * 查询产品服务关联表管理列表
     * 
     * @param sysProductService 产品服务关联表管理
     * @return 产品服务关联表管理
     */
    @Override
    public List<SysProductService> selectSysProductServiceList(SysProductService sysProductService)
    {
        return sysProductServiceMapper.selectSysProductServiceList(sysProductService);
    }

    /**
     * 新增产品服务关联表管理
     * 
     * @param sysProductService 产品服务关联表管理
     * @return 结果
     */
    @Override
    public int insertSysProductService(SysProductService sysProductService)
    {
        sysProductService.setCreateTime(DateUtils.getNowDate());
        return sysProductServiceMapper.insertSysProductService(sysProductService);
    }

    /**
     * 修改产品服务关联表管理
     * 
     * @param sysProductService 产品服务关联表管理
     * @return 结果
     */
    @Override
    public int updateSysProductService(SysProductService sysProductService)
    {
        sysProductService.setUpdateTime(DateUtils.getNowDate());
        return sysProductServiceMapper.updateSysProductService(sysProductService);
    }

    /**
     * 批量删除产品服务关联表管理
     * 
     * @param ids 需要删除的产品服务关联表管理主键
     * @return 结果
     */
    @Override
    public int deleteSysProductServiceByIds(Long[] ids)
    {
        return sysProductServiceMapper.deleteSysProductServiceByIds(ids);
    }

    /**
     * 删除产品服务关联表管理信息
     * 
     * @param id 产品服务关联表管理主键
     * @return 结果
     */
    @Override
    public int deleteSysProductServiceById(Long id)
    {
        return sysProductServiceMapper.deleteSysProductServiceById(id);
    }
}
