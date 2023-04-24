package annotation;

public @interface MyDefaultAnnotation {

    String name() default "Yauhen";

    int age() default 30;
}
