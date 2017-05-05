/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progetto.Classi;
import java.util.ArrayList;
/**
 *
 * @author Sergio
 */
public class GruppiFactory 
{
    private static GruppiFactory singleton;
    
    public static GruppiFactory getInstance() {
        if (singleton == null) {
            singleton = new GruppiFactory();
        }
        return singleton;
    }


private ArrayList<Gruppi> listaGruppi = new ArrayList<Gruppi>();

private GruppiFactory() 
{
        UserFactory userFactory = UserFactory.getInstance();
        
        Gruppi gruppi1 = new Gruppi();
        gruppi1.setId(0);
        gruppi1.setPic("img/netflix.png");
        gruppi1.setName("Netflix");
        
        Gruppi gruppi2 = new Gruppi();
        gruppi2.setId(1);
        gruppi2.setPic("img/pen.jpg");
        gruppi2.setName("Scrittori");
        
        listaGruppi.add(gruppi1);
        listaGruppi.add(gruppi2);
       
}
public Gruppi getGruppiId(int id) {
        for (Gruppi gruppi : this.listaGruppi) {
            if (gruppi.getId() == id) {
                return gruppi;
            }
        }
        return null;
    }
}