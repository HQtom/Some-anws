public class L125ValidPalindrome3lines {
    public static boolean isPalindrome(String s) {
        // convert String s to lowerCase with regex
        String tempString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        // Reverse the tempString
        String rev = new StringBuffer(tempString).reverse().toString();
        // check tempString to rev String
        System.out.print(rev);
        System.out.print(tempString);
        return tempString.equals(rev);
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean b = isPalindrome(s);
        System.out.print(b);
    }

}