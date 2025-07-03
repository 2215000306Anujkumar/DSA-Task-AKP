class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0 ; i<n ;i++)
            graph.add(new ArrayList<>());

            for(int[] edge : edges){
                int x = edge[0];
                int y = edge[1];
                graph.get(x).add(y);
                graph.get(y).add(x);
            }
            boolean[] visited = new boolean[n];
        return dfs(graph , source , destination ,visited);    
    }

    public boolean dfs(List<List<Integer>> graph, int current, int destination, boolean[] visited) {
        if (current == destination) {
            return true;
        }
        visited[current] = true;
        for (int neighbour : graph.get(current)) {
            if (!visited[neighbour]) {
                if (dfs(graph,neighbour, destination, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}