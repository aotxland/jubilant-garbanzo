package com.aotxland.mall.product;

import com.aotxland.mall.product.entity.BrandEntity;
import com.aotxland.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("xiaomi");
        brandEntity.setName("mi");
        brandService.save(brandEntity);
    }

}
