/**
* The DailyNeedDAOImpl class implements 
* methods to fetch brands and category of products.
* @author  Abhinav Kumar
* @version 1.0
* @since   2016-01-19 
*/
package com.daily.dao.impl;

import com.daily.dao.DailyNeedDAO;
import com.daily.util.ParseConnectionUtil;

public class DailyNeedDAOImpl implements DailyNeedDAO {
	
	private final static String BRAND = "/Brand";
	private final static String PRODUCT_DETAIL = "/ProductDetail";
	private final static String PRODUCT = "/Products";
	
	private ParseConnectionUtil parse = new ParseConnectionUtil();

	@Override
	public String getAllProductList() {
		return parse.getParseConnectionObject(PRODUCT).get(String.class);
	}

	@Override
	public String getAllBrandList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAllProductDetailList() {
		// TODO Auto-generated method stub
		return null;
	}

}
