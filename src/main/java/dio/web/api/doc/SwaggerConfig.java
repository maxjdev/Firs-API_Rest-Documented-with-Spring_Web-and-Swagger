package dio.web.api.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static java.util.Arrays.asList;
import java.util.HashSet;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private Contact contact() {
        return new Contact(
                "maxjdev",
                "https://www.meusite.com.br",
                "maxjramosdev@gmail.com"
        );
    }
    private ApiInfoBuilder infosApi() {
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

        apiInfoBuilder.title("Title - Rest API");
        apiInfoBuilder.description("API example of using Spring-Boot REST API");
        apiInfoBuilder.version("1.0");
        apiInfoBuilder.termsOfServiceUrl("Terms of use: Open Source");
        apiInfoBuilder.license("License");
        apiInfoBuilder.licenseUrl("https://www.meusite.com.br");
        apiInfoBuilder.contact(this.contact());

        return apiInfoBuilder;
    }
    @Bean
    public Docket detailApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket
                .select()
                .apis(RequestHandlerSelectors.basePackage("dio.web.api.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.infosApi().build())
                .consumes(new HashSet<>(asList("application/json")))
                .produces(new HashSet<>(asList("application/json")));
        return docket;
    }
}
