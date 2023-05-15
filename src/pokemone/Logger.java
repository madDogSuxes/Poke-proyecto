package pokemone;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static BufferedWriter bufferedWriter;
    private static final String logPath = "C:\\Users\\Legion\\Documents\\GitHub\\Poke-proyecto\\src\\principales\\log.log";

    public static BufferedWriter getOrCreateFileWriter() {
        if (bufferedWriter != null)
            return bufferedWriter;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(logPath, true));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return bufferedWriter;
    }

    public static void write(String line) {
        try {
            getOrCreateFileWriter().write(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close() {
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
