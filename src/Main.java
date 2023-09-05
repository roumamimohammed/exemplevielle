import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du formateur : ");
        String name = scanner.nextLine();

        System.out.print("Entrez le nom d'utilisateur du formateur : ");
        String username = scanner.nextLine();

        System.out.print("Entrez l'email du formateur : ");
        String email = scanner.nextLine();

        System.out.print("Entrez le salaire du formateur : ");
        int salaire = scanner.nextInt();
        scanner.nextLine(); // Lire la nouvelle ligne en excès

       /* System.out.print("Entrez le nom de l'apprenant : ");
        String apprenantname = scanner.nextLine();

        System.out.print("Entrez le nom d'utilisateur de l'apprenant : ");
        String apprenantUsername = scanner.nextLine();

        System.out.print("Entrez l'email de l'apprenant : ");
        String apprenantEmail = scanner.nextLine();

        System.out.print("Entrez l'année de l'apprenant : ");
        int apprenantAnnee = scanner.nextInt();*/

        Formateur formateur = new Formateur(name,username, email, salaire);
       // Aprenant aprenant = new Aprenant(apprenantname, apprenantUsername, apprenantEmail, apprenantAnnee);

        formateur.show();
        formateur.affiche();
        //aprenant.show();

        scanner.close();
    }
}
