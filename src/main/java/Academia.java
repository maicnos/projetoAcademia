import java.util.List;
import java.util.ArrayList;

class Academia implements CRUD<Aluno>{
    private int id;
    private String nome;
    private String endereco;
    private List<Aluno> listaAlunos;

    public Academia(int id, String nome, String endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.listaAlunos = new ArrayList<>();
    }


    @Override
    public void adicionar(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    @Override
    public void remover(int id) {
        listaAlunos.removeIf(aluno -> aluno.getId() == id);
    }

    @Override
    public Aluno buscar(int id) {
        for (Aluno aluno : listaAlunos) {
            if (aluno.getId() == id) {
                return aluno;
            }
        }
        return null;
    }

    @Override
    public void atualizar(int id, Aluno novoAluno) {
        Aluno aluno = buscar(id);
        if (aluno != null) {
            aluno.setNome(novoAluno.getNome());
            aluno.setIdade(novoAluno.getIdade());
            aluno.setEmail(novoAluno.getEmail());
            aluno.setTelefone(novoAluno.getTelefone());
            aluno.setPlanoTreino(novoAluno.getPlanoTreino());
        }
    }

    public Treino consultarTreinoAluno(int id) {
        Aluno aluno = buscar(id);
        return (aluno != null) ? aluno.getPlanoTreino() : null;
    }
}