
import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsnak {
    public static void knapsnak(int val[],int weight[], int total_weigth){
        int capacity= total_weigth;
        int cost= 0;
        double ratio[][] = new double[val.length][2];
        for(int i=0; i<val.length; i++){
            ratio[i][0]= i;
            ratio[i][1]= val[i]/(double)weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        for(int i=val.length-1; i>=0; i--){
            if(weight[(int)ratio[i][0]]<=capacity){
                capacity= capacity-weight[(int)ratio[i][0]];
                cost+= val[(int)ratio[i][0]];
            }
            else{
                cost+= ratio[i][1]*capacity;
                break;
            }
        }
        System.out.println("Total cost: " + cost);
        
    }
    public static void main(String[] args) {
        int val[]= {60,100,120};
        int weight[]= {10,20,30};
        int total_weigth=50;
        knapsnak(val,weight,total_weigth);
    }
}
