
package boletin22;

import javax.swing.JOptionPane;

public class Boletin22 {

    public static void main(String[] args) {
        Libreria lib1 = new Libreria();
        int op;

        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(">>>MENU<<< \n1. Añadir libro \n2. Vender libro \n3. Visualizar (Ordenado) \n4. Eliminar libro \n5. Buscar \n6. \n7. Salir"));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                op = 0;
            }

            switch (op) {

                case 1:
                    lib1.añadirLibro();
                    break;
                case 2:
                    lib1.venderLibro();
                    break;
                case 3:
                    lib1.visualizarOrdenado();
                    break;
                case 4:
                    lib1.darDeBaja();
                    break;
                case 5:
                    lib1.buscar();
                    break;
                case 6:
                    lib1.escribirTexto("file.txt");
                case 7:
                    System.exit(0);
            }

        } while (op < 7);

    }
}
    

