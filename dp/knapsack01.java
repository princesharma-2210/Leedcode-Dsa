public class knapsack01 {
    static int recursion(int val[],int weight[], int capacity, int n){
        if(capacity==0|| n==0){
            return 0;
        }
        //include
        if(weight[n-1]<=capacity){
            int ans1= val[n-1]+recursion(val,weight,capacity-weight[n-1],n-1);
            int ans2= recursion(val, weight, capacity, n-1);
            return Math.max(ans1,ans2);
            
        }else{
            return recursion(val, weight, capacity, n-1);
        }
    }
    public static void main(String[] args){
        int val[]= {15,14,10,45,30};
        int weight[]= {2,5,1,3,4};
        System.out.println(recursion(val,weight,7,5));
    }
}
