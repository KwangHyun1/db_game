import dao.DBClass;
import dto.Enemy;
import dto.Item;
import dto.Tb_Character;

import java.util.Scanner;

public class GameClass {
    Scanner s = new Scanner(System.in);
    DBClass dc = new DBClass();
    public  void  gameSet(){
        // 캐릭터 입출력 Tb_Character
        System.out.print("캐릭터 이름 : ");
        String cname = s.nextLine();
        System.out.print("캐릭터 체력 : ");
        int chp = s.nextInt();
        s.nextLine();
        System.out.print("캐릭터 직업 : ");
        String job = s.nextLine();
        Tb_Character tb_character = new Tb_Character();
        tb_character.setName(cname);
        tb_character.setHp(chp);
        tb_character.setJob(job);

        // 아이템 입출력
        System.out.print("아이템 등록\n이름 입력 : ");
        String name = s.nextLine();
        System.out.print("속성 입력 : ");
        String att = s.nextLine();
        System.out.print("데미지 입력 : ");
        int dem = s.nextInt();
        //nextInt 다음 입력안될때
        s.nextLine();
        System.out.print("효과 입력 : ");
        String hyo = s.nextLine();
        //아이템 클레스에 입력 받은 내용들을 담아 보자
        Item item = new Item();
        item.setName(name);
        item.setAtt(att);
        item.setDem(dem);
        item.setHyo(hyo);

        // 몬스터 입출력
        System.out.print("몬스터 이름 : ");
        String ename = s.nextLine();
        System.out.print("몬스터 체력 : ");
        int hp = s.nextInt();
        s.nextLine();
        Enemy enemy = new Enemy();
        enemy.setName(ename);
        enemy.setHp(hp);

        // 총 데이터 입출력
        dc.insertCharacter(tb_character);
        dc.selectCharacter();
        dc.insertItem(item);
        dc.selectItem();
        dc.insertEnemy(enemy);
        dc.selectEnemy();

    }
    public void  gamePlay(){

    }
    public int gameData(int C2){
        while (C2<4) {
            System.out.println("1. 캐릭터 정보 2. 아이템 정보 3. 몬스터 정보 4. 종료  ");
            System.out.print("입력 : ");
            int C1 = s.nextInt();
            C2 = C1;
            if (C1 == 1) {
                dc.selectCharacter();
            } else if (C1 == 2) {
                dc.selectItem();
            } else if (C1 == 3) {
                dc.selectEnemy();
            } else if (C1 == 4) {
                System.out.println("종료");
            } else {
                System.out.println("잘못입력");
            }
        }
        return C2;
    }
}
