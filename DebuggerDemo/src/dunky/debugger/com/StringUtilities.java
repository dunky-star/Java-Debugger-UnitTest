package dunky.debugger.com;

public class StringUtilities {
    private int charAdded = 0;

    public void addChar(StringBuilder sBuilder,  char c){
        sBuilder.append(c);
        charAdded++;
    }

    public String upperAndPrefix(String str){
        String upper = str.toUpperCase();
        return "Prefix_" + upper;
    }

    public String addSuffix(String str){
        return str + "__Suffix";
    }
}
