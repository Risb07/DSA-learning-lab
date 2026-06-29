import java.util.Collection;
import java.util.Scanner;

class Node{
      int data ;
      Node left ;
      Node right ;
      Node(int data ){
            this.data = data ;
            left = right = null;
      }
      
}

public class GraphCode{
      int v , visited[] , g[][];

      void createGraph(int nodes){
            v = nodes;
            g = new int[v][v];
            visited = new int[v];

            Scanner sc = new Scanner(System.in);
            for(int i = 0 ; i < v ; i++ ){
                  for(int j = 0 ; j < v ; j++){
                        System.out.println("Enter the element for V"+i+" to v "+j+"(999 for infinity) : ");
                        g[i][j]= sc.nextInt();
                  }

            }

      }
      void printGraph(){
            for(int i = 0 ; i < v ; i++){
                  for(int j = 0 ; j < v ; j++){
                        System.out.print(g[i][j]);
                  }
                  System.out.println("");
            }
      }
      public void DFS(int source){
            visited[source]=1;
            System.out.println("V"+source);
            for(int i = 0 ; i < v ; i++){
                  if(g[source][i] == 1 && visited[i] != 1)
                  {
                        DFS(i);
                  }

            }
      }
      public void BFS(int source){
            int q[] = new int[v];
            
            int front = 0 ;
            int rear = -1;
            visited[source]=1;
            q[++rear] = source;
            while(front <= rear){
                  int element =  q[front++]; //dequeue
                  System.out.print("V" + element + " - ");

                  for(int i = 0 ; i < v ; i++){
                        if(g[source][i] == 1 && visited[i] != 1){
                              visited[i] = 1; //visied
                              q[++rear] = i ; //enqueue
                        }
                  }

            }
      }

      public void SortBFS(int source){
            int q[] = new q[v] ;
            int rear = -1;
            int front = 0 ;
            q[++rear] = source;
            while(front <= rear){
                  int element = q[front++];
                  System.out.print("V"+element);
                  for(int i = 0 ; i < v ; i++){
                        if(g[source][i] == 1 && visited[i] != 1){
                              visisted[i] = 1;
                              q[++rear] = i;
                        }
                  }
            }
      }

      public void SortDFS(int source){
            
      visited[v] = source;
      System.out.print("V"+source);
      for(int i = 0 ; i < v  ; i++){
            if(g[source][i] == 1 && visited[i]!=1){
                  DFS(i);
            }
      }
            
      }
      public static void main(String[] args) {
            GraphCode obj = new GraphCode();
            obj.createGraph(3);
            obj.printGraph();
            Scanner sc = new Scanner(System.in);

            
            

            
      }
}