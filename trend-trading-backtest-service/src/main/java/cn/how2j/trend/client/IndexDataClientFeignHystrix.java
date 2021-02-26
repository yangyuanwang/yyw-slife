package cn.how2j.trend.client;

import cn.how2j.trend.pojo.IndexData;
import cn.hutool.core.collection.CollectionUtil;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Project：trendParentProject
 * @Descriptive information：
 * @Package Name：cn.how2j.trend.client
 * @Class Name：IndexDataClientFeignHystrix
 * @Author：yyw
 * @DateTime：2021/2/25
 * @CopyRight：上海成生科技有限公司
 */

@Component
public class IndexDataClientFeignHystrix implements IndexDataClient {
    @Override
    public List<IndexData> getIndexData(String code) {
        IndexData indexData = new IndexData();
        indexData.setClosePoint(0);
        indexData.setDate("0000-00-00");
        return CollectionUtil.toList(indexData);
    }
}
