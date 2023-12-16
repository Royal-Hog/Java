public class Main {
    public static void main(String[] args) {
      
        Basic<Integer> objA = new Basic<>(5);
        Basic<Integer> objB = new Basic<>(10);

        System.out.println("original values:");
        System.out.println("objA: " + objA.getValue());
        System.out.println("objB: " + objB.getValue());


        Basic.exchangeValues(objA, objB);

        System.out.println("\nvalues after exchange:");
        System.out.println("objA: " + objA.getValue());
        System.out.println("objB: " + objB.getValue());
    }
}