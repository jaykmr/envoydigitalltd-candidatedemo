package com.envoydigitalltd.candidatedemo.facade;

import com.envoydigitalltd.candidatedemo.dtos.ProductData;
import com.envoydigitalltd.candidatedemo.models.ProductModel;

public class ProductRevPopulator {

	public void populate(final ProductData source, final ProductModel target)
	{
		target.setCode(source.getCode());
		target.setName(source.getName());
	}
}
