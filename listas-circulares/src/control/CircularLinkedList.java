package control;

import model.Contact;
import model.Node;

public class CircularLinkedList {
    private Node tail;
    private int size;

    public CircularLinkedList() {
        this.tail = null;
        this.size = 0;
    }

    /*insertar al final de la lista*/
    public void add(Contact contact){
      Node newNode = new Node(contact);

      if (tail == null){
          //lista vacia
          tail = newNode;
          tail.setFollowing(tail);
      }else {
          newNode.setFollowing(tail.getFollowing());
          tail.setFollowing(newNode);
          tail = newNode;
      }
      size ++;

    }

    public Contact finsByName(String name){
        if (tail == null) return null;

        Node current = tail.getFollowing();

        do {
            if (current.getFact().getName().equalsIgnoreCase(name)) {
                return current.getFact();
            }
            current = current.getFollowing();

        } while ( current != tail.getFollowing());
            return null;
    }

    public boolean deleteByName(String name) {
        if(tail == null) return false;

        Node current = tail.getFollowing();
        Node previous = tail;

        do{
            if (current.getFact().getName().equalsIgnoreCase(name)) {
                // caso 1: unico nodo
                if (current ==tail && current.getFollowing() == tail){
                    tail = null;
                }
                // caso 2: Eliminar primer nodo

                else if (current == tail.getFollowing()) {
                    tail.setFollowing(current.getFollowing());
                }
                // caso 3: Eliminar ultimo nodo
                else if (current == tail) {
                    previous.setFollowing(current.getFollowing());
                    tail = previous;
                }
                //caso 4: Nodo intermedio
                else {
                    previous.setFollowing(current.getFollowing());
                }
                size --;
                return true;
            }

            previous = current;
            current = current.getFollowing();

        }while (current != tail.getFollowing());
        return false;
    }

    //mostrar todos los eleme|ntos de la lista
    public void listAll() {
        if (tail == null){
            System.out.println("lista vacia");
            return;
        }

        Node current = tail.getFollowing();
        do{
            System.out.println(current.getFact());
            current = current.getFollowing();

        }while(current != tail.getFollowing());

    }

    //Obtener el tamaño de la lista
    public int getSize() {
        return size;
    }

    //Verificar si la lista esta vacia
    public boolean isEmpty() {
        return tail == null;
    }

}
