package codewars;

public class FindNeedle {
    public static void main(String[] args) {
        String result = findNeedle(new Object[] {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"});
        System.out.println(result);
    }
    public static String findNeedle(Object[] haystack) {
        // Your code here
        int index = 0;
        for(Object obj:haystack){
            if(String.valueOf(obj).equals("needle")){
                return "found the needle at position "+index;
            }
            index++;
        }
        return "not found";
    }
}
