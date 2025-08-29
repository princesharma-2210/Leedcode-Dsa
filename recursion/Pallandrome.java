public class Pallandrome {
    public static void reverse(String str,int n){
        if(n==0){
            System.out.print(str.charAt(n));
            return;
        }
        System.out.print(str.charAt(n));
        reverse(str,n-1);
    }
    public static void main(String[] args) {
        reverse("abcde",4);
    }
}
