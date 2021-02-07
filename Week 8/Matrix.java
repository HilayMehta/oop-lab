import java.util.*;

class RowThread implements Runnable{
  int a[];
  //string name ;
  int sum;
  //Thread t;
  RowThread(int a[]){
    this.a = a;
    sum = 0;
    //this.name = name;
    //t = new Thread(this,name);
    //t.start();
  }

  public int getRowSum(){
    return sum;
  }
  public void run(){

      for (int i: a){
        sum += i;
      }
  }
}

class Matrix{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the dimension");
      int m = sc.nextInt();
      int n = sc.nextInt();

      int a[][] = new int[m][n];
      System.out.println("Enter the Elements");
      for(int i = 0;i<m;i++){
        for(int j = 0 ;j<n;j++){
          a[i][j] =  sc.nextInt();
        }
      }

      System.out.println("The Elements are ");
      for(int i = 0;i<m;i++){
        for(int j = 0 ;j<n;j++){
        System.out.print(a[i][j] + " " ) ;
        }
        System.out.println("");
      }

    Thread thread[] = new Thread[m];
    RowThread rt[] = new RowThread[m];
      for(int i = 0;i<m;i++){
           rt[i] = new RowThread(a[i]);
           thread[i] = new Thread(rt[i]);
           thread[i].start();
      }

      int sum = 0;

      try{
        for(int i = 0;i<m;i++){
          thread[i].join();//
          System.out.println("Row wise sum" + rt[i].getRowSum());
          sum += rt[i].getRowSum();
        }
      }
      catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("\n\tTotal sum = " + sum);

  }
}
