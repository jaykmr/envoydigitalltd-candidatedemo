package com.envoydigitalltd.candidatedemo.service;

import java.util.List;

import com.envoydigitalltd.candidatedemo.models.ProductModel;

public interface ProductService {
	
	List<ProductModel> findProducts();
}
