package com.mime.combiner.config;

import com.mime.combiner.factory.DataSourceFactory;
import com.mime.combiner.factory.OperationFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public FactoryBean<Object> dataProviderLocatorFactoryBean() {
        ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
        factoryBean.setServiceLocatorInterface(DataSourceFactory.class);
        return factoryBean;
    }

    @Bean
    public FactoryBean<Object> operationLocatorFactoryBean() {
        ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
        factoryBean.setServiceLocatorInterface(OperationFactory.class);
        return factoryBean;
    }

}
