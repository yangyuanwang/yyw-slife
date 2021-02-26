package cn.how2j.trend.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Index implements Serializable{
    String code;
    String name;
}
