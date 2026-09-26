package br.edu.unijui.ecommerce.repository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {

    @Test
    void deveSalvarEBuscarUmObjeto() {
        Repository<String> repository = new Repository<>();

        repository.salvar(1, "Produto");

        String resultado = repository.buscarPorId(1);

        assertEquals("Produto", resultado);
    }
}