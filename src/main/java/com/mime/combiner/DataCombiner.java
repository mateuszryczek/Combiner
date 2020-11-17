package com.mime.combiner;

import com.mime.combiner.exception.WrongDataTypeException;

public interface DataCombiner {

    Object combine() throws WrongDataTypeException;

}
