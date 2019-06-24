package cn.edu.swufe.beauty;

public class InfItem {

    private int id;
    private String curNumber;
    private String curCollege;
    private String curSpice;
    private String curIntro;



    public InfItem(){
        super();
        curNumber = "";
        curCollege = "";
        curSpice = "";
        curIntro = "";

    }
    public InfItem(String curName,String curRate){
        super();
        this.curNumber=curNumber;
        this.curCollege=curCollege;
        this.curSpice=curSpice;
        this.curIntro=curIntro;

    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id= id;
    }

    public String getCurNumber(){
        return  curNumber;
    }
    public void setCurNumber(String curNumber){
        this.curNumber=curNumber;
    }

    public String getCurCollege(){
        return  curCollege;
    }
    public void setCurCollege(String curCollege){
        this.curCollege=curCollege;
    }

    public String getCurSpice(){
        return  curSpice;
    }
    public void setCurSpice(String curSpice){
        this.curSpice=curSpice;
    }

    public String getCurIntro(){
        return  curIntro;
    }
    public void setCurIntro(String curIntro){
        this.curIntro=curIntro;
    }



}
