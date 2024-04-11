import java.lang.reflect.*;
import java.lang.annotation.Annotation;


public class Main {
    public static void main(String[] args) {
        printClassMetadata(Person.class);
    }

    private static void printClassMetadata(Class<?> clazz) {
        System.out.println("Class Name: " + clazz.getName());

        System.out.println("Superclass: " + clazz.getSuperclass().getName());

        Class<?>[] interfaces = clazz.getInterfaces();
        if (interfaces.length > 0) {
            System.out.println("Implemented Interfaces:");
            for (Class<?> iface : interfaces) {
                System.out.println("- " + iface.getName());
            }
        }

        Field[] fields = clazz.getDeclaredFields();
        if (fields.length > 0) {
            System.out.println("Fields:");
            for (Field field : fields) {
                System.out.println("- " + field.getName());
            }
        }

        Method[] methods = clazz.getDeclaredMethods();
        if (methods.length > 0) {
            System.out.println("Methods:");
            for (Method method : methods) {
                System.out.println("- " + method.getName());
            }
        }

        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        if (constructors.length > 0) {
            System.out.println("Constructors:");
            for (Constructor<?> constructor : constructors) {
                System.out.println("- " + constructor.getName());
            }
        }

        Annotation[] annotations = clazz.getAnnotations();
        if (annotations.length > 0) {
            System.out.println("Annotations:");
            for (Annotation annotation : annotations) {
                System.out.println("- " + annotation);
            }
        }
    }
}
