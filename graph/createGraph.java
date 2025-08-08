import java.util.*;

public class createGraph {
    static class Edge {
        int src;
        int des;
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.des = d;
            this.wt = w;
        }
    }

    public static void main(String[] args) {
        int v = 5;

        ArrayList<Edge>[] arr = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            arr[i] = new ArrayList<>();
        }

        arr[0].add(new Edge(0, 1, 10));
        arr[2].add(new Edge(2, 3, 5));

        for (Edge e : arr[0]) {
            System.out.println("arr[0]: " + e.src + " -> " + e.des + " (wt=" + e.wt + ")");
        }
        for (Edge e : arr[2]) {
            System.out.println("arr[2]: " + e.src + " -> " + e.des + " (wt=" + e.wt + ")");
        }
    }
}
