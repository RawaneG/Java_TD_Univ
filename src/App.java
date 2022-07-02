// import java.util.ArrayList;
// import java.util.Date;
// import services.Etudiant;
// import services.Loge;
import services.Chambre;
import services.Pavillon;
import services.ResponsablePavillon;

public class App
{
    public static void main(String[] args) throws Exception
    {
        //-- Ajout des étudiants et stockage dans une Liste
        ResponsablePavillon respo = new ResponsablePavillon("El hadji Rawane Meissa Sow");
        // ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
        // Loge loge1 = new Loge(
        // "Sow",
        // "Rawane",
        // "rawane.meissa@gmail.com",
        // "773987059", new Date(),
        // "Student1397",
        // respo);
        // etudiants.add(loge1);
        // respo.setEtudiants(etudiants);
        // System.out.println(respo.getEtudiants());

        Pavillon firstPavillon = new Pavillon(1, 5, respo);
        Pavillon secondPavillon = new Pavillon(2, 5, respo);
        Pavillon thirdPavillon = new Pavillon(3, 5, respo);
        Object[] mesPavillons = {firstPavillon,secondPavillon};

        //-- Liste des Pavillons avant ajout
        Pavillon.list(mesPavillons);
        //-- Ajout de Pavillon et stockage dans un tableau
        mesPavillons = Pavillon.add(2, thirdPavillon, mesPavillons);
        //-- Liste des Pavillons après ajout
        Pavillon.list(mesPavillons);

        Chambre firstChambre = new Chambre(1, 1, "double",  firstPavillon);
        Chambre secondChambre = new Chambre(1, 2, "individuel", secondPavillon);
        Chambre thirdChambre = new Chambre(1, 3, "individuel", thirdPavillon);
        Object[] mesChambres = {firstChambre,secondChambre};

        //-- Liste des Pavillons avant ajout
        Chambre.list(mesChambres);
        //-- Ajout de Chambre et stockage dans un tableau
        mesChambres = Chambre.add(2, thirdChambre, mesChambres);
        //-- Liste des Chambres après ajout
        Chambre.list(mesChambres);
    }

}
