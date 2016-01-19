/**
* The DailyNeedService interface contains 
* bussiness logic to fetch brands and category of products.
* @author  Abhinav Kumar
* @version 1.0
* @since   2016-01-19 
*/
package com.daily.service;

import java.util.List;

import com.daily.dto.BrandDTO;
import com.daily.dto.ProductDTO;
import com.daily.dto.ProductDetailDTO;

public interface DailyNeedService {
	public List<ProductDTO> getAllProductList();

	public List<BrandDTO> getAllBrandList();
	
	public List<ProductDetailDTO> getAllProductDetailList();

}
