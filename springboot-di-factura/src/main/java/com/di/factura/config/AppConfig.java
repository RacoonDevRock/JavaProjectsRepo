package com.di.factura.config;

import com.di.factura.models.Item;
import com.di.factura.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySources({
        @PropertySource(value = "classpath:config.properties", encoding = "UTF-8")
})
public class AppConfig {

    @Bean
    List<Item> itemsInvoice() {
        return Arrays.asList(
                new Item(new Product("Ps5", 540), 2),
                new Item(new Product("Lactoc Gamer", 18000), 5));
    }

}
