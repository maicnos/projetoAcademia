interface CRUD<T> {
    void adicionar(T obj);
    void remover(int id);
    T buscar(int id);
    void atualizar(int id, T obj);
}
