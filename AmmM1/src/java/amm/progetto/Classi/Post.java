/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.progetto.Classi;

/**
 *
 * @author Sergio
 */
public class Post 
{
    private int id;
    private String content;
    private Type postType;
    private User id_utente;
    
    public Post()
    {
        id=-1;//o zero?
        content="";
        postType= Type.TEXT;
        id_utente=null;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the postType
     */
    public Type getPostType() {
        return postType;
    }

    /**
     * @param postType the postType to set
     */
    public void setPostType(Type postType) {
        this.postType = postType;
    }

    /**
     * @return the id_utente
     */
    public User getId_utente() {
        return id_utente;
    }

    /**
     * @param id_utente the id_utente to set
     */
    public void setId_utente(User id_utente) {
        this.id_utente = id_utente;
    }
    public enum Type
    {
        TEXT, IMAGE, LINK
    };
    
    
    
}
