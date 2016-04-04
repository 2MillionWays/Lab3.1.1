package ross.goncharuk;

import java.io.File;

public class MyFilesLis {
    public static void main(String[] args) {
        File file = new File("C:\\Users");
        String[] list = file.list();
        for (String s : list){
            System.out.println(s);
        }
    }
}