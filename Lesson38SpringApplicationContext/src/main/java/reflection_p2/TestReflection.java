package reflection_p2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestReflection {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //считаем из консоли названия 2ух классов и создание объектов 2ух классов с помощью рефлексии
        //Название класса_1 Название класса_2 Название_метода
        Scanner scanner = new Scanner(System.in);
        Class<?> c1 = Class.forName(scanner.next());
        Class<?> c2 = Class.forName(scanner.next());
        String methodName = scanner.next();

        Method method = c1.getMethod(methodName, c2);
        Object o1 = c1.newInstance();
        Object o2 = c2.getConstructor(String.class).newInstance("String value");
        method.invoke(o1, o2);
        System.out.println(o1);

//        Class<String> stringClass = String.class;
//        Method m = stringClass.getMethod("indexOf", String.class, int.class);//конструкция аргументов - varargs...
//        System.out.println(m);
    }
}
