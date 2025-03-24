import java.util.ArrayList;
import java.util.List;
import java.util.Date;

class Aluno {
    private int id;
    private String nome;
    private int idade;
    private String email;
    private String telefone;
    private Treino planoTreino;
    private Date dataMatricula;
    private Date dataVencimento;

    public Aluno(int id, String nome, int idade, String email, String telefone, Treino planoTreino, Date dataMatricula, Date dataVencimento) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telefone = telefone;
        this.planoTreino = planoTreino;
        this.dataMatricula = dataMatricula;
        this.dataVencimento = dataVencimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Treino getPlanoTreino() {
        return planoTreino;
    }

    public void setPlanoTreino(Treino planoTreino) {
        this.planoTreino = planoTreino;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}