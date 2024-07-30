package DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.Categoria;
import model.Cliente;

public class ClienteDAO {

    EntityManagerFactory entityManFac =
            Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = entityManFac.createEntityManager();

    public void inserirCliente(Cliente c)
    {
       entityManager.getTransaction().begin();
       Categoria cat  = entityManager.find(Categoria.class, 2);
       c.setCateg(cat);
       entityManager.persist(c);
       entityManager.getTransaction().commit();
    }

    public void excluirCliente(Cliente c)
    {
        entityManager.getTransaction().begin();
        Cliente objetoaexcluir = entityManager.find(Cliente.class, c.getId() );
        entityManager.remove(objetoaexcluir);
    }

    public  Cliente buscarClientePorId(int id)
    {
        entityManager.getTransaction().begin();
        Cliente objetoaencontrado = entityManager.find(Cliente.class, id );
        return objetoaencontrado;
    }



}
