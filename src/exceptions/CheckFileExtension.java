package exceptions;

public class CheckFileExtension {
    private static String fileName = "";  
    private static int Punkte = 0;       

    public static void main(String[] args) {
        try {
            fileName = "example.java";  

            if (fileName.equals(".java")) {
                Punkte = Punkte + 1;
            }
        } catch (Exception e) {  
            Punkte = Punkte - 1;
            System.out.println("An exception occurred: " + e.getMessage());
        }

       
        System.out.println("Punkte: " + Punkte);
    }
}
