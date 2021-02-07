import java.util.*;


class Stack<T>{
  int n;
  int top;
  public T a[];
  Stack(int n){
    n=this.n;
    a = (T[]) new Object[n];
    top = -1;

    //a = (T []) new Object[n];
  }

  public boolean isEmpty () {
		return (top == -1);
	}

  void push(T value){
    if(top == a.length -1){
      System.out.println(" Stack is Full");
      return;
    }
    //top++;
    a[++top] = value;
  }

  T pop(){
    T x;
    if(top ==-1){
      System.out.println("Stack is Empty");
      return null;
    }
    x = a[top--];
    return x;
  }

  @Override
	public String toString () {
		if (top == -1)
			return "STACK IS EMPTY!";
		String str = "";
		for (int i = 0; i <= top; ++i)
			str += "\t" + a[i];
		return str;
	}
}

class Student{
  Double cgpa;
  String name;


  public void input () {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\tEnter student name: ");
		name = sc.nextLine();
		System.out.print("\tEnter student cgpa: ");
		cgpa = sc.nextDouble();
	}
  @Override
	public String toString () {
		return " STUDENT NAME: " + name + " CGPA: " + cgpa + "\n";
	}
}


class Employee{
  String name;
  String idno;
  public void input () {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\tEnter employee name: ");
		name = sc.nextLine();
		System.out.print("\tEnter employee id: ");
		idno = sc.nextLine();
	}

	@Override
	public String toString () {
		return "\n\t| EMPLOYEE\n\t| NAME: " + name + "\n\t| IDNO: " + idno + "\n";
	}
}


class StackGen{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of stack");
    int n= sc.nextInt();
    Stack <Student> sstack= new Stack <Student>(n);
    Stack <Employee> estack= new Stack <Employee>(n);

    int choice;
    do{
      System.out.print("\n\t1. Student\n\t2. Employee\n\tCHOICE: ");
			choice = sc.nextInt();
      if (choice < 1 || choice > 2) {
				System.out.println("Invalid Choice!");
				System.exit(0);
			}
      int stch;
      do{
        System.out.print("\n\t1. Push\n\t2. Pop\n\t3. Display\n\tChoice: ");
				stch = sc.nextInt();

        if (stch < 1 || stch > 3)
					break;

      switch (stch) {
        case 1: if (choice == 1) {
						Student stud = new Student();
						stud.input();
						sstack.push(stud);
					}
					else {
						Employee empl = new Employee();
						empl.input();
						estack.push(empl);
					}
          break;
      case 2:  if (choice == 1) {
						Student stud = sstack.pop();
						if (stud != null)
							System.out.print("\nPopped: " + stud);
					}
					else {
						Employee empl = estack.pop();
						if (empl != null)
							System.out.print("\nPopped: " + empl);
					}
          break;
      case 3: if (choice == 1) {
					if (!sstack.isEmpty())
						System.out.println("\n\tCurrent Stack: \n" + sstack);
				}
				else {
					if (!estack.isEmpty())
						System.out.println("\n\tCurrent Stack: \n" + estack);
				}
        break;


      }
    }while(stch>=1 && stch<=3);
    }while (choice == 1 || choice == 2);

  }
}


/*import java.util.Scanner;

class Stack<Type> {

	private Type arr[];
	private int tos;

	public Stack (int n) {
		tos = -1;
		arr = (Type []) new Object[n];
	}

	public boolean isEmpty () {
		return (tos == -1);
	}

	public void push (Type item) {
		if (tos == arr.length - 1) {
			System.out.println("\n\tSTACK OVERFLOW!");
			return;
		}
		arr[++tos] = item;
	}

	public Type pop () {
		if (tos == -1) {
			System.out.println("\n\tSTACK UNDERFLOW!");
			return null;
		}
		return arr[tos--];
	}

	@Override
	public String toString () {
		if (tos == -1)
			return "STACK IS EMPTY!";
		String str = "";
		for (int i = 0; i <= tos; ++i)
			str += "\t" + arr[i];
		return str;
	}

}

class Student {

	private String name;
	private double cgpa;

	public void input () {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\tEnter student name: ");
		name = sc.nextLine();
		System.out.print("\tEnter student cgpa: ");
		cgpa = sc.nextDouble();
	}

	@Override
	public String toString () {
		return "\n\t| STUDENT\n\t| NAME: " + name + "\n\t| CGPA: " + cgpa + "\n";
	}

}

class Employee {

	private String name;
	private String idno;

	public void input () {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\tEnter employee name: ");
		name = sc.nextLine();
		System.out.print("\tEnter employee id: ");
		idno = sc.nextLine();
	}

	@Override
	public String toString () {
		return "\n\t| EMPLOYEE\n\t| NAME: " + name + "\n\t| IDNO: " + idno + "\n";
	}

}

public class StackGen {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\n\tEnter the size of the stacks: ");
		int n = sc.nextInt();
		Stack <Student> sstack = new Stack<>(n);
		Stack <Employee> estack = new Stack<>(n);

		int choice;
		do {
			System.out.print("\n\t1. Student\n\t2. Employee\n\tCHOICE: ");
			choice = sc.nextInt();

			if (choice < 1 || choice > 2) {
				System.out.println("Invalid Choice!");
				System.exit(0);
			}

			int stch;
			do {
				System.out.print("\n\t1. Push\n\t2. Pop\n\t3. Display\n\tChoice: ");
				stch = sc.nextInt();

				if (stch < 1 || stch > 3)
					break;

				if (stch == 1) {
					if (choice == 1) {
						Student stud = new Student();
						stud.input();
						sstack.push(stud);
					}
					else {
						Employee empl = new Employee();
						empl.input();
						estack.push(empl);
					}
				}
				else if (stch == 2) {
					if (choice == 1) {
						Student stud = sstack.pop();
						if (stud != null)
							System.out.print("\nPopped: " + stud);
					}
					else {
						Employee empl = estack.pop();
						if (empl != null)
							System.out.print("\nPopped: " + empl);
					}
				}
				if (choice == 1) {
					if (!sstack.isEmpty())
						System.out.println("\n\tCurrent Stack: \n" + sstack);
				}
				else {
					if (!estack.isEmpty())
						System.out.println("\n\tCurrent Stack: \n" + estack);
				}

			} while (stch >= 1 && stch <= 3);

		} while (choice == 1 || choice == 2);

	}

}*/
