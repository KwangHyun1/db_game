import dao.DBClass;
import dto.Enemy1;
import dto.Tb_Character;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GameClass gs = new GameClass();
        DBClass db = new DBClass();
        // 게임 시작
        System.out.println("게임 스타트");
        //무한 반복 for(;;) 또는 while(True)
        for (; ; ) {
            // 1. 게임 설정 2. 플레이 게임 3. 저장된 정보 보기
            System.out.println("1. 게임 설정 2. 게임 플레이 3. 저장된 정보 보기");
            System.out.print("입력 : ");
            int c1 = s.nextInt();
            s.nextLine();
            if (c1 == 1) {
                // 만약에 1번이면/캐릭터 정보 설정/ 캐릭터 정보가 디비에 저장/ 몬스터 정보 설정/ 몬스터 정보 디비에 저장/ 아이템 정보 설정/ 아이템 정보 디비에 저장
                System.out.println("게임 설정");
                gs.gameSet();

            } else if (c1 == 2) {
                System.out.println("게임 플레이 스타트");
                //디비에 저장된 정보가 없으면 게임 설정으로 가라고 안내 메세지

                ArrayList<Tb_Character> list = db.select();
                if (list.isEmpty()) {
                    System.out.println(" 캐릭터 정보가 없습니다 재설정하시오");
                } else {
                    for (Tb_Character tb : list) {
                        System.out.println(tb.getName());
                        System.out.println("정보가 있습니다.");
                        System.out.println("사용하고 싶은 플레이어를 입력하세요");
                        String name = s.next();
                        Tb_Character dto = db.select(name);
                        System.out.println("선택하신 플레이어 정보입니다.");
                        System.out.print("이름: " + dto.getName());
                        System.out.print(", HP: " + dto.getHp());
                        System.out.println(", 직업: " + dto.getJob());
                        System.out.println("게임을 시작합니다");
                        System.out.println("퉁퉁이와 싸웁니다");
                        System.out.println("퉁퉁이가 공격을 했습니다");
                        int hp = dto.getHp();
                        Random rnd = new Random();
                        int r = rnd.nextInt(100);
                        hp = hp - r;
                        System.out.println("내 HP가 " + hp + "가 남았습니다");
                        System.out.println("게임을 중단 할까요?");
                        System.out.println("1. 중단 2. 계속");
                        System.out.println("데이터를 저장합니다.");
                        db.update(hp, dto.getId());

                    }
                }
                // 만약에 2번이면 게임이 시작된다/ 디비에 저장된 정보가 있으면 게임 시작(이전에 만든 시나리오 알아서)/ 디비에 저장된 정보가 없으면 게임 설정으로 가라고 안내 메세지
                GamePlay g = new GamePlay();
                //g.play();

            } else if (c1 == 3) {
                // 만약에 3번이면
                // 1.캐릭터 정보 보기 2. 몬스터 정보 보기 3. 아이템 정보 보기
                //각각 디비에 저장되어 있는 정보들을 출력
                int c2 = 0;
                gs.gameData(gs.gameData(c2));
            } else {
                System.out.println("게임종료");
                break;
            }
        }
    }
}
