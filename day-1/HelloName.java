/*
nauja programa
*/
class HelloName {
    public static void main(String[] args) {
        //Output prompt
        System.out.print("Enter Your name: ");
        //Assing inout to a variable
        String name = System.console().readLine();
        
        System.out.print("Enter Your last name: ");
        //Assing inout to a variable
        String lastName = System.console().readLine();
        //Output greeting
        System.out.println("Hello " + name + " " + lastName);
    }
}