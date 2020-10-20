package com.xiaobu.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author xiaobu
 * @version JDK1.8.0_171
 * @date on  2020/10/19 15:50
 * @description 商品
 */
@Entity
@Data
@Table(name="goods")
public class Goods {
    @Id
    private Long goodsId;

    private String goodsName;

    private Long goodsType;

}
