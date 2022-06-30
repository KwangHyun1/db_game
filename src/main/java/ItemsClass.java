import java.util.ArrayList;
import java.util.List;

public class ItemsClass {
    List<String> item = new ArrayList<String>();
    List<String> at = new ArrayList<String>();
    // 아이템 이름
    int i;
    private String iname;
    // 아이템 속성
    private String attt;

    //위에변수에 값을 다루기 위한 메소드 만들기
    public  void setItems(String iname){
        item.add(iname);

    }
    public  void setAtt(String att){
        at.add(att);
    }
    public String getItem(int i){
        return item.get(i);
    }
    public String getAtt(int i){
        return at.get(i);
    }

}
