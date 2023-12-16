public class Main {
    public static void main(String[] args) {
    
        boolean a = true;
        boolean b = false;

        System.out.println("logical AND (&&): " + (a && b));
        System.out.println("logical OR (||): " + (a || b));
        System.out.println("logical NOT (!a): " + (!a));

      
        int x = 5;
        int y = 10;
        int min = (x < y) ? x : y;
        System.out.println("minimal value: " + min);
        
        int num1 = 5;  
        int num2 = 3;  

        System.out.println("bitwise AND (&): " + (num1 & num2));  
        System.out.println("bitwise OR (|): " + (num1 | num2));  
        System.out.println("bitwise exclusive OR (^): " + (num1 ^ num2)); 
        System.out.println("bitwise NOT (~) for num1: " + (~num1));  

        int num3 = 16;  

        System.out.println("shift to the right by 2 positions (>>): " + (num3 >> 2)); 
        System.out.println("shift to the left by 3 positions (<<): " + (num3 << 3)); 
        System.out.println("logical shift to the right by 2 positions (>>>): " + (num3 >>> 2));  
    }
}