package cn.sxt.service.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.sxt.dao.GoodsDao;
import cn.sxt.pojo.Goods;
import cn.sxt.service.dao.GoodsServiceDao;

/**
 * 
 * @author Administrator
 *
 */
@Component
public class GoodsServiceDaoImpl implements GoodsServiceDao{
	
	@Autowired
	private GoodsDao dao;

	@Override
	public List<Goods> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
