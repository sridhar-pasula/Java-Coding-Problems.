package Constructor;

public class Gun {
    String gunName;
    String gunType;
    int noBullets;
    public Gun(String gunName,String gunType,int noBullets){
        this.gunName=gunName;
        this.gunType=gunType;
        this.noBullets=noBullets;
    }
    public void shoot(){
        System.out.println(this.gunName);
        System.out.println(this.gunType);
        for(int i=1;i<=this.noBullets;i++){
            System.out.println("Shoot");
        }
        System.out.println("-----------------------------");
    }
}

