import java.text.*;  
import java.util.*;  

public class SimpleDateFormatExample {  
public static void main(String[] args) {  
    
String dateString = "2023-03";
    
try {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
    Date date = dateFormat.parse(dateString);
    
    int monthsToDeduct  = 3;
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.add(Calendar.MONTH, -monthsToDeduct);
    Date newDate = calendar.getTime();
        
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM"); 
    String strDate= formatter.format(newDate);  
    System.out.println("This Month " + dateString);
    System.out.println("Prev 3 Month " + strDate);
        
} catch (ParseException e) {e.printStackTrace();}
    // String date = "2022-02";  
    // SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM");  
    // String strDate= formatter.format(date);  
    // System.out.println(strDate);  
}  
}  
