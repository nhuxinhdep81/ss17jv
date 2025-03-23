package ex10;

// File: ContactManager.java
import java.util.HashSet;
import java.util.Set;

public class ContactManager {
    private Set<Contact> contacts;

    public ContactManager() {
        this.contacts = new HashSet<>();
    }

    public boolean addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(contact.getPhoneNumber())) {
                System.out.println("Lỗi: Số điện thoại " + contact.getPhoneNumber() + " đã tồn tại!");
                return false;
            }
        }

        contacts.add(contact);
        System.out.println("Đã thêm liên lạc thành công: " + contact.getName());
        return true;
    }

    public boolean removeContact(String phoneNumber) {
        Contact contactToRemove = null;
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                contactToRemove = c;
                break;
            }
        }
        if (contactToRemove != null) {
            contacts.remove(contactToRemove);
            System.out.println("Đã xóa liên lạc có số điện thoại: " + phoneNumber);
            return true;
        } else {
            System.out.println("Không tìm thấy liên lạc có số điện thoại: " + phoneNumber);
            return false;
        }
    }

    public Contact findContact(String phoneNumber) {
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                return c;
            }
        }
        return null;
    }

    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Danh bạ trống!");
        } else {
            System.out.println("Danh sách liên lạc (" + contacts.size() + " liên lạc):");
            for (Contact c : contacts) {
                System.out.println(c);
            }
        }
    }

    public int getContactCount() {
        return contacts.size();
    }
}