import java.util.ArrayList;
import java.util.List;

public class AppWithoutUnitTC {

    public AppWithoutUnitTC() {
        System.out.println("Constructor ....");
    }

    public void method1(){
        String s="";
        List<Integer> list = new ArrayList<>();
        list.add(101);
        list.add(201);
        list.add(null);
        list = null;
        Object obj = getData();
        System.out.println(obj.toString());
    }

    public Object getData(){
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Main Method...");
        AppWithoutUnitTC ap = new AppWithoutUnitTC();
        ap.method1();
    }
}
