import java.util.*;

class AdditionOfMatrix{
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Dimension of  1st matrix");
      int m = sc.nextInt();
      int n = sc.nextInt();
      System.out.println("Enter the Dimension of  2nd matrix");
      int p = sc.nextInt();
      int q = sc.nextInt();
      int i,j;
      int[][] a = new int[100][100];
      int[][] b = new int[100][100];
      int[][] c = new int[100][100];
      if(m!=p||n!=q)
    {
      System.out.println("Addition not possible !!");
      return;
    }
      System.out.println("Enter the Elements of 1st Matrix");
      for(i = 0;i<n;i++){
        for(j=0;j<m;j++){
            a[i][j] = sc.nextInt();
        }
      }
        System.out.println("Enter the Elements of 2nd Matrix");
      for(i = 0;i<p;i++){
        for(j=0;j<q;j++){
          b[i][j] = sc.nextInt();
        }
      }

      if(m!=p||n!=q)
		{
			System.out.println("Addition not possible!!");
			return;
		}

      for(i = 0;i<p;i++){
        for(j=0;j<q;j++){
          c[i][j] =  a[i][j]+ b[i][j];
        }
      }
      for(i = 0;i<p;i++){
        for(j=0;j<q;j++){
          System.out.print(c[i][j]+ " ");
        }
        System.out.println(" ");
      }
  }

}
