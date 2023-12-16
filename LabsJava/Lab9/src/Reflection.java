import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Reflection {
    public static Object createInstance(String className) throws Exception {
        Class<?> clas = Class.forName(className);
        Constructor<?> constructor = clas.getDeclaredConstructor();
        return constructor.newInstance();
    }

    public static void invokeMethod(Object instance, String methodName) throws Exception {
        Method method = instance.getClass().getDeclaredMethod(methodName);
        method.invoke(instance);
    }
}
