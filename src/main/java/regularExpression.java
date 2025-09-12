public class regularExpression {


       public static void main(String[] args) {
           String str = "SenthaMarai123456";
           //removeNumbers
           System.out.println(removeNumbers(str));
            //removeChar
           System.out.println(removeChar(str));
            // removeUpperChar
           System.out.println(removeUpperChar(str));
       }
    public static String removeNumbers(String arg) {
        return arg.replaceAll("\\d","");
    }

    public static String removeChar(String arg) {
        return arg.replaceAll("[A-Za-z]","");
    }

    public static String removeUpperChar(String arg) {
        return arg.replaceAll("[A-Z]","");
    }
}
