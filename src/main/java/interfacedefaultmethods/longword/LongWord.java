package interfacedefaultmethods.longword;

import java.nio.file.Path;

public class LongWord implements FileOperations {
    @Override
    public String getLongWord() {
        return readFromFile(Path.of("C:\\training\\training-solutions\\src\\test\\resources\\longword.txt")).get(0).concat(readFromFile(Path.of("C:\\training\\training-solutions\\src\\test\\resources\\longword.txt")).get(readFromFile(Path.of("C:\\training\\training-solutions\\src\\test\\resources\\longword.txt")).size() - 1));
    }
}
