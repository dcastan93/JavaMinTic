package ClasesJavaUIS.Tienda;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class MenuOpciones {
    private String menuPrincipal;
    private Bodega bodega;
    public MenuOpciones(){
        this.bodega = new Bodega();
        this.menuPrincipal = "Menu principal \n"+ "1. Ingresar producto \n"+
               "2. Mostrar productos\n" + "3. Buscar un producto\n" +"0. Salir \n";
    }

    public void presentarMenuPrincipal(){
        //variable para generar opcion
        int opcion = 0;
        //ciclo indefinido para que entre al menos una vez
        do{
            //pregunta por opcion
            opcion =Integer.parseInt( JOptionPane.showInputDialog(null, this.menuPrincipal));
            //switch para cada opcion

            switch (opcion){
                case 1:
                    ingresarProducto();
                    break;
                case 2:
                    mostrarProductos();
                    break;
                case 3:
                    buscarProductos();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "!!Hasta pronto!!", "Salir", JOptionPane.INFORMATION_MESSAGE);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta", "Error", JOptionPane.ERROR_MESSAGE);


            }



        }while(opcion !=0);

    }

    public void ingresarProducto(){
       int id =Integer.parseInt( JOptionPane.showInputDialog(null,
               "Ingrese codigo de producto", "CodigoProducto",
               JOptionPane.QUESTION_MESSAGE));
       String [] tipos = {"Aseo", "Alimento"};

       int tipo =( JOptionPane.showOptionDialog(null,
                "Ingrese tipo de producto", "TipoProducto",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tipos, tipos[0]) );


       String nombre =( JOptionPane.showInputDialog(null,
                "Ingrese nombre de producto", "NombreProducto",
                JOptionPane.QUESTION_MESSAGE));

       String marca =( JOptionPane.showInputDialog(null,
                "Ingrese marca de producto", "MarcaProducto",
                JOptionPane.QUESTION_MESSAGE));

       String presentacion =( JOptionPane.showInputDialog(null,
                "Ingrese presentacion de producto", "presentacionProducto",
                JOptionPane.QUESTION_MESSAGE));
       int precio = Integer.parseInt( JOptionPane.showInputDialog(null,
                "Ingrese precio de producto", "PrecioProducto",
                JOptionPane.QUESTION_MESSAGE));
       int cantidad = Integer.parseInt( JOptionPane.showInputDialog(null,
                "Ingrese cantidad de producto", "CantidadProducto",
                JOptionPane.QUESTION_MESSAGE));

       Producto p = new Producto(id,tipos[tipo], nombre, marca, presentacion, cantidad, precio);
       this.bodega.anadirProducto(p);

       JOptionPane.showMessageDialog(null, "Producto agregado correctamente",
               "producto añadido", JOptionPane.INFORMATION_MESSAGE );
    }

    public void mostrarProductos(){
        ArrayList<Producto> lista = this.bodega.getProductosAlmacenados();
        for (Producto p : lista) {
            JOptionPane.showMessageDialog(null, p.toString(),
                    "producto en la lista", JOptionPane.INFORMATION_MESSAGE );

        }
    }

    public void buscarProductos(){
        String buscar =( JOptionPane.showInputDialog(null,
                "Ingrese criterio de busqueda del producto (tipo, nombre, presentación, codico)", "buscar",
                JOptionPane.QUESTION_MESSAGE));
        ArrayList<Producto> lista = this.bodega.buscarProducto(buscar);
        String datosProductos = "";
        for (Producto p : lista) {
            datosProductos = datosProductos + p.mostrarInformacion()+ "\n";

        }
        if (datosProductos.equals("")){
            JOptionPane.showMessageDialog(null, "No se encontraron productos con ese criterio",
                    "producto en la lista", JOptionPane.WARNING_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, datosProductos,
                    "producto encontrados", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
