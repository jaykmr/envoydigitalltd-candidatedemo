package com.envoydigitalltd.candidatedemo.facade;

import java.util.List;

import com.envoydigitalltd.candidatedemo.dtos.ProductData;

public interface ProductFacade {

	List<ProductData> findProducts();
}
