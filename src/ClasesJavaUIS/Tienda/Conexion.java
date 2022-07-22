package ClasesJavaUIS.Tienda;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;


public class Conexion {
    private String conectorInstalado = "jdbc:sqlite:";
    private String baseDatos = "C:\\Users\\dcast\\IdeaProjects\\JavaMinTic\\basedatos\\databaseproductos.db";
    private Connection conexion;
    private Statement ejecutorSQL;
    private ResultSet rs;

    public boolean crearConexion(){
        try {
            conexion = DriverManager.getConnection(conectorInstalado+baseDatos);//se agrego la bd para que sea ejecutada
            System.out.println("Connection to SQLite has been established.");
            ejecutorSQL = conexion.createStatement(); //se encarga de ejecutar la sentencia SQL
            System.out.println("ejecutor to SQLite has been started.");
            ejecutorSQL.setQueryTimeout(30);//cuanto tiempo se espera para que se de la conexion
            System.out.println("ejecutor has waited for 30 seconds.");
            return true;

        }
        catch (Exception e){
            System.out.println("Connection to SQLite has not been established.");
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
    public boolean actualizarDatosBD(String sql){
        try
        {
            int cant = ejecutorSQL.executeUpdate(sql);
            if (cant > 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch (Exception e)
        {
            return false;
        }
    }
    public ResultSet consultarDatosBD(String sql){
        try {
            rs = ejecutorSQL.executeQuery(sql);//si se ejecuta el query se devuelve lista con registros afectados
            return rs;
        }
        catch (Exception e){
            return null;

        }
    }
    public boolean borrarDatosBD(String sql){
        try
        {
            int cant = ejecutorSQL.executeUpdate(sql);
            if (cant > 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
