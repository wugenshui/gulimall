package com.atguigu.gulimall.product.vo;

import lombok.Data;

import java.util.List;

/**
 * @author 孟享广
 * @date 2021-01-26 4:56 下午
 * @description
 */
@Data
public class SkuItemSaleAttrVo {
    private Long attrId;
    private String attrName;
    private List<String> attrValues;
}
