
import java.util.ArrayList;

public class ActivitySelection {
    public static int classroom(int start[], int end[]){
        ArrayList<Integer> arr= new ArrayList<>();
        int last_index= end[0];
        arr.add(0);
        int count=1;
        for(int i=1; i<start.length; i++){
            if(start[i]>=last_index){
                arr.add(i);
                last_index= end[i];
                count++;
            }
        }
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i));
        }
        System.out.println("");
        return count;
    }
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        
        System.out.println("Number Of Activity "+classroom(start, end));
    }
}