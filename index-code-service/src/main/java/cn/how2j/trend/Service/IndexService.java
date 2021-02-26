package cn.how2j.trend.Service;

import cn.how2j.trend.pojo.Index;
import cn.hutool.core.collection.CollUtil;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project：trendParentProject
 * @Descriptive information：
 * @Package Name：cn.how2j.trend.Service
 * @Class Name：IndexService
 * @Author：yyw
 * @DateTime：2021/2/25
 * @CopyRight：上海成生科技有限公司
 */

@Service
@CacheConfig(cacheNames = "indexes")
public class IndexService {

    private List<Index> indices;

    @Cacheable(key = "'all_codes'")
    public List<Index> get(){
        Index index = new Index();
        index.setName("无效指数代码");
        index.setCode("000000");
        return CollUtil.toList(index);
    }
}
