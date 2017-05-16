/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progetto.Classi;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sergio
 */
public class PostFactory 
{
    private static PostFactory singleton;
     
      public static PostFactory getInstance() 
      {
        if (singleton == null) {
            singleton = new PostFactory();
        }
        return singleton;
      }
      
     private ArrayList<Post> listaPost = new ArrayList<Post>();
     
     private PostFactory() {
        //Creazione utenti
     UserFactory userFactory = UserFactory.getInstance();
        //Djanni
        Post post1 = new Post();
        post1.setId(0);
        post1.setContent("Oggi c'è Avengers in TV!");
        post1.setId_utente(userFactory.getUserId(0));
       
        
        
        Post post2 = new Post();
        post2.setId(1);
        post2.setContent("Premiere del mio prossimo film");
        post2.setId_utente(userFactory.getUserId(1));
        
        Post post3 = new Post();
        post3.setId(2);
        post3.setContent("img/ger.jpg");
        post3.setId_utente(userFactory.getUserId(1));
        post3.setPostType(Post.Type.IMAGE);
        
        Post post4 = new Post();
        post4.setId(3);
        post4.setContent("Seguiteci sul sito di Sanremo!");
        post4.setId_utente(userFactory.getUserId(2));
       
        Post post5 = new Post();
        post5.setId(4);
        post5.setContent("\"http://www.rai.it/programmi/sanremo/\"");
        post5.setId_utente(userFactory.getUserId(2));
        post5.setPostType(Post.Type.LINK);
        
        listaPost.add(post1);
        listaPost.add(post2);
        listaPost.add(post3);
        listaPost.add(post4);
        listaPost.add(post5);
}
     
public Post getPostById(int id) 
{
   for (Post post : this.listaPost) {
       if (post.getId() == id) {
           return post;
       }
   }
   return null;
}

public List getPostList(User usr) 
{

        List<Post> listaPost = new ArrayList<Post>();

        for (Post post : this.listaPost) 
        {
            if (post.getId_utente().equals(usr)) {
                listaPost.add(post);
            }
        }
        return listaPost;
}

public List getPostList(Gruppi gruppo) 
{

        List<Post> listaPost = new ArrayList<Post>();

        for (Post post : this.listaPost) 
        {
            if (post.getId_gruppo().equals(gruppo)) {
                listaPost.add(post);
            }
        }
        return listaPost;
    }
      
    
}
      
    

