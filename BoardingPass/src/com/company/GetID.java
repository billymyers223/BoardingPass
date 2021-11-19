package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class GetID {

    public int GetAnID() {
        int ID = 0, randomID = 0;
        Random rID = new Random();
        boolean match = true;
        File idFile = new File("C:\\GenSpark\\TeamProject\\GitFork\\BoardingPass\\BoardingPass\\src\\com\\TakenIDNumbers.txt");

        while(match == true) {
            match = false;
            randomID = rID.nextInt(10000000) + 1;

            try{
                FileReader reader = new FileReader(idFile);
                int readSize = reader.read();
                Scanner findID = new Scanner(idFile);
                while(findID.hasNextLine()){
                    if(randomID == Integer.valueOf(findID.nextLine())){
                        match = true;
                    }
                }
                if(match == false){
                    ID = randomID;
                    FileWriter fw = new FileWriter(idFile, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    if(readSize > -1){
                        bw.newLine();
                    }

                    bw.write(String.valueOf(ID));
                    bw.close();
                    fw.close();
                }
            } catch (Exception fileRead){
                System.out.println("Couldn't read the file");
            }

        }

        return ID;

    }

}
