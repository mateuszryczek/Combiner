package com.mime.combiner.operation;

import com.mime.combiner.exception.WrongDataTypeException;

public interface Operation {

    Object apply(Object a, Object b) throws WrongDataTypeException;

}
