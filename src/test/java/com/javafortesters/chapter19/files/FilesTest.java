package com.javafortesters.chapter19.files;

import org.junit.Ignore;
import org.junit.Test;

import java.io.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FilesTest {
    @Test
    public void writeTheTestDataFile() throws IOException {
        File outputFile = new File("wisenschaft.txt");
        outputFile.createNewFile();
        PrintWriter print = new PrintWriter(outputFile);
        print.println("Hello World");
        print.close();
    }

    @Test
    public void outputFileReader() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("wisenschaft.txt"));

        try {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            reader.close();
        }
    }

    @Ignore
    @Test
    public void aNewFileDoesNotCreateAFile() throws IOException {
        File aTempFile = new File("d:/tempJavaForTesters.txt");
        assertThat(aTempFile.exists(), is(false));
        aTempFile.createNewFile();
        assertThat(aTempFile.exists(), is(true));
        aTempFile.delete();
        assertThat(aTempFile.exists(), is(false));
    }

    @Test
    public void listTempDirectory() {
        File tempDir = new File(System.getProperty("java.io.tmpdir"));
        String[] fileList = tempDir.list();
        for (String a : fileList) {
            System.out.println(a);
        }
    }
}

