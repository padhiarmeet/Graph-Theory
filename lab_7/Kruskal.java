package lab_7;

import java.util.Arrays;

public class Kruskal {
    static int totalNodes = 4;
    static int parant[] = new int[totalNodes];
    static int Weightedges[][] = {
            { 0, 2, 6 },
            { 0, 1, 10 },
            { 0, 3, 5 },
            { 1, 3, 15 },
            { 2, 3, 4 }
    };

    public static int findParent(int index){
        if(parant[index] == index){
            return index;
        }
        return findParent(parant[index]);
    }

    public static void union(int nodeA,int nodeB){
        int parentA = findParent(nodeA);
        int parentB = findParent(nodeB);

        parant[parentA] = parentB;
    }

    
    public static void main(String[] args) {
    
        for(int i = 0; i < totalNodes ;i++){
            parant[i] = i;
        }

        Arrays.sort(Weightedges,(a,b) -> a[2] - b[2]);

        for(int i = 0;i < Weightedges.length;i++){
            int edges[] = Weightedges[i];

            if(findParent(edges[0]) != findParent(edges[1])){
                System.err.println(edges[0] + " => " + edges[1] + " weight : " + edges[2]);
                union(edges[0],edges[1]);
            }
        }
    }

}