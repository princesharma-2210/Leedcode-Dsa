import java.util.LinkedList;
import java.util.Stack;

public class List {
    int V;
    int E;
    LinkedList<Integer>[] arr;

    List(int Node) {
        V = Node;
        E = 0;
        arr = new LinkedList[Node];
        for (int i = 0; i < Node; i++) {
            arr[i] = new LinkedList<>();
        }
    }

    void addEdge(int u, int v) {
        arr[u].add(v);
        arr[v].add(u);
        E++;
    }
    void dfs(int s) {
    boolean[] vis = new boolean[V];
    Stack<Integer> st = new Stack<>();

    st.push(s);

    while (!st.isEmpty()) {
        int u = st.pop();

        if (!vis[u]) {
            vis[u] = true;
            System.out.print(u + " ");  // Print the node

            // Add neighbors to stack
            // Adding in reverse order to get same order as recursive DFS
            for (int i = arr[u].size() - 1; i >= 0; i--) {
                int v = arr[u].get(i);
                if (!vis[v]) {
                    st.push(v);
                }
            }
        }
    }
}


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " " + E + "\n");
        for (int i = 0; i < V; i++) {
            sb.append(i + ": ");
            for (int j : arr[i]) {
                sb.append(j + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        List obj = new List(5);
        obj.addEdge(0, 1);
        obj.addEdge(0, 2);
        obj.addEdge(1, 3);
        obj.addEdge(3, 2);
        obj.addEdge(2, 1);
        obj.dfs(2);
        System.out.println(obj);
    }
}
