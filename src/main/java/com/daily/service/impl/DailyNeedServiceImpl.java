/**
* The DailyNeedServiceImpl class implements 
* bussiness logic to fetch brands and category of products.
* @author  Abhinav Kumar
* @version 1.0
* @since   2016-01-19 
*/
package com.daily.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.daily.dao.DailyNeedDAO;
import com.daily.dao.impl.DailyNeedDAOImpl;
import com.daily.dto.BrandDTO;
import com.daily.dto.ProductDTO;
import com.daily.dto.ProductDetailDTO;
import com.daily.service.DailyNeedService;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

public class DailyNeedServiceImpl implements DailyNeedService {

	private DailyNeedDAO dailyNeedDAO = new DailyNeedDAOImpl();
	@Override
	public List<ProductDTO> getAllProductList() {
		String allProductListJson = dailyNeedDAO.getAllProductList();
		JsonObject jsonObject = (JsonObject)new JsonParser().parse(allProductListJson);
		JsonElement jsonElement = jsonObject != null ? jsonObject.get("results") : null;
		ArrayList<ProductDTO> productList = new Gson().fromJson(jsonElement, new TypeToken<List<ProductDTO>>(){}.getType());
		return productList;
	}

	@Override
	public List<BrandDTO> getAllBrandList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDetailDTO> getAllProductDetailList() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
