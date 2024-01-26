package lk.ijse;

import lk.ijse.Config.FactoryConfiguration;
import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setName("Piumini");
        student.setAddress("Panadura");

        //System.out.println(student);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        //session.update(student);
        //session.delete(student);
        transaction.commit();
        session.close();
    }
}