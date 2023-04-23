package reflection;

import java.lang.annotation.Annotation;

public class Main {

    public static void main(String[] args) {
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
