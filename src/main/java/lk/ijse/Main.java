package lk.ijse;

import lk.ijse.Config.FactoryConfiguration;
import lk.ijse.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(3);
        student.setName("Sanki");
        student.setAddress("Panadura");

        //System.out.println(student);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        //session.save(student);
        //session.update(student);
        //session.delete(student);
        Student s = session.get(Student.class,2);
        System.out.println(s);
        transaction.commit();
        session.close();
    }
}