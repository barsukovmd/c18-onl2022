package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@DateTimeFormat
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
public @interface AnnotationTest {

    String name();
}
