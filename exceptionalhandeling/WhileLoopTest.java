package exceptionalhandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Date;

public class WhileLoopTest {
    public static void main(String[] args) throws InterruptedException {

        Calendar cal = Calendar.getInstance();
     //   System.out.println(cal);
        Date currentTime = cal.getTime();
     //   System.out.println(currentTime);


        cal.add(Calendar.MINUTE, 1);
        Date endTime = cal.getTime();
        System.out.println(endTime);
        System.out.println(currentTime);




        while (currentTime.before(endTime)) {
            try {

                FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Siva Krishna\\OneDrive\\Desktop\\mountain\\krish.docx");
                System.out.println("File found!");
                break;
            } catch (FileNotFoundException e) {

                System.out.println("File not found. Retrying...");
            }


               Thread.sleep(1000);



            //  }


        }
    }
}
