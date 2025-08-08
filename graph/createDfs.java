import java.util.ArrayList;

public class createDfs {
     static class Edge{
        int src;
        int dst;
        int wrt;
        Edge(int src, int dst, int wrt){
            this.src = src;
            this.dst = dst;
            this.wrt = wrt;
        }
    }
    static void addEdge(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<>();
        
         }
         graph[0].add(new Edge(0,1,0));
         graph[0].add(new Edge(0, 2,0));

         graph[1].add(new Edge(1,0,0));
         graph[1].add(new Edge(1, 3,0));

         graph[2].add(new Edge(2,0,0));
         graph[2].add(new Edge(2, 4,0));

         graph[3].add(new Edge(3,1,0));
         graph[3].add(new Edge(3, 4,0));
         graph[3].add(new Edge(3, 5,0));

         graph[4].add(new Edge(4,2,0));
         graph[4].add(new Edge(4, 3,0));
         graph[4].add(new Edge(4, 5,0));

         graph[5].add(new Edge(5,3,0));
         graph[5].add(new Edge(5, 4,0));
         graph[5].add(new Edge(5, 6,0));

         graph[6].add(new Edge(6, 5,0));

    }
    static void dfs(ArrayList<Edge>[] graph,int curr, boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0; i<graph[curr].size(); i++){
            Edge e= graph[curr].get(i);
            if(!vis[e.dst]){
            dfs(graph,e.dst,vis);
            }
        }
    }
    public static void main(String[] args){
        int v=7
        ;
        ArrayList<Edge>[] graph = new ArrayList[v];
        addEdge(graph);
        boolean vis[] = new boolean[v];
        dfs(graph,0,vis);

    }
}
