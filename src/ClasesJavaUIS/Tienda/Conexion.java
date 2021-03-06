package ClasesJavaUIS.Tienda;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;


public class Conexion {
    private String conectorInstalado = "jdbc:sqlite";
    private String baseDatos = "..\\..\\basedatos\\databaseproductos.db";
    private Connection conexion;
    private Statement ejecutorSQL;
    private ResultSet rs;

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
    public void insertarDatosBD(String sql){
        try {
            rs = ejecutorSQL.executeQuery(sql);

        }
        catch (Exception e){

        }
    }
    public void actualizarDatosBD(String sql){
        try {
            int cant = ejecutorSQL.executeUpdate(sql);//devuelve un entero con el numero de registros modificados

        }
        catch (Exception e){

        }
    }
    public void consultarDatosBD(String sql){
        try {
            rs = ejecutorSQL.executeQuery(sql);//si se ejecuta el query se devuelve lista con registros afectados
        }
        catch (Exception e){

        }
    }
    public void borrarDatosBD(String sql){
        try {
            int cant = ejecutorSQL.executeUpdate(sql);//devuelve un entero con el numero de registros modificados

        }
        catch (Exception e){

        }
    }
}
