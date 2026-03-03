import java.util.*;

public class ListaContactos {
    private ArrayList<Contacto> contactos;

    public ListaContactos() {
        this.contactos = new ArrayList<>();
    }

    public void insertar(Contacto contacto){
        this.contactos.add(contacto);
        System.out.println("Contacto agregado");
    }

    public Contacto buscar(String nombre){
        for (Contacto contacto : this.contactos){
             if(contacto.getNombre().equalsIgnoreCase(nombre)){
                 return contacto;
             }
        }
        return null;
    }

    public boolean eliminar ( String nombre ){
        for (Contacto contacto : this.contactos){
            if (contacto.getNombre().equalsIgnoreCase(nombre)){
                return this.contactos.remove(contacto);
            }
        }
        return false;
    }

    public void listar(){
        for (Contacto contacto : this.contactos){
            System.out.println(contacto);
        }
    }
}
