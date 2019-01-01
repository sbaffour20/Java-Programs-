/*
* Name: Sydney Baffour
* Student ID#: 2018843693
*/

/* DO NOT IMPORT ANYTHING */

public class Bipartite
{
    private int[][] adjacencyMatrix;
    private int initialVertices;
    private int presentVerts;
    private int [] vertexList;
  ///
   
    public Bipartite(int n)
    {

        this.initialVertices = n; 
        vertexList = new int [n];
        presentVerts= 0;

        this.adjacencyMatrix = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
                adjacencyMatrix[i][j] = 0;
            }
        }
       
    }
    
    
    public void insertVertex(int u)
    {
        vertexList[presentVerts] = u ;
        presentVerts++;   
    }

    
    public void insertEdge(int u, int v)
    {
      
        if ((u >= 0 && u < initialVertices) && (v >= 0 && v < initialVertices)) {
            adjacencyMatrix[u][v] = 1;
            adjacencyMatrix[v][u] = 1;
        }
      
    
    }
    
    public void removeVertex(int v)
    {
        int index = 0; 
        for (int i=0; i<presentVerts;i++){
            if(vertexList[i] == v){
                 index=i;	
              vertexList[i] =0;
                presentVerts --;
           
            } 
        }
            for(int j = 0; j < initialVertices; j++){    
               if ( isEdge(index,j)){
                   removeEdge(index,j);
               }
               
            }           
     }
        
       
        /*
        * Input: the vertex to be removed from the graph.
        * You must remove all edges connected to v.
        */

    
    public boolean isEdge(int i, int j) {
        if ((i >= 0 && i < initialVertices) && (j >= 0 && j < initialVertices) && (adjacencyMatrix[i][j]!=0)){
            return true;
        }
        else{
          return  false;
        }    
        
    }



    public void removeEdge(int u, int v)
    {

        if ((u >= 0 && u < initialVertices) && (v >= 0 && v < initialVertices)) {
            adjacencyMatrix[u][v] = 0;
            adjacencyMatrix[v][u] = 0;
        }
        /*
        * Input: the two vertices to be disconnected.
        */
        ;
    }
    
    public boolean isBipartite()
    {
        /*
        * Output: true if the graph is bipartite, false otherwise.
        */
        
        return false;
    }
}