public class HelloWorld
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    public void run() {
        int i = 0;
        int k = 10;
        int a = 0;
        int b = 0;
        do {
            System.out.println("This loop will run as long as i<15");
            i += 1;
        } while (i < 15);
        k = 10;
        do { 
            System.out.println("This loop will run as long as k>5");
            k--;
        } while (k > 5);
        a = 0;
        b = 0;
        do {
            System.out.println("This loop will run as long as a<10");
            System.out.println("This loop will run as long as b<=20");
            a++;
            b++;
        } while (a < 10 && b <= 20);
    }
    
    
    public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}


