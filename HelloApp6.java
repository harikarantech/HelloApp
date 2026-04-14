public class HelloApp6 {
    public static void main(String[] args) {

        String name;

      
        if (args.length == 0) {
            name = "World";
        } 

        else if (args.length == 1) {
            name = args[0];
        } 
 
        else {
            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

           
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            name = nameBuilder.toString();
        }

        // Print final greeting
        System.out.println("Hello, " + name + "!");
    }
}
