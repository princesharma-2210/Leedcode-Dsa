

class format{
    int V;
    int E;
    int arr[][];
    format(int Node){
        V=Node;
        E=0;
        arr= new int[Node][Node];
    }
    void addEdge(int u,int v){
        arr[u][v]=1;
        arr[v][u]=1;
        E++;
    }
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append(V+" "+E+"\n");
        for(int i=0; i<V; i++){
            sb.append(i+" ");
            for(int j: arr[i]){
                sb.append(j+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        format obj= new format(5);
        obj.addEdge(0,1);
         obj.addEdge(0,2);
          obj.addEdge(1,3);
           obj.addEdge(3,2);
            obj.addEdge(2,1);
            obj.addEdge(3,1);
            obj.addEdge(3,1);
            
            System.out.println(obj);
    }
}