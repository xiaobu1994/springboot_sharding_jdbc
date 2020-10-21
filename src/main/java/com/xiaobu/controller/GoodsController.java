package com.xiaobu.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.dangdang.ddframe.rdb.sharding.keygen.KeyGenerator;
import com.xiaobu.entity.Goods;
import com.xiaobu.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xiaobu
 * @date 2019/1/29
 */
@RestController
public class GoodsController {

    @Autowired
    private KeyGenerator keyGenerator;

    @Autowired
    private GoodsMapper goodsMapper;

    @GetMapping("save")
    public String save(){
        for(int i= 1 ; i <= 40 ; i ++){
            Goods goods = new Goods();
            goods.setGoodsId((long) i);
            goods.setGoodsName( "shangping" + i);
            goods.setGoodsType((long) (i+1));
            goodsMapper.insert(goods);
        }
        return "success";
    }

    @GetMapping("select")
    public String select(){
        List<Goods> goods = goodsMapper.selectAll();
        JSONArray array= JSONArray.parseArray(JSON.toJSONString(goods));
        return array.toJSONString();
    }



    @GetMapping("deleteById")
    public String deleteById(long id){
        int count = goodsMapper.deleteByGoodsId(id);
        return count+"";
    }


    @GetMapping("deleteAll")
    public String deleteAll(){
        int count = goodsMapper.deleteAll();
        return count+"";
    }



}

