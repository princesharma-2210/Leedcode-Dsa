import java.util.ArrayList;

public class hasPath {
    public static class Edge{
        int src;
        int dest;
        int w;
        public Edge(int src,int dest,int w){
            this.src= src;
            this.dest= dest;
            this.w= w;
        }
        }
        // Move addEdge outside Edge class
        public static void addEdge(ArrayList<Edge> graph[]){
            for(int i=0; i<graph.length; i++){
                graph[i]= new ArrayList<>();
            }
            graph[0].add(new Edge(0,1,0));
            graph[0].add(new Edge(0,2,0));
    
            graph[1].add(new Edge(1, 0, 0));
            graph[1].add(new Edge(1, 3, 0));
    
            graph[2].add(new Edge(2, 0, 0));
            graph[2].add(new Edge(2, 4, 0));
    
            graph[3].add(new Edge(3, 1, 0));
            graph[3].add(new Edge(3, 4, 0));
            graph[3].add(new Edge(3, 5, 0));
    
            graph[4].add(new Edge(4, 3, 0));
            graph[4].add(new Edge(4, 2, 0));
            graph[4].add(new Edge(4, 5, 0));
    
            graph[5].add(new Edge(5, 3, 0));
            graph[5].add(new Edge(5, 4, 0));
            graph[5].add(new Edge(5, 6, 0));
    
            graph[6].add(new Edge(6, 5, 0));
        }
        public static boolean hasPath(ArrayList<Edge> graph[],int src, int dest, boolean visited[]){
            if(src==dest){
                return true;
            }
            visited[src]= true;
            for(int i=0; i<graph[src].size(); i++){
                Edge e= graph[src].get(i);
                if(!visited[e.dest] && hasPath(graph,e.dest,dest,visited)){
                    return true;
                }
            }
            return false;
        }
    public static void main(String[] args){
        int V = 7;
        ArrayList<Edge> graph[]= new ArrayList[V];
        addEdge(graph);
        boolean visited[]= new boolean[V];
        System.out.println(hasPath(graph,0,9,visited));
    }
}
