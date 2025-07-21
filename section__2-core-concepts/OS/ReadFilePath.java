import java.io.File;
import java.nio.file.Paths;
import java.nio.file.Path;
public class ReadFilePath {
    
    public void usingSeperator(){
        String sep = File.separator;

        String filePath = sep + "Users" + sep + "codewithneeraj" + sep + "StudyZone" + sep;
        System.out.println(filePath);

    }

    public void usingGet(){
        Path filePath = Paths.get("Users", "tests", "programming");
        System.out.println("Generated file path: "+ filePath);
    }
    public static void main(String[] args) {
        ReadFilePath rfp = new ReadFilePath();
        rfp.usingSeperator();
        rfp.usingGet();
    }
}
