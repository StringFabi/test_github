package queue;
 
public class PasswordTester {
 
    private static  int min = 8;
    private static  String secial = "!@#$%^&*()_-+={}[]|;':\"<>,.?/";
 
    public static boolean isGoodPassword(String password) {
        if (password.length() < min) {
            System.err.println("Password must be at least " + min + " characters long.");
            return false;
        }
 
        boolean gro�buchstaben = false;
        boolean kleinbuchstaben = false;
        boolean zahl= false;
        boolean besonderezeichen = false;
 
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
            	gro�buchstaben = true;
            } else if (Character.isLowerCase(c)) {
            	kleinbuchstaben = true;
            } else if (Character.isDigit(c)) {
            	zahl = true;
            } else if (secial.contains(String.valueOf(c))) {
            	besonderezeichen = true;
            }
        }
 
        if (!gro�buchstaben) {
            System.err.println("Password must contain at least one uppercase letter.");
            return false;
        }
 
        if (!kleinbuchstaben) {
            System.err.println("Password must contain at least one lowercase letter.");
            return false;
        }
 
        if (!zahl) {
            System.err.println("Password must contain at least one digit.");
            return false;
        }
 
        if (!besonderezeichen) {
            System.err.println("Password must contain at least one special character.");
            return false;
        }
 
        return true;
    }
 
    public static void main(String[] args) {
        String password = "Haven_!8";
        boolean isGood = isGoodPassword(password);
 
        if (isGood) {
            System.out.println("Password is strong.");
        } else {
            System.out.println("Password is weak.");
        }
    }
}