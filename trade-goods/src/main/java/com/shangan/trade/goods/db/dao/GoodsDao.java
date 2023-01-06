package com.shangan.trade.goods.db.dao;

import com.shangan.trade.goods.db.model.Goods;

/**
        * goods database interface
        */
public interface GoodsDao {
    /**
     * insert a good
     * @param goods
     * @return
     */
    boolean insertGoods(Goods goods);

    /**
     * delete an item by id
     * @param id
     * @return
     */
    boolean deleteGoods(long id);

    /**
     * search for the item by id
     * @param id
     * @return
     */
    Goods queryGoodsById(long id);

    /**
     * change information of goods
     * @param goods
     * @return
     */
    boolean updateGoods(Goods goods);
}
