package br.edu.unijui.ecommerce.repository;

import java.util.HashMap;
import java.util.Map;

public class Repository<T> {

    private final Map<Integer, T> dados = new HashMap<>();

    public void salvar(Integer id, T objeto) {
        dados.put(id, objeto);
    }

    public T buscarPorId(Integer id) {
        return dados.get(id);
    }
}