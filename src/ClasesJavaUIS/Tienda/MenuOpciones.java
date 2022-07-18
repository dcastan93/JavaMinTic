package ClasesJavaUIS.Tienda;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;

public class MenuOpciones {
    private String []  menuPrincipal;
    private String  menuProductos;
    private Bodega bodega;
    public MenuOpciones(){
        this.bodega = new Bodega();
        this.menuPrincipal = new String[]{" Gestionar productos ",
                " Realizar venta", " Salir "};
        this.menuProductos = "Menu productos \n"+ "1. Ingresar producto \n"+
               "2. Mostrar productos\n" + "3. Buscar un producto\n" +"4. Surtir producto\n"+
                "0. Volcer al menu principal \n";
    }


    public void presentarMenuPrincipal(){
        int opcion = 0;
        do{
            Object o = ( JOptionPane.showInputDialog(null, "Seleccione opción", "Programa del veci",
                    JOptionPane.QUESTION_MESSAGE, null,  this.menuPrincipal, this.menuPrincipal[0]));
            //switch para cada opcion
            opcion = Arrays.asList(this.menuPrincipal).indexOf(o);


            switch (opcion) {
                case 0:
                    this.presentarMenuProductos();
                    break;
                case 1:

                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Muchas gracias", "salida", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
            }


        }while(opcion != 2);
    }

    public void presentarMenuProductos(){
        //variable para generar opcion
        int opcion = 0;
        //ciclo indefinido para que entre al menos una vez
        do{
            //pregunta por opcion
            opcion =Integer.parseInt( JOptionPane.showInputDialog(null, this.menuProductos));
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

                case 4:
                    surtirProducto();

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
        String datosProductos = "";
        ArrayList<Producto> lista = this.bodega.getProductosAlmacenados();
        for (Producto p : lista) {
            datosProductos = datosProductos + p.mostrarInformacion()+ "\n";

        }
        JOptionPane.showMessageDialog(null, datosProductos,
                "producto encontrados", JOptionPane.INFORMATION_MESSAGE);
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

    public void surtirProducto(){
        this.buscarProductos();
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "digite codigo de producto para surtir",
                "Surtir producto", JOptionPane.QUESTION_MESSAGE));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad de producto para surtir",
                "Surtir producto", JOptionPane.QUESTION_MESSAGE));
        this.bodega.incrementarProducto(codigo, cantidad);
        Producto p = this.bodega.getProducto(codigo);
        JOptionPane.showMessageDialog(null, p.mostrarInformacion(),
                "producto surtido", JOptionPane.INFORMATION_MESSAGE);



    }
}
