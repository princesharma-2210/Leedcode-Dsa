public class TowerOfHanoi {
    public static void recursion(int n, String src, String help, String dst){
        if(n==1){
            System.out.println("Tranfer disk: "+n+" from "+src+" to "+dst);
            return;
        }
        recursion(n-1,src,dst,help);
        System.out.println("Transfer disk: "+n+" from "+src+" to "+dst);
        recursion(n-1,help,src,dst);
    }
    public static void main(String[] args) {
        recursion(3,"S","H","D");
    }
}
// (n-1) to helper consider as a destination 
// n from s to d 
// (n-1) from helper to destination. helper consider as a source