import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask{

    public MyTask(){
        //TODO
        //check if a new file has been added to the specified directory if yes do the below, if no continue
        //Do add your logic here
        //include opening of files(.csv and .xml) and validations as per Production Support requirements
        //open oracle support library for java and add files data in the table
        //Then close the file/files
    }

    @Override
    public void run() {
        System.out.println("Hi see you after 10 seconds");
    }

}


public class Main{
    public static void main(String[] args){

        Timer t = new Timer();
        MyTask mTask = new MyTask();
        // This task is scheduled to run every 10 seconds

        t.scheduleAtFixedRate(mTask, 0, 10000);
    }

}

//P.S - Shut down gracefully is not done , let me do some research on it.