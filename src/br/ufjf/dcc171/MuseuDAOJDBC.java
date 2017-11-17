package br.ufjf.dcc171;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MuseuDAOJDBC implements MuseuDAO{
    private Connection conexao;
    private PreparedStatement operacaoEntrada;
    private PreparedStatement operacaoSaida;

    public MuseuDAOJDBC() throws Exception{
        conexao = ConexaoJavaDB.getConnection();
        operacaoEntrada = conexao.prepareStatement("");
        operacaoSaida = conexao.prepareStatement("");   
    }
    
    public void entrada (Visitante visit) throws Exception
    {
        
    }
    
    public void saida (Visitante visit) throws Exception
    {
        
    }
    
}
