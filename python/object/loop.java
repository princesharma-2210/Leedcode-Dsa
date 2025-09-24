class loop{
    public static void main(String[] args){
        int nums[]= {2,5,3,9,5,3};
        int sum[]= new int[nums.length];
        sum[sum.length-1]=0;
        // int minDiff= Integer.MAX_VALUE;
        for(int i=nums.length-1; i>0; i--){
            sum[i-1]= nums[i]+sum[i];
        }
        for(int i=0; i<nums.length; i++){
            System.out.println(sum[i]);
        }

    }
}