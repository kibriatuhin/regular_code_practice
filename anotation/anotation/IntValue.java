package anotation.anotation;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(value = ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IntValue {
    int value() default 100;
    String name() default "";
}
