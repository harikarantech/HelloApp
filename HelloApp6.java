public class HelloApp6 {
    public static void main(String[] args) {

        String name;

        // Case 1: No arguments
        if (args.length == 0) {
            name = "World";
        } 
        // Case 2: One argument
        else if (args.length == 1) {
            name = args[0];
        } 
        // Case 3: Multiple arguments
        else {
            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);

                // Add comma between names
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