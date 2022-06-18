package PRACTICE;

class ReverseInteger{

    public static long reverInteger(int  input) {
        long reversed=0;
        while(input!=0){
            reversed = reversed*10 + input%10;
            input/=10;
            if(reversed>Integer.MAX_VALUE || reversed<Integer.MIN_VALUE){ 
                return 0;
            }
            /*
             * ther is chance that int number may exceed its max limit or min limit we are 
             * taking into consideration that why we are using long
             */
        }
        return reversed;
        
    }
    public static int reverseIntegerByTypeCasting(int input ) {
        // String s=String.valueOf(input);
        return  Integer.parseInt(new StringBuffer(String.valueOf(input)).reverse().toString());
 
    }
    public static int reverseIntegerByNormalStringConcat(int input) {
        String s1="";
        while(input!=0){
            s1+=input%10;
            /*
             * Every iteration new string object is created in String pool of heap 
             * its waste of memory need more work of garbage collector
             */
            input/=10;
        }
       return  Integer.parseInt(s1);
        
    }
    public static void main(String[] args) {
        // System.out.println( reverInteger(12345));
        // System.out.println( reverseIntegerByTypeCasting(12345));
        System.out.println( reverseIntegerByNormalStringConcat(12345));
    }
}
