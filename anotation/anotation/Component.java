package anotation.anotation;

import java.lang.annotation.*;

@Documented
@Target(value = ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
}
