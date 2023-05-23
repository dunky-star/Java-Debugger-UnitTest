package dunky.debugger.com;

public class Main{

    public static void main(String[] args){
        System.out.println("\nDebugging and Unit Testing in Java");
        System.out.println("===================================");

        StringUtilities utils = new StringUtilities();
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 10 ){
            utils.addChar(sb, 'a');
        }
        System.out.println(sb);

    }
}

