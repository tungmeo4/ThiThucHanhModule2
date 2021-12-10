package model;

public class Contact {
    private String name;
    private String phoneNumber;
    private String adress;
    private String email;
    private String faceBook;

    public Contact() {
    }

    public Contact(String name, String phoneNumber, String adress, String email, String faceBook) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
        this.email = email;
        this.faceBook = faceBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaceBook() {
        return faceBook;
}

}
