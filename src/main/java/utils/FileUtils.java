package utils;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;


public class FileUtils {

    public static String readPropertiesFile(String filePath, String key) {
        Properties pro = new Properties();
        try {
            InputStream input = new FileInputStream(filePath);
            pro.load(input);

        } catch (Exception e){
            throw new RuntimeException(e);
        }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        String data = pro.getProperty(key);
        return data;
    }

    public static String readFromPropertiesFile(){
        Properties pro = new Properties();

        try {
            InputStream input = new FileInputStream("path of file");
            pro.load(input);
            ////  to read text file
            Files.readString(Path.of("path of file"));
            ////
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String data = pro.getProperty("add pro to read");

        return data;
    }
}
