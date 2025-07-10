package com.ruoyi.web.controller.mcp; // 请替换为您的包路径

import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/mcp") // 定义这个Controller的基础路径
public class McpToolController {

    // 注入一个RestTemplate，这是Spring用来发HTTP请求的工具
    // 如果您的项目没有配置，需要在配置类中添加一个Bean
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 获取外部工具列表
     * @param serviceName 服务名称参数
     * @return 外部API返回的原始数据
     */
    @GetMapping("/tools")
    public Object getExternalTools(@RequestParam("serviceName") String serviceName) {
        // 1. 定义最终的目标URL
        String targetUrl = "http://172.16.200.105:10020/vector-server/serviceName/getTools?serviceName={serviceName}";

        try {
            // 2. 使用RestTemplate发起GET请求
            // Spring会自动将serviceName参数填充到URL的{serviceName}占位符中
            // 返回值直接是对方API返回的JSON字符串或对象数组，我们直接透传
            Object result = restTemplate.getForObject(targetUrl, Object.class, serviceName);
            return result;
        } catch (Exception e) {
            // 如果请求失败，打印错误日志并返回一个错误结果
            e.printStackTrace();
            return AjaxResult.error("获取外部工具失败: " + e.getMessage());
        }
    }
}