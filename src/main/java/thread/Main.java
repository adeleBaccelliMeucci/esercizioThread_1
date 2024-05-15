package thread;

public class Main{
    public static void main(String[] args) {
        
        MioThread t = new MioThread();
        t.start();
        
        for(int i = 0; i < 10; i++){
            System.out.println("main " + i);
        }
        
        
    }
}