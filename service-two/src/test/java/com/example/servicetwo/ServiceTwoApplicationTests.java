package com.example.servicetwo;

import com.example.servicetwo.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceTwoApplication.class)
public class ServiceTwoApplicationTests {
    @Autowired
    ProductService productService;

    @Test
    public void should_get_name() {
        String name = productService.getName();
        assert name != null;
    }

}
