package cn.how2j.trend.controller;

import cn.how2j.trend.Service.IndexService;
import cn.how2j.trend.config.IpConfiguration;
import cn.how2j.trend.pojo.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Project：trendParentProject
 * @Descriptive information：
 * @Package Name：cn.how2j.trend.controller
 * @Class Name：IndexController
 * @Author：yyw
 * @DateTime：2021/2/25
 * @CopyRight：上海成生科技有限公司
 */

@RestController
public class IndexController {

    @Autowired
    IndexService indexService;
    @Autowired
    IpConfiguration ipConfiguration;

    @CrossOrigin
    @GetMapping("/codes")
    public List<Index> codes() throws Exception{
        System.out.println("当前调用端口:"+ipConfiguration.getPort());
        return indexService.get();
    }
}
