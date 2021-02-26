package cn.how2j.trend.controller;

import cn.how2j.trend.pojo.Index;
import cn.how2j.trend.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @Project：trendParentProject
 * @Descriptive information：
 * @Package Name：cn.how2j.trend.controller
 * @Class Name：IndexController
 * @Author：yyw
 * @DateTime：2021/2/24
 * @CopyRight：上海成生科技有限公司
 */

@RestController
public class IndexController {
    @Autowired
    IndexService indexService;

    @GetMapping("/freshCodes")
    public List<Index> fresh() throws Exception {
        return indexService.fresh();
    }
    @GetMapping("/getCodes")
    public List<Index> get() throws Exception {
        return indexService.get();
    }
    @GetMapping("/removeCodes")
    public String remove() throws Exception {
        indexService.remove();
        return "remove codes successfully";
    }

}
