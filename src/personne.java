public abstract class personne {

    protected String name;
    protected String username;
    protected String email;


    public personne(String name, String username, String email) {
        this.name=name;
        this.username=username;
        this.email=email;
    }
 public void affiche (){
     System.out.println("bonjour si mahdi");
 }
    public abstract void  show();
}
