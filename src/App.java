import java.util.ArrayList;
import java.util.Date;
import services.Etudiant;
import services.Loge;
import services.ResponsablePavillon;

public class App
{
    public static void main(String[] args) throws Exception
    {
        ResponsablePavillon respo = new ResponsablePavillon("El hadji Rawane Meissa Sow");
        Loge loge1 = new Loge("Sow", "Rawane", "rawane.meissa@gmail.com",
        "773987059", new Date(), "Student1397", respo);
        ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
        etudiants.add(loge1);
        respo.setEtudiants(etudiants);
        System.out.println(respo.getEtudiants());
    }
}
