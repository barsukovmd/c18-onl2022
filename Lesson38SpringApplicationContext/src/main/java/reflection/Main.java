package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
//        Person p = new Person();
//        Class person2 = p.getClass();
//        Class person3 = Class.forName("reflection.Person");
//        Method[] methods1 = person1.getMethods();
//        for (Method method : methods1) {
//            System.out.println(method.getName() + " " + method.getReturnType() + " " + Arrays.toString(method.getParameterTypes()));
//
//        }
        System.out.println("---------Fields---------");
        Class<Person> person1 = Person.class;
//        Field[] person1Fields = person1.getFields();
        Annotation[] annotations1 = person1.getAnnotations();
        for (Annotation annotation : annotations1) {
            if (annotation instanceof Author) {
                System.out.println(annotation.annotationType());
            }
        }
//        Field[] person1Fields = person1.getDeclaredFields();
//        for (Field person1Field : person1Fields) {
//            System.out.println(person1Field.getType() + " " + person1Field.getName());
//        }
//        Method[] methods2 = person2.getMethods();
//        for (Method method : methods2) {
//            System.out.println(method.getName());
//        }
//        Method[] methods3 = person3.getMethods();
//        for (Method method : methods3) {
//            System.out.println(method.getName());
//        }

//        Class<Person> person = Person.class;
//        Method[] methods = person.getMethods();
//        for (Method method : methods) {
//            System.out.println(method.getName());
//            System.out.println("----------------");
//            System.out.println(method.getReturnType());
//            System.out.println("----------------");
//            System.out.println(Arrays.toString(method.getParameterTypes()));
//            System.out.println("-------FIELD EXAMPLE------------");
//            Class<Person> personClass = Person.class;
//            Field[] fields = personClass.getFields();
//            Field[] declaredFields = personClass.getDeclaredFields();
        //Field (getFields()) - возвращает только public fields
        //Field (getDeclaredFields()) - возвращает все поля
//            for (Field declaredField : declaredFields) {
//                System.out.println(declaredField.getName());
//                System.out.println(declaredField.getType());
//            }
//            for (Field field : fields) {
//                System.out.println(field.getName());
//                System.out.println(field.getType());
//            }
        System.out.println("-------ANNOTATION EXAMPLE------------");
        Class<Person> personClassAnnotation = Person.class;
        Annotation[] annotations = personClassAnnotation.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof Author) {
                System.out.println(((Author) annotation).name());
                System.out.println(((Author) annotation).surname());
                System.out.println(((Author) annotation).age());
                System.out.println("Yes");
            }
        }
    }
}

