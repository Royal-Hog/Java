import java.sql.Ref;

public class Main {
public static void main(String[] args) {
try {
Reflection.invokeMethod(Reflection.createInstance("MyClass"), "alblak");
} catch (Exception e) {
e.printStackTrace();
}
}
}