class HelloName {
    public static void main(String[] args) {
        String name = "";
        String lastName = "";
        if (args.length > 1) {
            name = args[0];
            lastName = args[1];
        } else {
            System.out.println("Error, reikia 2 argumentu");
            System.exit(0);
        }

        System.out.println("Hello " + name + " " + lastName);

        //Output greeting
        
    }
}