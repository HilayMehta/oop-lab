import java.util.*;

class TraceAndNorm{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Dimension of Matrix");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int i,j;
        int[][] a = new int[100][100];
        System.out.println("Enter the Elements of Matrix");
        for(i = 0;i<n;i++){
          for(j=0;j<m;j++){
              a[i][j] = sc.nextInt();
          }
        }
        int trace=0;
        for(i = 0;i<n;i++){
          for(j=0;j<m;j++){
            if(i==j){
              trace = trace + a[i][i];
            }
          }
        }
        int norm = 0 ;

        for(i = 0;i<n;i++){
          for(j=0;j<m;j++){
            norm = norm + a[i][j]*a[i][j];

          }
        }
        System.out.println("Trace is " + trace + " Norm is " + Math.sqrt(norm));
  }
}
