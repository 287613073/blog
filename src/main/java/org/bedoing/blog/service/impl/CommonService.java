package org.bedoing.blog.service.impl;

import java.util.List;

import org.bedoing.blog.constant.MapperConstant;
import org.bedoing.blog.orm.mybatis.MyBatisDAO;
import org.bedoing.blog.po.Dict;
import org.bedoing.blog.service.ICommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonService implements ICommonService{

	@Autowired
	private MyBatisDAO myBatisDAO;

	@Override
	public List<Dict> findAllDict() {
		return myBatisDAO.getList(MapperConstant.COMMON_findAllDict);
	}
	
	
}
