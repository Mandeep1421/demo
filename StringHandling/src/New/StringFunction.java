package New;


public class StringFunction {

    public static void main(String[] args) {
        String string = "abcdeffdjvfnjvn";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("\nString before reverse: "+string);
        System.out.println("String after reverse: "+reverse);
    }
    }

//hello