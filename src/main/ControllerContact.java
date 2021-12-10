package main;

import io.ReadAndWrite;
import model.Contact;
import service.ContactService;
import view.ViewContact;

public class ControllerContact {
    ReadAndWrite readAndWrite = new ReadAndWrite();
    ContactService contactService = new ContactService();
    ViewContact viewContact = new ViewContact();
    public void controllerContact() {
        while (true) {
            int choice = viewContact.menuManagerContact();
            if (choice >= 1 && choice <= 8) {
                switch (choice) {
                    case 1:
                        contactService.showListContact();
                        break;
                    case 2:
                        contactService.addList(viewContact.menuAddList());
                        break;
                    case 3:
                        contactService.showListContact();
                        String name = viewContact.editByName();
                        Contact contact = viewContact.menuEditContact(name);
                        contactService.editContact(name, contact);
                        break;
                    case 4:
                        contactService.showListContact();
                        contactService.deleteByNmae(viewContact.menudeleteByName());
                        break;
                    case 5:
                        contactService.searchByName(viewContact.menusearchByName());
                        break;
                    case 6:
                        readAndWrite.realdFile();
                        break;
                    case 7:
                        readAndWrite.writeToFile();
                        break;
                    case 8:
                        System.exit(0);
                }

            } else
                System.err.println(" lựa chọn ko có trong danh sách");
        }
    }
}
