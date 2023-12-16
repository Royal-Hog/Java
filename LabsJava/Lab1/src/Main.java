public class Main {
    public static void main(String[] args)
    {
        
        String s1 = "hello";
        String s2 = "hello WORLD!!!!!!!!!!!";
        String concatenated = s1.concat(s2);
        System.out.println("concatenated: " + concatenated);

        int number = 52;
        String snumber = String.valueOf(number);
        System.out.println("strFromNumber: " + snumber);

        String[] phrase = {s1, s2};
        String joineds = String.join(" ", phrase);
        System.out.println("joinedString: " + joineds);

        boolean areEqual = s1.equals(s2);
        System.out.println("areEqual: " + areEqual);

        boolean areEqualIgnoreCase = s1.equalsIgnoreCase("HELLO");
        System.out.println("areEqualIgnoreCase: " + areEqualIgnoreCase);

        int comparisonResult = s1.compareTo(s2);
        System.out.println("comparisonResult: " + comparisonResult);

       
        boolean regionMatches = s1.regionMatches(0, "HeLLo", 0, 5);
        System.out.println("regionMatches: " + regionMatches);

        boolean startsWith = s1.startsWith("He");
        System.out.println("startsWith: " + startsWith);

        boolean endsWith = s1.endsWith("lo");
        System.out.println("endsWith: " + endsWith);

        String replacedString = s1.replace("Hello", "Hi");
        System.out.println("replacedString: " + replacedString);

        String stringWithSpaces = " Java Programming ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("trimmedString: " + trimmedString);

    
        String subString = s2.substring(7);
        System.out.println("subString: " + subString);

        char character = s1.charAt(0);
        System.out.println("character: " + character);

        int indexOfSubstring = s2.indexOf("o");
        System.out.println("indexOfSubstring: " + indexOfSubstring);

        int lastIndexOfSubstring = s2.lastIndexOf("o");
        System.out.println("lastIndexOfSubstring: " + lastIndexOfSubstring);

        String lowerCaseString = s2.toLowerCase();
        System.out.println("lowerCaseString: " + lowerCaseString);

        String upperCaseString = s2.toUpperCase();
        System.out.println("upperCaseString: " + upperCaseString);

    }
}