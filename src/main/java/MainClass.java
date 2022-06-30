import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GameClass gs = new GameClass();
        DBClass db = new DBClass();
        // 게임 시작
        System.out.println("게임 스타트");
        // 1. 게임 설정 2. 플레이 게임 3. 저장된 정보 보기
        System.out.println("1. 게임 설정 2. 게임 플레이 3. 저장된 정보 보기");
        int C1 = s.nextInt();
        s.nextLine();
        if(C1 == 1){
        // 만약에 1번이면/캐릭터 정보 설정/ 캐릭터 정보가 디비에 저장/ 몬스터 정보 설정/ 몬스터 정보 디비에 저장/ 아이템 정보 설정/ 아이템 정보 디비에 저장
            System.out.println("게임 설정");
            gs.gameSet();

        }else if(C1 == 2) {
            System.out.println("게임 플레이 스타트");
            db.selectEnemy1();

            // 만약에 2번이면 게임이 시작된다/ 디비에 저장된 정보가 있으면 게임 시작(이전에 만든 시나리오 알아서)/ 디비에 저장된 정보가 없으면 게임 설정으로 가라고 안내 메세지
            GamePlay g = new GamePlay();
            g.play();

        }else{
        // 만약에 3번이면
        // 1.캐릭터 정보 보기 2. 몬스터 정보 보기 3. 아이템 정보 보기
        //각각 디비에 저장되어 있는 정보들을 출력
            int C2=0;
                gs.gameData(gs.gameData(C2));
            }
    }
}
