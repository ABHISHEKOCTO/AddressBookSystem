package com.bridgelabz.addressBook;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    HashMap<String,AddressBook> bookMap = new HashMap<String, AddressBook>();
    Scanner sc = new Scanner(System.in);
    AddressBook adressbook = new AddressBook();
    public void multipleAddressBooks(){
        while(true){
            System.out.println("Please Enter 1. Access Address Book 2.Print  0.Exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Please Enter AdressBook Name: ");
                    String name = sc.next();
                    if (bookMap.containsKey(name)){
                        System.out.println("Already Present");
                    }
                    else{
                        System.out.println("**Welcome to AddressBook**"+name);
                        bookMap.put(name,adressbook);
                        menu();
                    }
                    break;
                case 2:
                    System.out.println("Please Enter AdressBook Name: ");
                    String search = sc.next();
                    bookMap.get(search);
                    break;
                case 0:
                    System.out.println("Exit");
                    System.exit(0);
            }
        }
    }


    public static void menu() {
        System.out.println("Welcome to Address Book Program");
        AddressBook addressBook = new AddressBook(); // object of class AddressBook
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("***ADDRESSBOOK SIMULATION***");

            System.out.println("\n1. ADD CONTACT \n2. DISPLAY CONTACT \n3. EDIT CONTACT \n4. DELETE CONTACT \n5. TOTAL CONTACTS \n6. EXIT ");

            System.out.println("Enter the Operation Number: ");
            int operationNo = sc.nextInt();

            switch (operationNo) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.displayContact();
                    break;
                case 3:
                    addressBook.editContact();
                    break;
                case 4:
                    addressBook.deleteContact();
                    break;
                case 5:
                    addressBook.numOfContacts();
                    break;
                case 6:
                    return;

            }
        }
    }
    public static void main(String[] args) {
        AddressBookMain main = new AddressBookMain();
        main.multipleAddressBooks();
    }
}
