package anotation.anotation;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(value = ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface StrValue {
    String value() default "";
}
