
public class power{
    public static void recursion(int val,int pow){
        if(val==0){
            System.out.println(pow);
            return;
        }
        pow*= 2;
        recursion(val-1,pow);
    }
    public static void main(String[] args){
        recursion(7,1);
    }
}