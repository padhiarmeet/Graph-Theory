package self_learning;

public class peledrom_rec {
    public static void main(String[] args) {
        String s = "a";

        System.out.println(checkPeledrom(s, 0, s.length() - 1));
    }

    public static boolean checkPeledrom(String s,int start,int end){
        if(start >= end) return true;
        if(s.charAt(start) != s.charAt(end)) return false;

        return checkPeledrom(s, start + 1, end - 1);
    }
}
