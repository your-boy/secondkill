package com.demo.support.impl;

import com.demo.support.ProductService;
import com.demo.support.dao.ProductInfo;
import com.demo.support.dto.ProductInfoDTO;
import com.demo.support.dto.Result;
import com.demo.support.mapper.ProductInfoMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: wangzhangfei5
 * @Date: 2021/5/10
 * @Version: 1.0.0
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductInfoMapper productInfoMapper;

    @Override
    public Result<Integer> createProduct(ProductInfoDTO productInfoDTO) {
        ProductInfo productInfo = new ProductInfo();
        BeanUtils.copyProperties(productInfoDTO,productInfo);
        int count =  productInfoMapper.insert(productInfo);
        BeanUtils.copyProperties(productInfoDTO,productInfo);
        return new Result<>(count);
    }

    @Override
    public Result<ProductInfoDTO> queryProduct(String productId) {
        ProductInfo productInfo = productInfoMapper.selectByProductId(productId);
        ProductInfoDTO infoDTO = new ProductInfoDTO();
        BeanUtils.copyProperties(productInfo,infoDTO);
        return new Result<>(infoDTO);
    }
}
