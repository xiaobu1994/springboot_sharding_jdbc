package com.xiaobu.mapper;
import org.apache.ibatis.annotations.Param;
import com.xiaobu.base.mapper.MyMapper;
import com.xiaobu.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author  xiaobu
 * @date   on  2020/10/20 10:06
 * @version JDK1.8.0_171
 * @description 
 */
@Mapper
public interface GoodsMapper extends MyMapper<Goods> {

    int deleteByGoodsId(@Param("goodsId")Long goodsId);

    int deleteAll();



}