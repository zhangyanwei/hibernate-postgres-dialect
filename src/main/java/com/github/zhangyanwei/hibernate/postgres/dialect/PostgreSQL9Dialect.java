package com.github.zhangyanwei.hibernate.postgres.dialect;

import org.hibernate.dialect.function.SQLFunctionTemplate;
import org.hibernate.type.StandardBasicTypes;

public class PostgreSQL9Dialect extends org.hibernate.dialect.PostgreSQL9Dialect {

    public PostgreSQL9Dialect() {
        super();
        registerFunction("jsonb_contain", new SQLFunctionTemplate(StandardBasicTypes.BOOLEAN, "?1::jsonb @> ?2::jsonb"));
    }

}
