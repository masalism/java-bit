public class Java5 {
    public static void main(String[] args) {
        int day;
        System.out.print("Input a first number: ");
        day = Integer.valueOf(System.console().readLine());
        
        String dayName = "";
        switch (day) {
            case 1: 
                dayName = "Monday"; 
                break;
            case 2: 
                dayName = "Tuesday"; 
                break;
            case 3: 
                dayName = "Wednesday"; 
                break;
            case 4: 
                dayName = "Thursday"; 
                break;
            case 5: 
                dayName = "Friday"; 
                break;
            case 6: 
                dayName = "Saturday"; 
                break;
            case 7: 
                dayName = "Sunday"; 
                break;
            default:dayName = "Invalid day range";
        }
        System.out.println(dayName);
    }
}