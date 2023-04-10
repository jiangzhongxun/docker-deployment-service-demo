package com.demo.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 测试 docker 部署服务
 * @author: jiangzhongxun
 * @date 2023/4/10 14:57
 */
@Controller
public class IndexController {

    /**
     * 烟花效果
     * @return {@link String}
     */
    @RequestMapping("/")
    public String index() {
        return "YH";
    }

}
