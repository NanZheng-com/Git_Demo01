package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysService;

/**
 * 服务管理Service接口
 * 
 * @author ruoyi
 * @date 2025-07-10
 */
public interface ISysServiceService 
{
    /**
     * 查询服务管理
     * 
     * @param serviceId 服务管理主键
     * @return 服务管理
     */
    public SysService selectSysServiceByServiceId(Long serviceId);

    /**
     * 查询服务管理列表
     * 
     * @param sysService 服务管理
     * @return 服务管理集合
     */
    public List<SysService> selectSysServiceList(SysService sysService);

    /**
     * 新增服务管理
     * 
     * @param sysService 服务管理
     * @return 结果
     */
    public int insertSysService(SysService sysService);

    /**
     * 修改服务管理
     * 
     * @param sysService 服务管理
     * @return 结果
     */
    public int updateSysService(SysService sysService);

    /**
     * 批量删除服务管理
     * 
     * @param serviceIds 需要删除的服务管理主键集合
     * @return 结果
     */
    public int deleteSysServiceByServiceIds(Long[] serviceIds);

    /**
     * 删除服务管理信息
     * 
     * @param serviceId 服务管理主键
     * @return 结果
     */
    public int deleteSysServiceByServiceId(Long serviceId);
}
