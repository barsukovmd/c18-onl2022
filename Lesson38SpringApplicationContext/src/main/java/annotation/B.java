package annotation;

@MyDefaultAnnotation
public class B extends A {

    //    @SuppressWarnings({"Test B is no more active"})
    @Override
    @Deprecated
    public void test() {
        System.out.println("Testing B class");
    }
}
