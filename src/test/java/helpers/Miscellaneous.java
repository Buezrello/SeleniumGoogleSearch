package helpers;

public class Miscellaneous {

    private Miscellaneous() {
    }


    public static String osName() {
        String OS = System.getProperty("os.name").toLowerCase();

        if (OS.contains("win")) {
            return "windows";
        } else if (OS.contains("nix") || OS.contains("nux") || OS.contains("aix") || OS.contains("sunos")) {
            return "unix";
        } else if (OS.contains("mac")) {
            return "mac";
        } else {
            throw new RuntimeException("OS not supported");
        }
    }
}
