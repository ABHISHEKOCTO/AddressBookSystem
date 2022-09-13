package com.bridgelabz.addressBook;

import java.io.*;

public class AddressBookIO {
    public static final String FILE_PATH_NAME = "D:\\intelliJ\\AddBook\\AddressBookSystem2\\AddressBookSystem\\src\\main\\resources\\addressBook.txt";
    static File file = new File(FILE_PATH_NAME);

    public static void createFile() {
        try{
            file.createNewFile();
            System.out.println("File Has Been Created");
        } catch (IOException e) {
            System.out.println(" Error Occurred in Creating File" );
        }
    }
    public static void WriteContactsToFile(String contactsData) {
        try{
            FileOutputStream fileOutput = new FileOutputStream(file);
            byte[] b = contactsData.getBytes();
            fileOutput.write(b);
            fileOutput.close();
            System.out.println("Contact Added to the File");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            System.out.println("Error occurred");
        }
    }
    public static void readData() {
        try{
            String filePath = file.getAbsolutePath();
            FileReader fr = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(fr);
            String personData;
            while((personData = reader.readLine()) != null){
                System.out.println(personData+"\n");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
