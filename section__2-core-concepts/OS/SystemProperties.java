
public class SystemProperties {

    public void getProps(){

        String separator = System.getProperty("file.separator");
        System.out.println( "File Seperator: "+separator);

        String osName = System.getProperty("os.name");
        System.out.println("Operating System "+osName);

        // Get and display current directory
        String currDir = System.getProperty("user.dir");
        System.out.println("Current Directory: "+ currDir);
    }

    public static void main(String[] args) {
        SystemProperties sp = new SystemProperties();
        sp.getProps();
    }
    
}
