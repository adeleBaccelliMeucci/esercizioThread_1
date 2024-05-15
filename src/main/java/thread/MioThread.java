package thread;

public class MioThread extends Thread{

    public MioThread(){

    }


    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        
    }

}
