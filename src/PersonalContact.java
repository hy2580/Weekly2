import java.util.Scanner;

public class PersonalContact extends Contact {
    private String relationship;

    public PersonalContact(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);
        this.relationship = relationship;
    }

    public static void addPersonalContact(AddressBook addressBook){
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요:");
        String name = scanner.nextLine();
        System.out.print("전화번호를 입력하세요:");
        String phoneNumber = scanner.nextLine();
        System.out.print("관계를 입력하세요:");
        String relationship = scanner.nextLine();

        PersonalContact newPersonal = new PersonalContact(name, phoneNumber, relationship);
        addressBook.addContact(newPersonal);

    }

    @Override
    public String toString() {
        return "이름:" + getName() + ", 전화번호:" + getPhoneNumber() + ", 관계:" + relationship;
    }

}
