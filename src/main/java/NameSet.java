import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    이름을 설정하는 클래스
 */
public class NameSet {
    Scanner s = new Scanner(System.in);
    List<ItemsClass> item = new ArrayList<>();
    List<ItemsClass> at = new ArrayList<>();
    private String name;
    //메소드
    public void setName(){
        System.out.print("이름 설정 가능\n이름 설정 :");
        name = s.nextLine();
    }
    public String getName(){
        System.out.println("Hi, "+name);
        return name;
    }
    //아이템 셋팅
    //사용자가 원하는 만큼 아이템 셋팅
    public  void setItme(){
        ItemsClass ic = new ItemsClass();
        System.out.printf("몇개의 아이템을 사용하시겠습니까?\n갯수입력 : ");
        int n = s.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("아이템 입력 : ");
            String it = s.next();
            ic.setItems(it);
            System.out.print("속성 입력 : ");
            it = s.next();
            ic.setAtt(it);
            //System.out.printf("%d. 아이템: %s\n", i, it);
            item.add(ic);
            at.add(ic);
        }
        //ItemClass ic : list
        for(int i=0; i<n; i++){
            System.out.println(i+". 아이템 이름: "+ic.getItem(i)+"\n  아이템 속성: "+ic.getAtt(i));
        }
    }
    public List<ItemsClass> getItemList(){
        return item;
    }
    public List<ItemsClass> getAtList(){
        return at;
    }
}
