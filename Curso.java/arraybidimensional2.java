public class arraybidimensional2 {
            public static void main(String[] args){
        int[][] a = new int[3][2];
        for(int i=0; i<=2; i++){
           for (int j=0;j<=1;j++)
           {
               a[i][j]=(int)(Math.random()*10);
           }    
       }
       for(int i=0; i<=2; i++){
           for (int j=0;j<=1;j++)
           {
               System.out.print("["+i+"]"+"["+j+"]="+a[i][j]);
           }
           System.out.println(" ");
        }
       
        }
}
