package listas.LDEC;

public class testParcial {
    public static void parcialito(LDEC lista1, LDEC lista2) {
        int size = 0;
        LDEC.Node y = lista2.first;

        do {
            y = y.next;
            size++;
        } while (y != lista2.first);
        System.out.println(size);


        LDEC.Node x = lista1.first;
        boolean finish = false;
        int ct = 0;
        LDEC.Node aux;
        do {
            do{
                if (x.data == y.data)
                    for(int i = 1; i == size; i++){
                        if(x.data == y.data){
                            ct++;
                        }
                        x = x.next; y = y.next;
                    } else {
                        x = x.next;
                    }
                if (ct == size){

                }
            } while (x.next != lista1.first);
        } while (finish);

    }
    
}
