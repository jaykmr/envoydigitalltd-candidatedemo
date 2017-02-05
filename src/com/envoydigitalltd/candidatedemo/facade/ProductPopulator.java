package com.envoydigitalltd.candidatedemo.facade;

import com.envoydigitalltd.candidatedemo.dtos.ProductData;
import com.envoydigitalltd.candidatedemo.models.ProductModel;

public class ProductPopulator {

	public void populate(final ProductModel source, final ProductData target)
	{
		target.setCode(source.getCode());
		target.setName(source.getName());
	}
}
