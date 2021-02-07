import java.util.*;

class Student{
  int regNo;
  String name;
  String doj;
  short semester;
  float gpa;
  float cgpa;
  static int count = 1 ;
  Student(){
    regNo = 0;
    name = "";
    doj = " ";
    semester = 0;
    gpa = 0;
    cgpa = 0;
    count++ ;
  }

  Student(int r, String n, String d, short s, float g,float c){
    regNo = r;
    name = n;
    doj = d;
    semester = s;
    gpa = g;
    cgpa = c;
    count++ ;
  }

  void display(){
    System.out.println("Registration Number is " + regNo);
    System.out.println("Name is " + name);
    System.out.println("Date of Joining " + doj);
    System.out.println("semester " + semester);
    System.out.println("GPA is " + gpa);
    System.out.println("CGPA is" + cgpa);
  }

  void SortSemester(int n,Student[] arr){
    int i;
    Student temp = new Student();
    for( i = 0;i<n; i++){
      for(int j=0; j<n-i-1;j++){
        if(arr[j].semester>arr[j+1].semester){
           temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
    }
  }
}

void SortCGPA(int n,Student[] arr){
  int i = 0;
  int count ;
  float t = arr[0].semester; // t=1
  Student temp = new Student();
  while(i<(n-1)){

    count = 0;
    while( (i<n) && (t == arr[i].semester) ){
      count++;
      i++;
      System.out.println(i);
    }
    if(i<n){
      t = arr[i].semester;  // t=2
    }

    System.out.println(i);

    for( int z = 0;z<count; z++){
      for(int j=i-count; j<(count-z-1)+(i-count);j++){
        if(arr[j].cgpa>arr[j+1].cgpa){
           temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
    }
  }

  }

}

void SortName(int n,Student[] arr){
  int i;
  Student temp = new Student();
  for( i = 0;i<n; i++){
    for(int j=0; j<n-i-1;j++){
      String a = arr[j].name;
      String b = arr[j+1].name;
     if(a.compareTo(b)>0){
       temp = arr[j];
      arr[j] = arr[j+1];
      arr[j+1] = temp;
        //System.out.println(a.compareTo(b));
  }
}
}
}

void spLetter(int num,Student[] arr)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Letter: ");
		String str=sc.next();
		char ch= str.charAt(0);
		for(int i=0;i<num;i++)
			if(arr[i].name.charAt(0)==ch)
				System.out.println(arr[i].name);
	}

  void spSubStr(int num, Student[] arr)
  	{
  		Scanner sc = new Scanner(System.in);
  		System.out.print("Enter the substring to be searched: ");
  		String str= sc.nextLine();
  		for(int i=0; i<num; i++)
  			if(arr[i].name.contains(str))
  				System.out.println(arr[i].name);
  	}

    void initials(int n,Student[] arr ){
      //Scanner sc = new Scanner(System.in);
      for(int i = 0;i<n;i++){

        int l = arr[i].name.indexOf(" ");
        String w =Character.toString(arr[i].name.charAt(0)) ;
        String p = Character.toString(arr[i].name.charAt(l+1)) ;
        String temp = w.toUpperCase() +"." + p.toUpperCase() + ". " ;

        int j = arr[i].name.indexOf(" " , l + 1);
        
        String h = arr[i].name.substring(j+1, arr[i].name.length());
        String t = temp + h;
        arr[i].name  = t;

      }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     Student[] arr;
     arr = new Student[5];
     System.out.println("Enter number");
     int n = sc.nextInt();
    // String[] nm = new String[5];
     //String[] dj =  new String[5];
     for(int i = 0; i<n;i++){
       System.out.println("Enter your name " );
       String nm = sc.nextLine();
       nm = sc.nextLine();  //// Juggad method
      System.out.println("Enter your date of Joining acc to greg calender");
       String dj = sc.nextLine();
       String year = dj.substring(dj.length() -2, dj.length());
       int  y = Integer.parseInt(year);
       int reg = y*100 + Student.count;
       //String temp = Integer.toString(++Student.count );
       //String reg = year.concat(temp);
       //int regno = Integer.parseInt(reg);
       System.out.println(reg);
       System.out.println("Enter your semester");
       short sm = sc.nextShort();
       System.out.println("Enter your gpa");
       float gp = sc.nextFloat();
       System.out.println("Enter your cgpa");
       float cgp = sc.nextFloat();

       arr[i] = new Student(reg,nm,dj,sm,gp,cgp);
     }
     //arr[0].spSubStr(n,arr);
    // arr[0].SortSemester(n,arr);
     //for(int i=0;i<n;i++){
      // arr[i].display();
     //}
     //arr[0].SortCGPA(n,arr);

//arr[0].SortName(n,arr);
  //  Student s = new Student();
  arr[0].initials(n,arr);
for(int i=0;i<n;i++){
  arr[i].display();
}
  }
}
