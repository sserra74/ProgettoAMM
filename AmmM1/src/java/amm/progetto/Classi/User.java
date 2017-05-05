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
public class User {

    private int id;
    private String username;
    private String nome;
    private String cognome;
    private String img;
    private String frase;
    private String data_di_nascita;
    private String password;

    public User() {
        id = 0;
        username = "";
        nome = "";
        cognome = "";
        img = "";
        frase = "";
        data_di_nascita = "";
        password = "";
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
     * @return the Username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
        this.username = username;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * @param cognome the cognome to set
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @return the img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img the img to set
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * @return the frase
     */
    public String getFrase() {
        return frase;
    }

    /**
     * @param frase the frase to set
     */
    public void setFrase(String frase) {
        this.frase = frase;
    }

    /**
     * @return the data_di_nascita
     */
    public String getData_di_nascita() {
        return data_di_nascita;
    }

    /**
     * @param data_di_nascita the data_di_nascita to set
     */
    public void setData_di_nascita(String data_di_nascita) {
        this.data_di_nascita = data_di_nascita;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
