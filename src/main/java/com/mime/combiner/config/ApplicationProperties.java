package com.mime.combiner.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationProperties {

    @Value("${data.provider.first}")
    private String firstProvider;
    @Value("${data.provider.second}")
    private String secondProvider;
    @Value("${data.operation}")
    private String operation;

    public String getFirstProvider() {
        return firstProvider;
    }

    public String getSecondProvider() {
        return secondProvider;
    }

    public String getOperation() {
        return operation;
    }
}
