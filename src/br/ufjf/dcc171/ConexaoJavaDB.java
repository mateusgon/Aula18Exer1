package br.ufjf.dcc171;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoJavaDB {
    private static Connection instancia = null;
    public static Connection getConnection() throws Exception
    {
        if (instancia == null)
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String driverURL = "jdbc:derby://localhost:1527/2017-3-dcc171-exerc1";
            Connection conexao = DriverManager.getConnection(driverURL, "mateus", "123");
            return instancia;
        }
        else
        {
            return instancia;
        }
    }
}
