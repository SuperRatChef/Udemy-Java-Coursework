package MobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    private int findContact(Contact contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact c = myContacts.get(i);
            if (c.getName().equals(contact.getName())) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;  // Not found
    }

    public boolean addNewContact(Contact contact) {
        int contactExist = findContact(contact);
        if (contactExist == -1) {
            myContacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int contactExist = findContact(oldContact);
        if (contactExist != -1) {
            myContacts.set(contactExist, newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        int contactExist = findContact(contact);
        if (contactExist != -1) {
            myContacts.remove(contactExist);
            return true;
        } else {
            return false;
        }
    }

    public Contact queryContact(String queryName) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(queryName)) {
                return contact;
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            String name = myContacts.get(i).getName();
            String phoneNumber = myContacts.get(i).getPhoneNumber();
            System.out.println((i + 1) + ". " + name + " -> " + phoneNumber);
        }
    }
}
