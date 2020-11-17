package com.mime.combiner.data;

import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service("RandomLongSource")
public class RandomLongSource implements DataSource {

    @Override
    public Object get() {
        return ThreadLocalRandom.current().nextLong();
    }
}
