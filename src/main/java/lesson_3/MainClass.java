package lesson_3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Book.class)
                .addAnnotatedClass(Author.class)
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(Client.class)
                .addAnnotatedClass(ClientChoice.class)
                .addAnnotatedClass(Reader.class)
                .buildSessionFactory();
        // CRUD
        Session session = null;
//
        session = factory.getCurrentSession();
        session.beginTransaction();
        List<Product> readers = session.createQuery("from ClientChoice").getResultList();
        System.out.println(readers);
        session.getTransaction().commit();
//
//        try {
//            // CREATE
//            session = factory.getCurrentSession();
//            ClientChoice clientChoice = new ClientChoice();
//            clientChoice.setClient_id(1);
//            clientChoice.setId(1);
//            clientChoice.setProduct_id(2);
//            session.beginTransaction();
//            session.save(clientChoice);
//            session.getTransaction().commit();
//        } finally {
//            factory.close();
//            session.close();
//        }
//
//        try {
//           // CREATE
//            session = factory.getCurrentSession();
//            Product tmpPrd = new Product();
//            tmpPrd.setTitle("Banana");
//            tmpPrd.setPrice(200);
////            tmpPrd.set(100);
//            session.beginTransaction();
//            session.save(tmpPrd);
//            session.getTransaction().commit();
//        } finally {
//            factory.close();
//            session.close();
//        }

  //          READ
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            ClientChoice harryPotterBook = session.get(ClientChoice.class, 1);
//            session.getTransaction().commit();
//            System.out.println(harryPotterBook);

//            UPDATE
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Book bookJava1 = session.get(Book.class, 3);
//            bookJava1.setTitle("Java 1 Advanced");
//            session.getTransaction().commit();
//            System.out.println(bookJava1);

//DELETE
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Book bookJava1 = session.get(Book.class, 1);
//            session.delete(bookJava1);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//////             подставлем условие 1 из трех законменированных вариантов
//         List<Product> allProducts = session.createQuery("from Product").getResultList();
////          List<Book> allBooks = session.createQuery("from Book b where b.title = 'Java 1 Advanced'").getResultList();
////          List<Book> allBooks = session.createQuery("from Book b where b.title = :title").setParameter("title", "Java 2").getResultList();
//            System.out.println(allProducts);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            session.createQuery("delete from Book where id = 3").executeUpdate();
//            session.getTransaction().commit();


        //            session.createQuery("delete from Book where id = 3").executeUpdate();

// CREATE
//        try {
//            session = factory.getCurrentSession();
//            Client client = new Client();
//            client.setName("Vasya");
//            session.beginTransaction();
//            session.save(client);
//            session.getTransaction().commit();
//        } finally {
//            factory.close();
//            session.close();
//        }

//        session = factory.getCurrentSession();
//        session.beginTransaction();
//        Author author = session.get(Author.class, 2);
//        session.delete(author);
//        session.getTransaction().commit();

//        session = factory.getCurrentSession();
//        session.beginTransaction();
//        Author author = session.get(Author.class, 2);
//        session.delete(author);
//        session.getTransaction().commit();
////
//            session = factory.getCurrentSession();
//        session.beginTransaction();
//        Reader reader = session.get(Reader.class, 1);
//        System.out.println(reader);
//        session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            List<Author> author = session.createQuery("from Author").getResultList();
//            System.out.println(author);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Author author = session.get(Author.class, 1);
//            session.delete(author);
//            session.getTransaction().commit();
//        } finally {
//            factory.close();
//            session.close();
//        }
    }
}
