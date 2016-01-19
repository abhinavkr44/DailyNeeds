/**
* The DailyNeedDAO interface contains 
* methods to fetch brands and category of products.
* @author  Abhinav Kumar
* @version 1.0
* @since   2016-01-19 
*/
package com.daily.dao;


public interface DailyNeedDAO {
	public String getAllProductList();

	public String getAllBrandList();
	
	public String getAllProductDetailList();

}
