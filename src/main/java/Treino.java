import java.util.ArrayList;
import java.util.List;

class Treino {
    private int id;
    private String nome;
    private String descricao;
    private List<String> exercicios;
    private int duracaoSemanas;

    public Treino(int id, String nome, String descricao, List<String> exercicios, int duracaoSemanas) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.exercicios = new ArrayList<>(exercicios);
        this.duracaoSemanas = duracaoSemanas;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getExercicios() {
        return exercicios;
    }

    public void setExercicios(List<String> exercicios) {
        this.exercicios = exercicios;
    }

    public int getDuracaoSemanas() {
        return duracaoSemanas;
    }

    public void setDuracaoSemanas(int duracaoSemanas) {
        this.duracaoSemanas = duracaoSemanas;
    }
}
