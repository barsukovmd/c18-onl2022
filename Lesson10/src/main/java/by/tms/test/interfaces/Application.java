package by.tms.test.interfaces;

public interface Application {
    default void print() {
        System.out.println("Default method from Interface");
    }

    static void checkStatic() {
        System.out.println("Static method");
    }
}
