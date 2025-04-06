package com.datastreams.storeandretrieve;


import javax.xml.crypto.Data;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "/Users/siddhu/Desktop/cg-tut/Week4/Day03-IOStreams/src/main/resources/student.bin";
        // Write student details
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))){
            dos.writeInt(1);
            dos.writeUTF("Siddhu Singh");
            dos.writeDouble(4.8);

            dos.writeInt(2);
            dos.writeUTF("Prinshu Singh");
            dos.writeDouble(4.5);
        }catch (IOException e){
            e.printStackTrace();
        }

        // Read Student details
        try(DataInputStream dis = new DataInputStream(new FileInputStream(filePath))){
            System.out.println("Student Details");
            int n = 2;
            while(n-->0){
                System.out.println("Name: "+dis.readInt()+" RollNumber: "+dis.readUTF()+" GPA: "+ dis.readDouble());
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
