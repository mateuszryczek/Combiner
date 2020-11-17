package com.mime.combiner.factory;

import com.mime.combiner.data.DataSource;

public interface DataSourceFactory {

    DataSource getProvider(String name);

}
