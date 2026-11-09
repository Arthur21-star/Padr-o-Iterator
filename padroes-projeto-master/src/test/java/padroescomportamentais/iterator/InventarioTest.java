package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventarioTest {

    @Test
    void deveContarLivrosDisponiveisAcervo() {
        Acervo acervo = new Acervo(
                new Livro("Clean Code", true),
                new Livro("Refactoring", true),
                new Livro("Domain-Driven Design", false),
                new Livro("Design Patterns", true)
        );
        assertEquals(3, Inventario.contarLivrosDisponiveisAcervo(acervo));
    }

    @Test
    void deveContarTotalLivrosAcervo() {
        Acervo acervo = new Acervo(
                new Livro("Clean Code", true),
                new Livro("Refactoring", true),
                new Livro("Domain-Driven Design", false),
                new Livro("Design Patterns", true)
        );
        assertEquals(4, Inventario.contarTotalLivrosAcervo(acervo));
    }

}