import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;


public class graph_1 {
    public static void main(String[] args) {
        int graph[][]  = {{1,2},{1,3},{1,4},{2,3}};

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();


        Set<Integer> data = new HashSet<>();

        for(int i = 0;i<graph.length;i++){
               data.add(graph[i][0]);
        }
        for (int element : data) {
            System.out.print(element+"-->");
            for(int i = 0;i < graph.length;i++){
                if(element == graph[i][0]){
                
                }
            }
            System.err.println();
        }

        // for(int i = 0;i < graph.length;i++){
        //     for(int j = 0; j < graph[i].length;j++){
        //         data.add(graph[i][j]);
        //     }
        // }
        // for(int element : data){
        //     int inDegree = 0;
        //     int outDegree = 0;
        //     System.err.println(element + "->");
        //     for(int i = 0;i <graph.length;i++){
        //         if(element == graph[i][0]){
        //             outDegree++;
        //         }
        //         else if(element == graph[i][1]){
        //             inDegree++;
        //         }
        //     }
        //     System.out.println("InDegree - "+inDegree);
        //     System.out.println("outDegree - "+outDegree);
        //     System.out.println();
        // }
    }
}
