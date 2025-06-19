package lab_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BfsTree {
    public static void main(String[] args) {

        int[][] arr = {{1,2},{0,2,3},{0,1,4},{1,4},{2,3}};

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2, 3)));       
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));       
        adj.add(new ArrayList<>(Arrays.asList(1,4)));          
        adj.add(new ArrayList<>(Arrays.asList(2,3)));      
        
        ArrayList<Integer> ans  =bfs(adj);

        for(int i : ans){
            System.out.println(i);
        }
        
    }
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj){
        
        Queue<Integer> que = new LinkedList<>();
        int size = adj.size();
        boolean[] visited = new boolean[size]; 

        ArrayList<Integer> finalAns = new ArrayList<>();

        int start = 0;
        visited[start] = true;

        que.add(start);

        while (!que.isEmpty()) {
            int current = que.poll();
            finalAns.add(current);

            for(int i : adj.get(current)){
                if(!visited[i]){
                    visited[i] = true;
                    que.add(i);
                }
            }
        }
        return finalAns;
    }
}
