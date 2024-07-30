package com.example.exemplohibernatejpa;


import DAO.CategoriaDAO;
import DAO.ClienteDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import model.Categoria;
import model.Cliente;

import java.sql.SQLOutput;
import java.util.List;

public class AplicacaoMain {
    public static void main(String[] args) {
        System.out.println("Iniciando APP");

        ClienteDAO cDAO = new ClienteDAO();
        Cliente c = new Cliente();

        c.setNome("Alex ");
        c.setEmail("asilva@gmail.com");

        cDAO.inserirCliente(c);

        Cliente resultadobusca = cDAO.buscarClientePorId(1);
        System.out.println("*******************");
        System.out.println(resultadobusca.getCateg().getDescricao());
        System.out.println("*******************");


        CategoriaDAO catDAO = new CategoriaDAO();
        Categoria cat = catDAO.buscarCategoriaPorId(1);

        System.out.println("*******************");
        for(int i = 0; i < cat.getListaCliente().size(); i++){

            System.out.println(cat.getListaCliente().get(i).getNome());
        }
        System.out.println("*******************");


      //  Cliente resultadodabusca = cDAO.buscarClientePorId(1);



    }


}
