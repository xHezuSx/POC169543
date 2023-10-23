public class H20 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("slowo123");

        System.out.println(sb);
        trimToSize(sb, 4);
        System.out.println(sb);
    }

    public static void trimToSize(StringBuffer sb, int n){
        if(sb.length()<=n) return;
        sb.delete(n, sb.length());

    }

}
