
package control;

import java.sql.SQLException;
import model.bean.Aluno;
import model.dao.AlunoDAO;


public class ControlaAluno {
    
    public boolean insereAluno(int ra, String nome) throws SQLException{
    
        Aluno al = new Aluno (ra, nome);
        AlunoDAO alDAO = new AlunoDAO();
        boolean inseriu = alDAO.inserir(al);
        return inseriu;
        
    }
    
    public boolean excluiAluno(int ra, String nome) throws SQLException{
    
        Aluno al = new Aluno (ra, nome);
        AlunoDAO alDAO = new AlunoDAO();
        boolean excluiu = alDAO.excluir(al);
        return excluiu;
        
    }
    
}
