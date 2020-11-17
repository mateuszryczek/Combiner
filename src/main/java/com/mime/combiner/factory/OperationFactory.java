package com.mime.combiner.factory;

import com.mime.combiner.operation.Operation;

public interface OperationFactory {

    Operation getOperation(String name);

}
