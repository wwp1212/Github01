package cn.sxt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sxt.pojo.Goods;
import cn.sxt.service.daoimpl.GoodsServiceDaoImpl;

@Controller
public class GoodsController {
	
	@Autowired
	private GoodsServiceDaoImpl service;
	
	@RequestMapping(value="/allgoods" ,produces="application/json;charset=utf-8")
	@ResponseBody
	public List<Goods> findAll(){
		return service.findAll();
	}

}
