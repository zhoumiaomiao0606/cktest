package com.cktest.swagger2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: cktest
 * @description
 * @author: NiuBenQi
 * @create: 2020-02-15 14:41
 **/
@Configuration
@EnableSwagger2
public class swagger2config {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInfo())
                .select()
                // 指定package下的接口显示在接口文档中
                .apis(RequestHandlerSelectors.basePackage("com.cktest.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo buildApiInfo() {
        return new ApiInfoBuilder()
                .title("swagger接口文档")
                .contact(new Contact("周苗苗",null,"741715025@qq.com"))
                .description("测试平台接口文档")
                .version("1.0")
                .build();
    }
}
