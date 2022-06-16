package anotation.anotation;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(value = ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface StrValidate {
    String message() default "Invalid string value";
    int min() default 5;
    int max() default 10;
}
