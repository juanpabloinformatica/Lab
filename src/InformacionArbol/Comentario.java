/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InformacionArbol;

/**
 *
 * @author JPPM
 */
public class Comentario  {
    private int id;
    String name;
    String email;
    String body;
    UsuarioNodo usuario;
    Post post;

    public Comentario(int id, String name, String email, String body, UsuarioNodo usuario,Post post) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
        this.usuario = usuario;
        usuario.addComentario(this);
        post.addComentario(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBody() {
        return body;
    }

    public UsuarioNodo getUsuario() {
        return usuario;
    }
    
    
}
