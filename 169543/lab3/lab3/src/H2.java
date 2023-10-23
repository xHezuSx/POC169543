public class H2 {
    public static void main(String[] args) {
        String fraza1 = "123";
        String fraza2= "123321";
        System.out.println(fraza1 +" czy jest palindromem: "+isPalindrome(fraza1));
        System.out.println(fraza2 +" czy jest palindromem: "+isPalindrome(fraza2));

    }

    public static boolean isPalindrome(String fraza){
        int l = 0;
        int r = fraza.length()-1;
        while(l<r){
            if(fraza.charAt(l) == fraza.charAt(r)) {
                return false;}
                l++;
                r--;
            }
        return true;
        }

}


