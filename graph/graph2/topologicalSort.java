public class topologicalSort{
    class Edge{
        int src;
        int dst;
        public topologicalSort(int src,int dst){
            this.src= src;
            this.dst= dst;
        }
    }
    public static addEdge(ArrayList<Integer> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<Integer>();
        }
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,1));

        

    }
    public static void main(String[] args){
        int V=5;
        ArrayList<Integer>[] graph= new ArrayList(V);
        addEdge(graph)
    }
}