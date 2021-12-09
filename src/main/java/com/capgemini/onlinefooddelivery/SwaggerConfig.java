package com.capgemini.onlinefooddelivery;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){ //bean -> an object of Docket
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.capgemini.onlinefooddelivery"))
                .paths(PathSelectors.any())
                .build().apiInfo(metaData());
    }

    private ApiInfo metaData(){
        return new ApiInfoBuilder()
                .title("Online Shopping Web APIs")
                .description("\"Swagger Configuration for Online Application\"")
                .version("2.7.0")
               // .license("Apache License")
                .contact(new Contact("Sushmitha", "sprint1.com","pasupuletisushmitha2205@gmail.com"))
                .build();
    }
    public void addResourceHandler(ResourceHandlerRegistry registry)
    {
    	registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
    	registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}