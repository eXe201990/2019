package com.company;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Main {
      // GHERGHINA ALEXANDRU STEFAN

    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\alex\\Desktop\\Program\\src\\com\\company\\file.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(fileReader);

        String read = buffer.readLine();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String str;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }


        File file3 = new File("output.txt");
        FileWriter fileWriter = new FileWriter(file3);
        BufferedWriter bufferredWriter = new BufferedWriter(fileWriter);

        while (read != null) {
            bufferredWriter.write(read);
            bufferredWriter.newLine();
            read = buffer.readLine();
        }


        bufferredWriter.flush();
        bufferredWriter.close();

    }
}

