package com.mime.combiner;

import com.mime.combiner.config.ApplicationProperties;
import com.mime.combiner.exception.WrongDataTypeException;
import com.mime.combiner.factory.DataSourceFactory;
import com.mime.combiner.factory.OperationFactory;
import com.mime.combiner.operation.Operation;
import com.mime.combiner.data.DataSource;
import org.springframework.stereotype.Service;

@Service
public class DataCombinerService implements DataCombiner {

    private final DataSource firstProvider;
    private final DataSource secondProvider;
    private final Operation operation;
    private final DataSourceFactory dataSourceFactory;
    private final OperationFactory operationFactory;
    private final ApplicationProperties applicationProperties;

    public DataCombinerService(DataSourceFactory dataSourceFactory, OperationFactory operationFactory,
                               ApplicationProperties applicationProperties) {
        this.dataSourceFactory = dataSourceFactory;
        this.operationFactory = operationFactory;
        this.applicationProperties = applicationProperties;
        firstProvider = dataSourceFactory.getProvider(applicationProperties.getFirstProvider());
        secondProvider = dataSourceFactory.getProvider(applicationProperties.getSecondProvider());
        operation = operationFactory.getOperation(applicationProperties.getOperation());
    }

    public Object combine() throws WrongDataTypeException {
        return operation.apply(firstProvider.get(), secondProvider.get());
    }
}
