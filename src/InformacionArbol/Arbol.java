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
public class Arbol {

    UsuarioNodo raiz;

    public Arbol() {
        raiz = null;
    }

    public UsuarioNodo getRaiz() {
        return raiz;
    }
    public UsuarioNodo findUsuarioNodo(int id){
        UsuarioNodo actual = raiz;
        while(actual.getId()!=id){
            if(id<actual.getId()){
                actual=actual.hIzq;
            }else{
                actual=actual.hDer;
            }
            if(actual==null){
                return null;
            }
        }
        if(id==actual.getId()){
            return actual;
        }
        return actual;
    }

    public void addUsuarioNodo(int id, String name, String userName, String email, String phone, String website, Adress adress, Company company) {
        UsuarioNodo nuevoNodo = new UsuarioNodo(id, name, userName, email, phone, website, adress, company);
        if (raiz == null) {
            raiz = nuevoNodo;
        } else {
            UsuarioNodo padre = raiz;
            UsuarioNodo aux = raiz;
            while (true) {
                padre = aux;
                if (id < aux.getId()) {
                    aux = aux.hIzq;
                    if (aux == null) {
                        padre.hIzq = nuevoNodo;
                        return;
                    } else {
                        padre = aux;
                    }
                } else {
                    aux = aux.hDer;
                    if (aux == null) {
                        padre.hDer = nuevoNodo;
                        return;
                    } else {
                        padre = aux;
                    }
                }
            }
        }

    }

    public void recorridoInOrder(UsuarioNodo raiz) {
        if (raiz == null) {
            return;
        } else {
            recorridoInOrder(raiz.hIzq);
            System.out.println(raiz);
            recorridoInOrder(raiz.hDer);

        }
    }

}
