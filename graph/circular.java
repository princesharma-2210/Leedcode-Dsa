import java.util.ArrayList;

class circular{
    public static class Edge{
        int src;
        int dest;
        public Edge(int src, int dest){
            this.src= src;
            this.dest= dest;
        }
    }
    // 0---1
    // | /
    // 2---3
    public static boolean dfsLoop(ArrayList<Edge>[] graph){
        boolean[] vis= new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
            if(dfsLoopUtils(graph,i,-1,vis)){
                return true;
            }
        }
        }
        return false;
    }
    public static boolean dfsLoopUtils(ArrayList<Edge> graph[],int curr,int parent, boolean vis[]){
        vis[curr]= true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e= graph[curr].get(i);
            if(!vis[e.dest]){
                if(dfsLoopUtils(graph, e.dest, curr, vis)){
                    return true;
                }
            }
            else if(vis[e.dest] && e.dest != parent){
                return true;
            }
        }
        return false;
    }
    public static void addEdge(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));
    }
    public static void main(String[] args){

        int v=4;
        ArrayList<Edge>[] graph= new ArrayList[v];
        addEdge(graph);
        System.out.println(dfsLoop(graph));
    }
}