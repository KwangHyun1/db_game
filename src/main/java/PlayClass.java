import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PlayClass {
    Scanner s = new Scanner(System.in);
    private int C1;
    public int play1(String name){
        System.out.printf("%s(이)가 여행을 떠난다.\n퉁퉁이를 만났다\n1. 싸운다\n2. 도망간다\n선택 : ", name);
        C1 = s.nextInt();
        return C1;
    }
    public void play2(String name, int C1, List<ItemsClass> item, List<ItemsClass> at) {

        if (C1 == 1) {
            System.out.printf("1. 10번 콤보 공격\n2. 아이템 사용\n3. 방어\n선택 : ");
            int C2 = s.nextInt();
            if (C2 == 1) {
                System.out.printf("%s가 퉁퉁이에게 10번 콤보 공격을 하였다. 효과는 미미했다.", name);
            } else if (C2 == 2) {
                Random rd = new Random();
                int r = rd.nextInt(item.size());


                System.out.printf("%s 아이템 입력 사용 \n아이템 속성: %s\n ",item.get(r).getItem(r), at.get(r).getAtt(r));
                System.out.printf("%s이/가 %s를 꺼내었다\n퉁퉁이에게 %s으로 퉁퉁이의 후두부를 깠다\n효과는 굉장했다\n", name, item.get(r).getItem(r), item.get(r).getItem(r));
            } else if (C2 == 3) {
                System.out.printf("%s(이)가 방어를 시전하였다\n 퉁퉁이가 %s를 공격하였다.\n효과는 굉장했다.\n", name, name);
            } else {
                System.out.println("잘못 입력");
            }
        } else if (C1 == 2) {
            System.out.println("도망을 갔다");
        } else {
            System.out.println("잘못 입력");
        }
    }

}
