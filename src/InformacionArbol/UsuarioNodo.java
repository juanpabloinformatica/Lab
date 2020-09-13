/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InformacionArbol;

import java.util.ArrayList;

/**
 *
 * @author JPPM
 */
public class UsuarioNodo {
    private int id;
    private String name;
    private String userName;
    private String email;
    private String phone;
    private String website;
    ArrayList<Post>posts;
    ArrayList<Comentario>comentarios;
    Company company;
    Adress adress;
    UsuarioNodo hIzq;
    UsuarioNodo hDer;
    //Se puede cambiar el parametro de Geo para que la responsabilidad la tenga el adress
   
    UsuarioNodo(int id,String name,String userName,String email,String phone,String website,Adress adress,Company company){
        this.id=id;
        this.name=name;
        this.userName=userName;
        this.email=email;
        this.phone=phone;
        this.website=website;
        posts=new ArrayList();
        this.adress=adress;
        this.company=company;
        hDer=null;
        hIzq=null;
    }
    public void addComentario(Comentario comentario){
        comentarios.add(comentario);
    }
    public void addPost(Post post){
        posts.add(post);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public UsuarioNodo gethIzq() {
        return hIzq;
    }

    public void sethIzq(UsuarioNodo hIzq) {
        this.hIzq = hIzq;
    }

    public UsuarioNodo gethDer() {
        return hDer;
    }

    public void sethDer(UsuarioNodo hDer) {
        this.hDer = hDer;
    }

    @Override
    public String toString() {
        return "UsuarioNodo{" + "id=" + id + ", name=" + name + ", userName=" + userName + ", email=" + email + ", phone=" + phone + ", website=" + website + ", posts=" + posts + ", comentarios=" + comentarios + ", company=" + company + ", adress=" + adress + '}';
    }
    
    
}
