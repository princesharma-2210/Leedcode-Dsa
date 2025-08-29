public class subSequence {
    public static void recursion(String str,int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        recursion(str, idx+1, newString+str.charAt(idx));

        recursion(str,idx+1,newString);
    }
    public static void main(String[] args) {
        recursion("abc", 0, "");
    }
}
