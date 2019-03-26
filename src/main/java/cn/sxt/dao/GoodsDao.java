package cn.sxt.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.sxt.pojo.Goods;
/**
 * @Description: 商品DAO
 * @Date: 2019-03-26
 * @author 汪文平
 * @version: 1.0
 *
 */
@Component
public interface GoodsDao {
	/**
	 * @Description: 查找所有的商品
	 * @return: List<Goods>返回商品对象的List集合；
	 */
	public List<Goods> findAll();

}
