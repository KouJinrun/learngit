package PathTest;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class PathTest {
    public static void main(String[] args) throws IOException {
        File f = new File("/");
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getCanonicalPath());
        InputStream ip = PathTest.class.getResourceAsStream("haha.text");
        System.out.println(PathTest.class.getResource(""));
    }
}
