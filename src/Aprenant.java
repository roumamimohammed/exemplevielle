public class Aprenant extends personne {
    protected int annee;


    public Aprenant(String name,String username,String email,int annee){
        super(name,username,email);
        this.annee=annee;
    }

    public void show(){
        System.out.println("my name is"+this.name+" "+this.username+"email:"+this.email+"je suis en"+this.annee+"annee");
    }

}
