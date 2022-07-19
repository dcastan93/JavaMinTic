package ClasesJavaUIS.Tienda;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;


public class Conexion {
    private String conectorInstalado = "jdbc:sqlite";
    private String baseDatos = "..\\..\\basedatos\\databaseproductos.db";
    private Connection conexion;
    private Statement ejecutorSQL;

    public boolean crearConexion(){
        try {
            conexion = DriverManager.getConnection(conectorInstalado+baseDatos);//se agrego la bd para que sea ejecutada
            ejecutorSQL = conexion.createStatement(); //se encarga de ejecutar la sentencia SQL
            ejecutorSQL.setQueryTimeout(30);//cuanto tiempo se espera para que se de la conexion
            return true;

        }
        catch (Exception e){
            return false;

        }
    }

    public boolean cerrarConexion(){
        try {
            conexion.close();
            return true;
        }
        catch (Exception e){
            return false;
        }



    }
}
