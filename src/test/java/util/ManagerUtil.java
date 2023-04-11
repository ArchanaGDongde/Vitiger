package util;

public class ManagerUtil {

    public static void waitFor(long milliSeconds){
        try {
            Thread.sleep(milliSeconds);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
