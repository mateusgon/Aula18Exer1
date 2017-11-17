package br.ufjf.dcc171;


interface MuseuDAO {
    public void entrada (Visitante visit) throws Exception;
    public void saida (Visitante visit) throws Exception;
}
