package dto;

/**
 * 데이터를 담아서 전달하는 클래스
 * DTO
 * DB 테이블에 맞게 작성
 * */
public class Item {
    //변수 (컬럼값)
    private  int id;
    private  String name;
    private  String att;
    private  int dem;
    private  String hyo;
    //메소드(컬러값 데이터 셋 겟)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAtt() {
        return att;
    }

    public void setAtt(String att) {
        this.att = att;
    }

    public int getDem() {
        return dem;
    }

    public void setDem(int dem) {
        this.dem = dem;
    }

    public String getHyo() {
        return hyo;
    }

    public void setHyo(String hyo) {
        this.hyo = hyo;
    }
}
