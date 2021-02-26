package cn.how2j.trend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Project：trendParentProject
 * @Descriptive information：
 * @Package Name：cn.how2j.trend.controller
 * @Class Name：ViewController
 * @Author：yyw
 * @DateTime：2021/2/25
 * @CopyRight：上海成生科技有限公司
 */
@Controller
public class ViewController {
    @GetMapping("/")
    public String view() throws Exception {
        return "view";
    }
}
