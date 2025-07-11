package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysServiceMapper;
import com.ruoyi.system.domain.SysService;
import com.ruoyi.system.service.ISysServiceService;

/**
 * 服务管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-07-10
 */
@Service
public class SysServiceServiceImpl implements ISysServiceService 
{
    @Autowired
    private SysServiceMapper sysServiceMapper;

    /**
     * 查询服务管理
     * 
     * @param serviceId 服务管理主键
     * @return 服务管理
     */
    @Override
    public SysService selectSysServiceByServiceId(Long serviceId)
    {
        return sysServiceMapper.selectSysServiceByServiceId(serviceId);
    }

    /**
     * 查询服务管理列表
     * 
     * @param sysService 服务管理
     * @return 服务管理
     */
    @Override
    public List<SysService> selectSysServiceList(SysService sysService)
    {
        return sysServiceMapper.selectSysServiceList(sysService);
    }

    /**
     * 新增服务管理
     * 
     * @param sysService 服务管理
     * @return 结果
     */
    @Override
    public int insertSysService(SysService sysService)
    {
        sysService.setCreateTime(DateUtils.getNowDate());
        return sysServiceMapper.insertSysService(sysService);
    }

    /**
     * 修改服务管理
     * 
     * @param sysService 服务管理
     * @return 结果
     */
    @Override
    public int updateSysService(SysService sysService)
    {
        return sysServiceMapper.updateSysService(sysService);
    }

    /**
     * 批量删除服务管理
     * 
     * @param serviceIds 需要删除的服务管理主键
     * @return 结果
     */
    @Override
    public int deleteSysServiceByServiceIds(Long[] serviceIds)
    {
        return sysServiceMapper.deleteSysServiceByServiceIds(serviceIds);
    }

    /**
     * 删除服务管理信息
     * 
     * @param serviceId 服务管理主键
     * @return 结果
     */
    @Override
    public int deleteSysServiceByServiceId(Long serviceId)
    {
        return sysServiceMapper.deleteSysServiceByServiceId(serviceId);
    }
}
