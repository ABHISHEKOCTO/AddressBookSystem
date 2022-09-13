package com.bridgelabz.addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    static ArrayList<Contacts> contactList = new ArrayList<>();
    int count = 0;

    public void addContact() {  //method for adding contact from user input
        Contacts contact = new Contacts();
        System.out.println("HashCode of contact: " +hashCode());
        count++;
        System.out.println("Enter the First Name : ");
        contact.setFirstName(sc.next());
        System.out.println("Enter the Last Name : ");
        contact.setLastName(sc.next());
        System.out.println("Enter the Address : ");
        contact.setAddress(sc.next());
        System.out.println("Enter the City : ");
        contact.setCity(sc.next());
        System.out.println("Enter the State : ");
        contact.setState(sc.next());
        System.out.println("Enter the Zipcode : ");
        contact.setZip(sc.next());
        System.out.println("Enter the Mobile Number : ");
        contact.setPhoneNum(sc.next());
        System.out.println("Enter the Email Id : ");
        contact.setEmail(sc.next());
        contactList.add(contact);
    }

    public void editContact() {
        System.out.println("Enter the First Name of Contact to Edit : ");
        String firstName = (sc.next());
        boolean isAvailable = false;

        for(Contacts contact : contactList) {
            if(contact.getFirstName().equals(firstName)) {
                while(true) {
                    isAvailable = true;
                    System.out.println("select options");
                    System.out.println("\n1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip\n7.Phone Number\n8.EmailId\n9.exit");
                    int option = sc.nextInt();

                    switch(option){
                        case 1:
                            System.out.println("Rename FirstName ");
                            contact.setFirstName(sc.next());
                            break;
                        case 2:
                            System.out.print("Enter a Last name: ");
                            contact.setLastName(sc.next());
                            break;
                        case 3:
                            System.out.print("Enter a Address: ");
                            contact.setAddress(sc.next());
                            break;
                        case 4:
                            System.out.print("Enter a city: ");
                            contact.setCity(sc.next());
                            break;
                        case 5:
                            System.out.print("Enter a state: ");
                            contact.setState(sc.next());
                            break;
                        case 6:
                            System.out.print("Enter a zip code: ");
                            contact.setZip(sc.next());
                            break;
                        case 7:
                            System.out.print("Enter a phone number: ");
                            contact.setPhoneNum(sc.next());
                            break;
                        case 8:
                            System.out.println("Enter new Email id: ");
                            contact.setEmail(sc.next());
                            break;
                        case 9:
                            return;
                        default:
                            System.out.println("invalid entry");
                    }

                    System.out.println("Contact Updated");
                }
            }
        }
        if(isAvailable == false) {
            System.out.println("Contact Not Available.");
        }
    }



    public void deleteContact() {
        System.out.println("Enter the First Name to Delete the Contact : ");
        String firstName = (sc.next());
        boolean isAvailable = false;

        for(Contacts contact : contactList) {
            if(contact.getFirstName().equalsIgnoreCase(firstName)) {
                isAvailable = true;
                contactList.remove(contact);
                System.out.println("Contact is Deleted ");
                count--;
                break;
            }
        }
        if(isAvailable == false) {
            System.out.println("Contact Not Available.");

        }
    }

    public void displayContact() { //method for displaying all entries in the ArrayList

        for ( int i = 0; i < contactList.size(); i++ ) {
            Contacts contact = contactList.get(i);
            System.out.println(contact.toString());
        }
    }
    public void numOfContacts() {
        System.out.println("The Contacts Saved in Book : "+count);
    }
}
