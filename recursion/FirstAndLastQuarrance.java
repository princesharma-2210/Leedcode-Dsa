public class FirstAndLastQuarrance{
    public static int first= -1;
    public static int last= -1;
    public static void recursion(String str,int idx,char elm){
        if(idx==str.length()){
            System.out.print("First:"+first+"  Last: "+last);
            return;
        }
        if(str.charAt(idx)==elm){
            if(first==-1){
                first=idx;
            }else{
                last= idx;
            }
        }
        recursion(str, idx+1, elm);
    }
    public static void main(String[] args){
        recursion("abadubfbfva",0,'a');
    }
}