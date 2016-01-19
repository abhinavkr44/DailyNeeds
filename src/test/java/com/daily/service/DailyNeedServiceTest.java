package com.daily.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.jaxrs.JacksonJsonProvider;

import com.daily.dto.ProductDTO;
import com.daily.dto.ProductDetailDTO;
import com.daily.service.impl.DailyNeedServiceImpl;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class DailyNeedServiceTest {
	public static void main(String[] args) {
		/*DefaultClientConfig clientConfig= new DefaultClientConfig(JacksonJsonProvider.class);
		Client client = Client.create(clientConfig);
		WebResource resource = client.resource("https://api.parse.com");
		List<BrandDTO> brand = resource.path("/1/classes/Brand")
		.header("X-Parse-Application-Id", "BODt20HM2EoHCHp5VZDQRnpSjeVUR3k6Ik32lHpo")
		.header("X-Parse-REST-API-Key", "Aqk4qWKXQ06HretvE2RjKUukGZ5EtPyY1Cw8WaK9")
		.accept(MediaType.APPLICATION_JSON)
		.get(new GenericType<List<BrandDTO>>() {});
		
		String brand = resource.path("/1/classes/ProductDetail")
				.header("X-Parse-Application-Id", "BODt20HM2EoHCHp5VZDQRnpSjeVUR3k6Ik32lHpo")
				.header("X-Parse-REST-API-Key", "Aqk4qWKXQ06HretvE2RjKUukGZ5EtPyY1Cw8WaK9")
				.accept(MediaType.APPLICATION_JSON)
				.get(String.class);
		
		JsonObject jsonObject = (JsonObject)new JsonParser().parse(brand);
		JsonElement jsonElement = jsonObject != null ? jsonObject.get("results") : null;
		//JsonArray asJsonArray = jsonElement.getAsJsonArray();
		ArrayList<ProductDetailDTO> yourArray = new Gson().fromJson(jsonElement, new TypeToken<List<ProductDetailDTO>>(){}.getType());
		System.out.println(yourArray);*/
		
		DailyNeedService dailyNeedService = new DailyNeedServiceImpl();
		List<ProductDTO> allProductList = dailyNeedService.getAllProductList();
		System.out.println(allProductList);
		
		
	}
}
