public class Palindrome {
    public static boolean isPalingdrome(String str, int start, int end){
        if(start >= end){
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        return isPalingdrome(str, start+1, end-1);
    }
    public static void main(String[] args) {
        String str = "malam";
        Palindrome p = new Palindrome();
        boolean result = p.isPalingdrome(str, 0, str.length() - 1);
        if(result){
            System.out.println(str+" adalah Palindrome");
        }else{
            System.out.println(str+" bukan Palindrome");
        }
    }
}
