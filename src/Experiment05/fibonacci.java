package Experiment05;
// printing fibonacci series using a recursive function.
// Fibonacci Rules:
// f(N) = f(N-1) + f(N-2)
// f(0) = 0
// f(1) = 1
public class fibonacci {
    int n;
    public fibonacci(int num){ // parameterized constructor
        n=num;
    }
    int fib(int x){  // recursive function
        if(x==0)
            return 0;
        else if(x==1)
            return 1;
        else
            return fib(x-1)+fib(x-2);
    }
    void display(){
        System.out.print("Fibonacci series: ");
        for(int i=0;i<n;i++){
            System.out.print(fib(i)+" ");
        }
    }
    public static void main(String[] args) {
        int num=10; // Change this value to generate more or fewer terms
        fibonacci f=new fibonacci(num);
        f.display();
    }

    
}
