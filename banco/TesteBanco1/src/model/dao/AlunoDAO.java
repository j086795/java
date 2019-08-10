
package model.dao;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.bean.Aluno;


public class AlunoDAO {
    
    Connection con = null;
    
    public boolean inserir (Aluno al) throws SQLException
    {
       boolean inseriu = false;
       try{
       
           con = new Conexao().getConnection();
           String sql = "INSERT INTO Alunos (RA,N0ME) values (?,?)";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1, al.getRA());
           stmt.setString(2, al.getNome());
           stmt.execute();
           stmt.close();
           inseriu=true;
           }catch (Exception ex){
            ex.printStackTrace();
           }
           finally
            {
                con.close();
            }
       
       return inseriu;
    
    }
    
    public boolean excluir (Aluno al) throws SQLException
    {
       boolean excluiu = false;
       try{
       
           con = new Conexao().getConnection();
           String sql = "DELETE FROM Alunos WHERE RA = ?";
           PreparedStatement stmt = con.prepareStatement(sql);
           stmt.setInt(1, al.getRA());
           stmt.execute();
           stmt.close();
           excluiu=true;
           }catch (Exception ex){
            ex.printStackTrace();
           }
           finally
            {
                con.close();
            }
       
       return excluiu;
    
    }
    
}
