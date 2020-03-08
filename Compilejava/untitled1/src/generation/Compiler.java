package generation;

import TDS.Utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Compiler {
    private final File file;

    public Compiler(File file) {
        this.file = file;
    }

    public void compile() throws IOException {
        Process process = Runtime.getRuntime().exec("java -jar /media/mathias/OS/Users/lemat/Documents/Scolarité/PCL/Oberti2u/Compilejava/untitled1/src/generation/microPIUP.jar -ass " + file.getAbsolutePath());
        InputStream in = process.getInputStream();
        InputStream err = process.getErrorStream();
        OutputStream out = System.out;

        Utils.dumpInToOut(in, out);
        Utils.dumpInToOut(err, out);
    }
}
