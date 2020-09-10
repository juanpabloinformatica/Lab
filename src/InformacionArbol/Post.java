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
public class Post {
    int userId;
    int id;
    String title;
    String body;
    UsuarioNodo usuario;
    ArrayList<Comentario>comentarios;

    public Post(int userId, int id, String title, String body, UsuarioNodo usuario) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
        this.usuario = usuario;
        usuario.addPost(this);
        comentarios=new ArrayList();
    }
    void addComentario(Comentario comentario){
        comentarios.add(comentario);
    }
    
    
   
}
