package dao;
import java.util.List;


public interface CRUD<T> {
    void adicionar(T obj);
    void remover(int id);
    T buscar_id(int id);
    List<T> buscar_todos();
    void atualizar(int id, T obj);
}
