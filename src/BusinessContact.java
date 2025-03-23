import java.util.Scanner;

public class BusinessContact extends Contact {
    private String company;

    public BusinessContact(String name, String phoneNumber, String company){
        super(name,phoneNumber);
        this.company = company;
    }

    public static void addBusinessContact(AddressBook addressBook){
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요:");
        String name = scanner.nextLine();
        System.out.print("전화번호를 입력하세요:");
        String phoneNumber = scanner.nextLine();
        System.out.print("회사명을 입력하세요:");
        String company = scanner.nextLine();

        BusinessContact newBusiness = new BusinessContact(name, phoneNumber, company);
        addressBook.addContact(newBusiness);
    }

    @Override
    public String toString() {
        return "이름:" + getName() + ", 전화번호:" + getPhoneNumber() + ", 회사:" + company;
    }

}
