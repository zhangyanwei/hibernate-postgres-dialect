**Usage:**

```java
public static Specification<User> hasRoles(Role ... roles) {
    return (root, query, builder) -> builder.isTrue(
            builder.function(
                    "jsonb_contain",
                    Boolean.class,
                    root.get(User_.roles),
                    jsonExpression(builder, roles)
            )
    );
}
```