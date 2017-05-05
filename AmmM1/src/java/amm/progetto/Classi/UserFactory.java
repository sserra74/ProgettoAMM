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
public class UserFactory 
{
     private static UserFactory singleton;
     
      public static UserFactory getInstance() 
      {
        if (singleton == null) {
            singleton = new UserFactory();
        }
        return singleton;
      }
      
      private ArrayList<User> listaUser = new ArrayList<User>();
      
      private UserFactory() {
        //Creazione utenti

        //Djanni
        User user1 = new User();
        user1.setId(0);
        user1.setUsername("marcoadami1");
        user1.setNome("Marco");
        user1.setCognome("Adami");
        user1.setPassword("vogliomangiare");
        user1.setImg("img/marco-bertozzi.png");
        user1.setFrase("Mi presento: sono un cuoco professionista");
        user1.setData_di_nascita("12/03/1964");
        
        User user2 = new User();
        user2.setId(1);
        user2.setUsername("alemastro25");
        user2.setNome("Alessandra");
        user2.setCognome("Mastronardi");
        user2.setPassword("amorecitare");
        user2.setImg("img/AlessandraMastronardi.jpg");
        user2.setFrase("La mia più grande passione è la recitazione");
        user2.setData_di_nascita("18/02/1980");
        
        User user3 = new User();
        user2.setId(2);
        user2.setUsername("carloConti61");
        user2.setNome("Carlo");
        user2.setCognome("Conti");
        user2.setPassword("rai1");
        user2.setImg("img/carloconti.jpg");
        user2.setFrase("Prima ero un dj e ora presento");
        user2.setData_di_nascita("05/08/1961");
        
        listaUser.add(user1);
        listaUser.add(user2);
        listaUser.add(user3);
       
}
      
      public User getUserId(int id) {
        for (User utente : this.listaUser) {
            if (utente.getId() == id) {
                return utente;
            }
        }
        return null;
    }
    
    public int getIdUserAndPassword(String user, String password){
        for(User utente : this.listaUser){
            if(utente.getNome().equals(user) && utente.getPassword().equals(password)){
                return utente.getId();
            }
        }
        return -1;
    }
      
}
