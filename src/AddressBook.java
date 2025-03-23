import java.util.List;
import java.util.ArrayList;

public class AddressBook {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }


    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
            return;
        }
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void searchContact(String name) {
        boolean found = false; // 검색 결과 확인 변수

        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println(contact);
                found = true;
            }
        }
        if (!found) {
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }
}
