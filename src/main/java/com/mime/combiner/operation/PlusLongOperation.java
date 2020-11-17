package com.mime.combiner.operation;

import com.mime.combiner.exception.WrongDataTypeException;
import org.springframework.stereotype.Service;

@Service("PlusLongOperation")
public class PlusLongOperation implements Operation {

    @Override
    public Object apply(Object a, Object b) throws WrongDataTypeException {
        if (!(a instanceof Long && b instanceof Long)) {
            throw new WrongDataTypeException();
        }
        return Long.sum((Long) a, (Long) b);
    }
}
