package annotation;

@AnnotationTest(name = "Annotation type B")
public class B extends A {

    @Override
    public void test() {
        System.out.println("Testing B class");
    }
}
