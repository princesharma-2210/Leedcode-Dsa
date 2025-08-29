public class MoveToAllX {
    public static void recursion(String str, int idx, int count,String newString){
        if(idx==str.length()){
            for(int i=0; i<count; i++){
                newString+= 'x';
            }
            System.out.print(newString);
            return;
        }
        if(str.charAt(idx)=='x'){
            count++;
        }
        else{
            newString+= str.charAt(idx);
        }
        recursion(str, idx+1, count, newString);
    }
    public static void main(String[] args) {
        recursion("abxxbdx",0,0,"");
    }
    
}
