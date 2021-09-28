package com.iot.util;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableSwagger2
public class Swagger2 {
        /**
         * 配置Swagger2相关的bean
         */
        @Bean
        public Docket createRestApi() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo())
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com"))// com包下所有API都交给Swagger2管理
                    .paths(PathSelectors.any()).build();
        }
        /**
         * 此处主要是API文档页面显示信息
         */
        private ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                    .title("演示项目API") // 标题
                    .description("学习Swagger2的演示项目") // 描述
                    .termsOfServiceUrl("http://www.imooc.com") // 服务网址，一般写公司地址
                    .version("1.0") // 版本
                    .build();
        }

}
