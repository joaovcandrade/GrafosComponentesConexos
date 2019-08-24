public class Main {

    public static void main(String[] args) {
        String fileName = args[0];
        while(fileName.length()!=0){
            fileName=fileName.substring(1,fileName.length());
            System.out.println();
        }
    }
}
