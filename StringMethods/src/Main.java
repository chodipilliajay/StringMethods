public class Main {
    public static void main(String[] args) {
        printInformation("Hello Ajay!");
        printInformation("");
        printInformation("\t  \n");

        String helloWorld = "Hello World";

        //String inspection methods
        System.out.printf("index of r = %d %n", helloWorld.indexOf("r"));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf("l"));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf("l"));
        System.out.printf("index of l = %d %n", helloWorld.indexOf("l", 3));
        System.out.printf("index 0f l = %d %n", helloWorld.lastIndexOf("l", 8));

        //String comparison
        String helloWorldLower = helloWorld.toLowerCase();
        if (helloWorldLower.equals(helloWorldLower)){
            System.out.println("values match exactly");
        }
        if (helloWorldLower.equalsIgnoreCase(helloWorldLower)){
            System.out.println("values match ignoring case");
        }
        if (helloWorld.startsWith("Hello")){
            System.out.println("String starts with Hello");
        }
        if (helloWorld.endsWith("World")){
            System.out.println("String ends with World");
        }
        if (helloWorld.contains("World")){
            System.out.println("String contains World");
        }
        if (helloWorld.contentEquals("Hello World")){
            System.out.println("values match exactly");
        }
    }
    public static void printInformation(String string){
        //String inspection methods
        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()){
            System.out.println("String is empty");
            return;
        }
        if (string.isBlank()){
            System.out.println("String is blank");
        }
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length-1));
    }
}