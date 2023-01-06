package com.shangan.trade.web.portal.controller;

import com.alibaba.fastjson.JSON;
import com.shangan.trade.goods.db.model.Goods;
import com.shangan.trade.goods.service.GoodsService;
import com.shangan.trade.web.portal.util.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class PortalController {

    @Autowired
    private GoodsService goodsService;


    /**
     * 商品详情页
     *
     * @param goodsId
     * @return
     */
    @RequestMapping("/goods/{goodsId}")
    public ModelAndView itemPage(@PathVariable long goodsId) {

        ModelAndView modelAndView = new ModelAndView();
        try {
            Goods goods = goodsService.queryGoodsById(goodsId);
            log.info("goodsId={},goods={}", goodsId, JSON.toJSON(goods));
            String showPrice = CommonUtils.changeF2Y(goods.getPrice());

            modelAndView.addObject("goods", goods);
            modelAndView.addObject("showPrice", showPrice);
            modelAndView.setViewName("goods_detail");

        } catch (Exception ex) {
            log.error("goodsDetail error", ex);
            modelAndView.setViewName("error");
        }

        return modelAndView;
    }


    /**
     * 购买请求处理
     * @param userId
     * @param goodsId
     * @return
     */
    @RequestMapping("/buy/{userId}/{goodsId}")
    public ModelAndView buy(@PathVariable long userId, @PathVariable long goodsId) {

        log.info("buy userId={}, goodsId={}", userId, goodsId);
        return null;
    }

}
