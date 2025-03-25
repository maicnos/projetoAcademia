package alunoDAO;
import dao.CRUD;
import model.Aluno;

import java.util.List;


public interface AlunoDAO extends CRUD<Aluno>{
    List<Aluno> buscar_nome();
}
