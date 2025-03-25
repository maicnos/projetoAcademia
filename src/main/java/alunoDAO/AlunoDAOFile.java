package alunoDAO;
import dao.AlunoDAO;
import model.Aluno;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAOFile implements AlunoDAO {
    private static final String FILE_NAME = "alunos.txt";

    public AlunoDAOFile() {
        File file = new File(FILE_NAME);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e)
    }

    @Override
    public List<Aluno> buscar_nome() {

    }

    @Override
    public void adicionar(Aluno obj) {

    }

    @Override
    public void remover(int id) {

    }

    @Override
    public Aluno buscar_id(int id) {


    }

    @Override
    public List<Aluno> buscar_todos() {
        List<Aluno> alunos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    Aluno aluno = new Aluno(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),parts[2],parts[3]);
                    alunos.add(aluno);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return alunos;
    }

    @Override
    public void atualizar(int id, Aluno obj) {

    }
}
