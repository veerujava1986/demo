package com.example.demo.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Autowired
    RestTemplate template;
    
    @Bean
    public EmployeeService getEmployeeService(){
        List<HttpMessageConverter<?>> messageConverters = template.getMessageConverters();
        return new EmployeeService();
    }


    @Bean
    public List<String> allowedFileExtension()
    {
        List<String> allowableFileExtensions = new ArrayList<String>();
        allowableFileExtensions.add("txt");
        allowableFileExtensions.add("pdf");
        allowableFileExtensions.add("doc");
        allowableFileExtensions.add("docx");
        allowableFileExtensions.add("xls");
        allowableFileExtensions.add("xlsx");
        allowableFileExtensions.add("png");
        allowableFileExtensions.add("gif");
        allowableFileExtensions.add("jpg");

        return allowableFileExtensions;
    }
}
