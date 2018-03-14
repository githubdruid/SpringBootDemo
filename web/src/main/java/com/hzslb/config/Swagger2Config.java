package com.hzslb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration//标准配置类
@EnableSwagger2//开启在线接口文档
public class Swagger2Config {
    @Bean
    public Docket controllerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("文档标题")
                        .description("描述说明")
                        .contact(new Contact("联系我们", "www.baidu.com", "yxltdjybn@163.com"))
                        .version("1.0")
                        .build())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hzslb.web"))//限制生产文档路径
                .paths(PathSelectors.any())
                .build();
    }
}
