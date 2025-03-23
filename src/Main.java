import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running=true;
        Map<Integer,Runnable> menu = new HashMap<>();
        AddressBook addressBook = new AddressBook();

        menu.put(1,()->BusinessContact.addBusinessContact(addressBook));
        menu.put(2,()->PersonalContact.addPersonalContact(addressBook));
        menu.put(3,()->addressBook.displayContacts());
        menu.put(4,()->{
            Scanner scanner2 = new Scanner(System.in);
            System.out.print("검색할 이름을 입력하세요: ");
            String searchName = scanner2.nextLine();
            addressBook.searchContact(searchName);
        });
        menu.put(5,()->{
            System.out.println("프로그램을 종료합니다.");
            System.exit(0);
        });

        while (running){
            System.out.println();
            System.out.println("1.비즈니스 연락처 추가 2.개인 연락처 추가 3.연락처 출력" +
                    " 4.연락처 검색 5.종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); //버퍼 클리어

            menu.getOrDefault(choice, () -> System.out.println("잘못된 입력입니다.")).run();
        }

    }

}