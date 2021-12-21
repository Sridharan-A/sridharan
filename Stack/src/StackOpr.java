import java.util.Arrays;
import java.util.Scanner;

public class StackOpr{
    static int []a=new int[5];
    static int top=-1;
    static void push(int i){
        if(top==4){
            System.out.println("Stack full");
        }
        else{
            a[++top]=i;
        }
    }
    static int pop(){
        if(top==-1){
            System.out.println("Stack empty");
        }
        else{
            System.out.println("popped out:"+a[top]);
            a[top--]=0;
        }

        return 0;
    }
    static void peek() {
        if (top == -1) {
            System.out.println("Stack empty");
        } else {
            System.out.println(a[top]);
        }
    }
    static void show(){
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        StackOpr s=new StackOpr();
        int y;
        do
        {
            System.out.println("1.push\t2.pop\t3.peek\t4.show\t0.exit");

            y=in.nextInt();
            switch (y) {
                case 1:int x;
                    System.out.println("Enter a value");
                    x=in.nextInt();
                    push(x);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    show();
                    break;
            }
        }while(y!=0);

    }
}
