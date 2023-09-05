public class Formateur extends personne{

        protected int salair;

        public Formateur(String name,String username,String email,int salair){
            super(name,username,email);
            this.salair=salair;
        }
        public void show(){
            System.out.println("my name is"+this.name+" "+this.username+"email:"+this.email+"mon salair et"+this.salair+"dh");
        }
        @Override
    public void affiche(){
            super.affiche();
            System.out.println("hohoss");

        }
}
