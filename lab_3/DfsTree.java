package lab_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DfsTree {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{0,2,3},{0,1,4},{1,4},{2,3}};

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.add(new ArrayList<>(Arrays.asList(0, 2, 3)));       
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));       
        adj.add(new ArrayList<>(Arrays.asList(1,4)));          
        adj.add(new ArrayList<>(Arrays.asList(2,3)));      
        
        ArrayList<Integer> ans  =dfs(adj);

        for(int i : ans){
            System.out.println(i);
        }
    }


    static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj){
    

    Stack<Integer> stack1 = new Stack<>();
    int size = adj.size();
    boolean[] visited = new boolean[size]; 

    ArrayList<Integer> finalAns = new ArrayList<>();

    int start = 0;
    visited[start] = true;

    stack1.add(start);

    while (!stack1.isEmpty()) {
        int current = stack1.pop();
        finalAns.add(current);

        for(int i : adj.get(current)){
            if(!visited[i]){
                visited[i] = true;
                stack1.push(i);
            }
        }
    }
    return finalAns;
}
}
