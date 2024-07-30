package DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Categoria;
import model.Cliente;

public class CategoriaDAO {

    EntityManagerFactory entityManFac =
            Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = entityManFac.createEntityManager();

    public Categoria buscarCategoriaPorId(int id)
    {
        entityManager.getTransaction().begin();
        Categoria objetoaencontrado = entityManager.find(Categoria.class, id );
        return objetoaencontrado;
    }


}
