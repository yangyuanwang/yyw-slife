package cn.how2j.trend.pojo;

import lombok.Data;

/**
 * @Project：trendParentProject
 * @Descriptive information：
 * @Package Name：cn.how2j.trend.pojo
 * @Class Name：Trade
 * @Author：yyw
 * @DateTime：2021/2/26
 * @CopyRight：上海成生科技有限公司
 */

@Data
public class Trade {
    private String buyDate;
    private String sellDate;
    private float buyClosePoint;
    private float sellClosePoint;
    private float rate;
}
