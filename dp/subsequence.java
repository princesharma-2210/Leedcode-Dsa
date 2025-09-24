public class subsequence {
    static int sequence(String first,int idx, String result,String second,int count){
        if(idx==first.length()){
            System.out.println(result);
            if(result.compareTo(second)>0){
                count= count+1;
            }
            return count;
        }
        sequence(first,idx+1,result+first.charAt(idx),second,count);
        sequence(first,idx+1,result,second,count);
        return count;

    }
    public static void main(String[] args){
        String first= "abc";
        String sb= "";
        String second= "ab";
        int count=0;
        System.out.println(sequence(first,0,sb,second,count));

    }
}
