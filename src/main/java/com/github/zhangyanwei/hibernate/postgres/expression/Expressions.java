package com.github.zhangyanwei.hibernate.postgres.expression;

import org.hibernate.jpa.criteria.CriteriaBuilderImpl;
import org.hibernate.jpa.criteria.expression.LiteralExpression;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;

import static com.github.zhangyanwei.hibernate.postgres.utils.Json.writeValueAsString;

public final class Expressions {

    public static Expression<String> jsonExpression(CriteriaBuilder builder, Object value) {
        return new LiteralExpression<>((CriteriaBuilderImpl) builder, String.class, writeValueAsString(value));
    }

}
