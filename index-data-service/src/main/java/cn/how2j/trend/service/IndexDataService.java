package cn.how2j.trend.service;

import cn.how2j.trend.pojo.IndexData;
import cn.hutool.core.collection.CollUtil;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project：trendParentProject
 * @Descriptive information：
 * @Package Name：cn.how2j.trend.service
 * @Class Name：IndexDataService
 * @Author：yyw
 * @DateTime：2021/2/25
 * @CopyRight：上海成生科技有限公司
 */

@Service
@CacheConfig(cacheNames = "index_datas")
public class IndexDataService {

    @Cacheable(key="'indexData-code-'+ #p0")
    public List<IndexData> get(String code){
        return CollUtil.toList();
    }
}
