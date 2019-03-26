package cn.sxt.service.dao;

import java.util.List;

import cn.sxt.pojo.Goods;

public interface GoodsServiceDao {
	
	/**
	 * @Description: 查找所有的商品
	 * @return: List<Goods>返回商品对象的List集合；
	 */
	public List<Goods> findAll();

}
