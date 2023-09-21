package com.example.reactive.mongo.utils;

import org.springframework.beans.BeanUtils;

import com.example.reactive.mongo.dto.ProductDto;
import com.example.reactive.mongo.entity.Product;

public class ConversionUtils {

	public static ProductDto entityToDto(Product product) {
		ProductDto productDto = new ProductDto();
		BeanUtils.copyProperties(product, productDto);
		return productDto;
	}

	public static Product dtoToEntity(ProductDto productDto) {
		Product product = new Product();
		BeanUtils.copyProperties(productDto, product);
		return product;
	}
}
