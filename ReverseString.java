package PRACTICE;

public class ReverseString {

    public static String mannualStringConcat(String s) {
        String result="";
        for(int i= s.length()-1;i>=0;i--){
            result+= s.charAt(i);
            /*
             * un wanted new object is created in every interation,
             * which leads to  memory issues
             */
        }
        return result;      
    }

    public static String bestApproach(String s) {
        return new StringBuffer(s).reverse().toString();
        /*
         * Only one object is created...
         */
        
    }

    public static void main(String[] args) {
        // System.out.println(mannualStringConcat("Reverse Java"));
        System.out.println(bestApproach("Reverse Java"));
    }
    
}
