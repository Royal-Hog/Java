enum Something {
    Something1,
    Something2,
    Something3
}
public class Main {
    public static void main(String[] args){
        
        byte byte_val = 2;
        switch (byte_val) {
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            default:
                System.out.println("value is not 1 or 2");
        }

        short short_val = 100;
        switch (short_val) {
            case 100:
                System.out.println("value is 100");
                break;
            case 500:
                System.out.println("value is 500");
                break;
            default:
                System.out.println("value is not 100 or 500");
        }

    
        int int_val = 3;
        switch (int_val) {
            case 1:
                System.out.println("value is 1");
                break;
            case 3:
                System.out.println("value is 3");
                break;
            default:
                System.out.println("value is 1 not 3");
        }

        char char_val = 'A';
        switch (char_val) {
            case 'A':
                System.out.println("Value is 'A'");
                break;
            case 'B':
                System.out.println("Value is 'B'");
                break;
            default:
                System.out.println("Value is not 'A' or 'B'");
        }

        String string_val = "Java";
        switch (string_val) {
            case "Java":
                System.out.println("value is 'Java'");
                break;
            case "Love":
                System.out.println("value is 'Love'");
                break;
            default:
                System.out.println("value is not 'Hello' or 'World'");
        }

        Something my_something = Something.Something1;
        switch (my_something) {
            case Something1:
                System.out.println("value is Something1");
                break;
            case Something2:
                System.out.println("value is Something2");
                break;
            case Something3:
                System.out.println("value is Something3");
                break;
            default:
                System.out.println("value is not Something1, Something2 или Something3");
        }
    }
}