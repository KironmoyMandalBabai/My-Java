public class BirthdayAnimation {
    public static void main(String[] args) {
        String message = "Happy Birthday Aritriya Di..";
        int length = message.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < length; k++) {
                char ch = message.charAt(k);
                printColored(ch);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void printColored(char ch) {
        String color = "";
        switch (ch) {
            case 'H':
                color = "\u001B[31m";  // Red color
                break;
            case 'a':
                color = "\u001B[91m";  // Light red color
                break;
            case 'p':
                color = "\u001B[33m";  // Yellow color
                break;
           
            case 'y':
                color = "\u001B[32m";  // Green color
                break;
            case 'B':
                color = "\u001B[34m";  // Blue color
                break;
            case 'i':
                color = "\u001B[94m";  // Light blue color
                break;
            case 'r':
                color = "\u001B[36m";  // Cyan color
                break;
            case 't':
                color = "\u001B[35m";  // Magenta color
                break;
            case 'h':
                color = "\u001B[95m";  // Light purple color
                break;
            case 'd':
                color = "\u001B[31m";  // Red color
                break;
            case ' ':
                color = "\u001B[0m";   // Reset color
                break;
        }
        System.out.print(color + ch);
    }
}
