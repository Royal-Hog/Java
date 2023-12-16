import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Reflection {
    public static void getClassInfo(Class<?> clas) {
        System.out.println( clas.getName()+"info");

     
        System.out.println("Fields:");
        Field[] fields = clas.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("  " + field.getType().getName() + " " + field.getName());
        }

    
        System.out.println("\nMethods:");
        Method[] methods = clas.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("  " + method.getReturnType().getName() + " " + method.getName() + "()");
        }

        System.out.println("\nConstructors:");
        Constructor<?>[] constructors = clas.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.print("  " + clas.getSimpleName() + "(");
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (int i = 0; i < parameterTypes.length; i++) {
                System.out.print(parameterTypes[i].getSimpleName());
                if (i < parameterTypes.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }

        System.out.println("Access modifier: " + clas.getModifiers());
        System.out.println("Parent class: " + clas.getSuperclass().getName());

    }
}
