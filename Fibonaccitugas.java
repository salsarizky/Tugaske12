    public class Fibonaccitugas {
        public static void Fibonacci(int n,int a,int b,int c) {
            if (n == 0) {
                return;
            }else{
                System.out.print(a+" ");
                Fibonacci(n-1,b,c,a+b+c);
            }
        
        }
        public static void main(String[] args) {
            int n = 5;
            int a = 1;
            int b = 1;
            int c = 1;
            Fibonacci(n, a, b, c);
        }
    }