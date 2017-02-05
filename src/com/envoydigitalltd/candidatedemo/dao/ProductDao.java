package com.envoydigitalltd.candidatedemo.dao;

import java.util.List;

import com.envoydigitalltd.candidatedemo.models.ProductModel;

public interface ProductDao {

	List<ProductModel> findProducts();
}
