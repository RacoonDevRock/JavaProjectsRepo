package com.springboot.jpa.relations;

import com.springboot.jpa.relations.entities.*;
import com.springboot.jpa.relations.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.Set;

@SpringBootApplication
public class SpringbootJpaRelationshipApplication implements CommandLineRunner {
    private final ClientRepository clientRepository;
    private final InvoiceRepository invoiceRepository;
    private final ClientDetailsRepository clientDetailsRepository;
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    @Autowired
    public SpringbootJpaRelationshipApplication(ClientRepository clientRepository, InvoiceRepository invoiceRepository, ClientDetailsRepository clientDetailsRepository, StudentRepository studentRepository, CourseRepository courseRepository) {
        this.clientRepository = clientRepository;
        this.invoiceRepository = invoiceRepository;
        this.clientDetailsRepository = clientDetailsRepository;
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJpaRelationshipApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        manyToManyRemoveBidireccionalFind();
    }
    @Transactional
    public void manyToManyRemoveBidireccionalFind() {

        Optional<Student> studentOptional1 = studentRepository.findOneWithCourses(1L);
        Optional<Student> studentOptional2 = studentRepository.findOneWithCourses(2L);

        Student student1 = studentOptional1.get();
        Student student2 = studentOptional2.get();

        Course course1 = courseRepository.findOneWithStudents(1L).get();
        Course course2 = courseRepository.findOneWithStudents(2L).get();

        // student1.setCourses(Set.of(course1, course2));
        // student2.setCourses(Set.of(course2));
        student1.addCourse(course1);
        student1.addCourse(course2);
        student2.addCourse(course2);

        studentRepository.saveAll(Set.of(student1, student2));

        System.out.println(student1);
        System.out.println(student2);

        Optional<Student> studentOptionalDb = studentRepository.findOneWithCourses(1L);
        if (studentOptionalDb.isPresent()) {

            Student studentDb = studentOptionalDb.get();
            Optional<Course> courseOptionalDb = courseRepository.findOneWithStudents(1L);

            if (courseOptionalDb.isPresent()) {
                Course courseDb = courseOptionalDb.get();
                studentDb.removeCourse(courseDb);

                studentRepository.save(studentDb);
                System.out.println(studentDb);
            }
        }
    }

    @Transactional
    public void manyToManyBidireccionalFind() {

        Optional<Student> studentOptional1 = studentRepository.findOneWithCourses(1L);
        Optional<Student> studentOptional2 = studentRepository.findOneWithCourses(2L);

        Student student1 = studentOptional1.get();
        Student student2 = studentOptional2.get();

        Course course1 = courseRepository.findOneWithStudents(1L).get();
        Course course2 = courseRepository.findOneWithStudents(2L).get();

        // student1.setCourses(Set.of(course1, course2));
        // student2.setCourses(Set.of(course2));
        student1.addCourse(course1);
        student1.addCourse(course2);
        student2.addCourse(course2);

        studentRepository.saveAll(Set.of(student1, student2));

        System.out.println(student1);
        System.out.println(student2);
    }

    @Transactional
    public void manyToManyBidireccionalRemove() {

        Student student1 = new Student("Jano", "Pura");
        Student student2 = new Student("Erba", "Doe");

        Course course1 = new Course("Curso de java master", "Andres");
        Course course2 = new Course("Curso de Spring Boot", "Andres");

        // student1.setCourses(Set.of(course1, course2));
        // student2.setCourses(Set.of(course2));

        student1.addCourse(course1);
        student1.addCourse(course2);
        student2.addCourse(course2);

        studentRepository.saveAll(Set.of(student1, student2));

        System.out.println(student1);
        System.out.println(student2);

        Optional<Student> studentOptionalDb = studentRepository.findOneWithCourses(3L);
        if (studentOptionalDb.isPresent()) {

            Student studentDb = studentOptionalDb.get();
            Optional<Course> courseOptionalDb = courseRepository.findOneWithStudents(3L);

            if (courseOptionalDb.isPresent()) {
                Course courseDb = courseOptionalDb.get();
                studentDb.removeCourse(courseDb);

                studentRepository.save(studentDb);
                System.out.println(studentDb);
            }
        }
    }

    @Transactional
    public void manyToManyBidireccional() {

        Student student1 = new Student("Jano", "Pura");
        Student student2 = new Student("Erba", "Doe");

        Course course1 = new Course("Curso de java master", "Andres");
        Course course2 = new Course("Curso de Spring Boot", "Andres");

        // student1.setCourses(Set.of(course1, course2));
        // student2.setCourses(Set.of(course2));

        student1.addCourse(course1);
        student1.addCourse(course2);
        student2.addCourse(course2);

        studentRepository.saveAll(Set.of(student1, student2));

        System.out.println(student1);
        System.out.println(student2);
    }

    @Transactional
    public void manyToManyRemove() {
        Student student = new Student("Jano", "Pura");
        Student student1 = new Student("Mero", "Guero");

        Course course = new Course("Curso spring", "Andre");
        Course course1 = new Course("Curso web", "Nicolas");

        student.setCourses(Set.of(course, course1));
        student1.setCourses(Set.of(course1));

        studentRepository.saveAll(Set.of(student, student1));

        System.out.println(student);
        System.out.println(student1);

        Optional<Student> studentOptionalDB = studentRepository.findOneWithCourses(4L);
        if (studentOptionalDB.isPresent()) {
            Student studentDB = studentOptionalDB.get();
            Optional<Course> courseOptional = courseRepository.findById(3L);

            if (courseOptional.isPresent()) {
                Course courseDB = courseOptional.get();
                studentDB.getCourses().remove(courseDB);

                studentRepository.save(studentDB);
                System.out.println(studentDB);
            }
        }
    }

    @Transactional
    public void manyToManyRemoveFind() {
        Optional<Student> studentOptional = studentRepository.findById(1L);
        Optional<Student> studentOptional1 = studentRepository.findById(2L);

        Student student = studentOptional.get();
        Student student1 = studentOptional1.get();

        Course course = courseRepository.findById(1L).get();
        Course course1 = courseRepository.findById(2L).get();

        student.setCourses(Set.of(course, course1));
        student1.setCourses(Set.of(course1));

        studentRepository.saveAll(Set.of(student, student1));

        System.out.println(student);
        System.out.println(student1);

        Optional<Student> studentOptionalDB = studentRepository.findOneWithCourses(1L);
        if (studentOptionalDB.isPresent()) {
            Student studentDB = studentOptionalDB.get();
            Optional<Course> courseOptional = courseRepository.findById(2L);

            if (courseOptional.isPresent()) {
                Course courseDB = courseOptional.get();
                studentDB.getCourses().remove(courseDB);

                studentRepository.save(studentDB);
                System.out.println(studentDB);
            }
        }
    }

    @Transactional
    public void manyToManyFind() {
        Optional<Student> studentOptional = studentRepository.findById(1L);
        Optional<Student> studentOptional1 = studentRepository.findById(2L);

        Student student = studentOptional.get();
        Student student1 = studentOptional1.get();

        Course course = courseRepository.findById(1L).get();
        Course course1 = courseRepository.findById(2L).get();

        student.setCourses(Set.of(course, course1));
        student1.setCourses(Set.of(course1));

        studentRepository.saveAll(Set.of(student, student1));

        System.out.println(student);
        System.out.println(student1);
    }

    @Transactional
    public void manyToMany() {
        Student student = new Student("Jano", "Pura");
        Student student1 = new Student("Mero", "Guero");

        Course course = new Course("Curso spring", "Andre");
        Course course1 = new Course("Curso web", "Nicolas");

        student.setCourses(Set.of(course, course1));
        student1.setCourses(Set.of(course1));

        studentRepository.saveAll(Set.of(student, student1));

        System.out.println(student);
        System.out.println(student1);
    }

    @Transactional
    public void oneToOneBidireccionalFindById() {
        Optional<Client> clientOptional = clientRepository.findOne(1L);
        clientOptional.ifPresent(client -> {
            ClientDetails clientDetails = new ClientDetails(true, 300);

            client.setClientDetails(clientDetails);
            clientDetails.setClient(client);
            clientRepository.save(client);

            System.out.println(client);
        });
    }

    @Transactional
    public void oneToOneBidireccional() {
        Client client = new Client("Wagner", "Sanchez");
        ClientDetails clientDetails = new ClientDetails(true, 300);

        client.setClientDetails(clientDetails);
        clientDetails.setClient(client);
        clientRepository.save(client);

        System.out.println(client);
    }

    @Transactional
    public void oneToOneFindById() {
        ClientDetails clientDetails = new ClientDetails(true, 300);
        clientDetailsRepository.save(clientDetails);

        Optional<Client> optionalClient = clientRepository.findOne(2L);
        optionalClient.ifPresent(client -> {
            client.setClientDetails(clientDetails);
            clientRepository.save(client);

            System.out.println(client);
        });
    }

    @Transactional
    public void oneToOne() {
        ClientDetails clientDetails = new ClientDetails(true, 300);
        clientDetailsRepository.save(clientDetails);

        Client client = new Client("Wagner", "Sanchez");
        client.setClientDetails(clientDetails);
        clientRepository.save(client);

        System.out.println(client);
    }

    @Transactional
    public void removeInvoiceBidireccional() {
        Client client = new Client("Frank", "Cortez");

        Invoice invoice0 = new Invoice("rental", 435L);
        Invoice invoice1 = new Invoice("san valentin", 545L);
        Invoice invoice2 = new Invoice("Birthday", 987L);

        client.setInvoices(Set.of(invoice0, invoice1, invoice2));
        invoice0.setClient(client);
        invoice1.setClient(client);
        invoice2.setClient(client);
        clientRepository.save(client);

        System.out.println(client);

        Optional<Client> optionalClientBD = clientRepository.findOne(3L);

        optionalClientBD.ifPresent(clientDB -> {
//            Invoice invoice4 = new Invoice("traka", 545L);
//            invoice4.setId(1L);

            Optional<Invoice> invoiceOptional = invoiceRepository.findById(2L);
            invoiceOptional.ifPresent(invoice -> {
                clientDB.removeInvoice(invoice);
                clientRepository.save(clientDB);
                System.out.println(clientDB);
            });
        });
    }

    @Transactional
    public void removeInvoiceBidireccionalFindById() {
        Optional<Client> optionalClient = clientRepository.findOne(1L);

        optionalClient.ifPresent(clie -> {
            Invoice invoice = new Invoice("rental", 435L);
            Invoice invoice1 = new Invoice("san valentin", 545L);
            Invoice invoice2 = new Invoice("Birthday", 987L);

            clie.setInvoices(Set.of(invoice, invoice1, invoice2));
            invoice.setClient(clie);
            invoice1.setClient(clie);
            invoice2.setClient(clie);
            clientRepository.save(clie);

            System.out.println(clie);
        });

        Optional<Client> optionalClientBD = clientRepository.findOne(1L);

        optionalClientBD.ifPresent(clieDB -> {
            Invoice invoice4 = new Invoice("san valentin", 545L);
            invoice4.setId(1L);

            Optional<Invoice> invoiceOptional = Optional.of(invoice4); //invoiceRepository.findById(2L);
            invoiceOptional.ifPresent(invoice -> {
                clieDB.removeInvoice(invoice);
                clientRepository.save(clieDB);
                System.out.println(clieDB);
            });
        });
    }

    @Transactional
    public void oneToManyInvoiceBidireccionalFindById() {
        Optional<Client> optionalClient = clientRepository.findOne(1L);

        optionalClient.ifPresent(clie -> {
            Invoice invoice = new Invoice("rental", 435L);
            Invoice invoice1 = new Invoice("san valentin", 545L);
            Invoice invoice2 = new Invoice("Birthday", 987L);

            clie.setInvoices(Set.of(invoice, invoice1, invoice2));
            invoice.setClient(clie);
            invoice1.setClient(clie);
            invoice2.setClient(clie);
            clientRepository.save(clie);

            System.out.println(clie);
        });
    }

    @Transactional
    public void oneToManyInvoiceBidireccional() {
//        al ser bidireccional deben asignar a ambos lados, quien pertenece a quien
        Client client = new Client("Frank", "Cortez");

        Invoice invoice = new Invoice("rental", 435L);
        Invoice invoice1 = new Invoice("san valentin", 545L);
        Invoice invoice2 = new Invoice("Birthday", 987L);

        client.setInvoices(Set.of(invoice, invoice1, invoice2));

        invoice.setClient(client);
        invoice1.setClient(client);
        invoice2.setClient(client);

        clientRepository.save(client);

        System.out.println(client);
    }

    @Transactional
    public void removeAddressFindById() {
        Optional<Client> optionalClient = clientRepository.findById(2L);
        optionalClient.ifPresent(client -> {
            Address address = new Address("Miraflores", 1014);
            Address address1 = new Address("Victor Larco", 345);

            client.setAddresses(Set.of(address, address1));

            clientRepository.save(client);

            System.out.println(client);

//            Optional<Client> optionalClient1 = clientRepository.findById(2L);
            Optional<Client> optionalClient1 = clientRepository.findOneWithAddresses(2L); //este metodo ya no usa carga perezosa, sino trae los objetos enteros en una consulta
            optionalClient1.ifPresent(cli -> {
                cli.getAddresses().remove(address1);
                clientRepository.save(cli);
                System.out.println(cli);
            });
        });
    }

    @Transactional
    public void removeAddress() {
        Client client = new Client("Frank", "Cortez");

        Address address = new Address("Miraflores", 1014);
        Address address1 = new Address("Victor Larco", 345);

        client.setAddresses(Set.of(address, address1));

        clientRepository.save(client);

        System.out.println(client);

        Optional<Client> optionalClient = clientRepository.findById(3L);
        optionalClient.ifPresent(cli -> {
            cli.getAddresses().remove(address1);
            clientRepository.save(cli);
            System.out.println(cli);
        });
    }

    @Transactional
    public void oneToManyFindById() {
        Optional<Client> optionalClient = clientRepository.findById(2L);
        optionalClient.ifPresent(client -> {
            Address address = new Address("Miraflores", 1014);
            Address address1 = new Address("Victor Larco", 345);

            client.setAddresses(Set.of(address, address1));

            clientRepository.save(client);

            System.out.println(client);
        });
    }

    @Transactional
    public void oneToMany() {
        Client client = new Client("Frank", "Cortez");

        Address address = new Address("Miraflores", 1014);
        Address address1 = new Address("Victor Larco", 345);

        client.setAddresses(Set.of(address, address1));

        clientRepository.save(client);

        System.out.println(client);
    }

    @Transactional
    public void manyToOne() {
        Client client = new Client("Thor", "Toe");
        clientRepository.save(client);

        Invoice invoice = new Invoice("comprar de oficina", 250L);
        invoice.setClient(client);
        Invoice invoicedb = invoiceRepository.save(invoice);
        System.out.println(invoicedb);
    }

    @Transactional
    public void manyToOneFindById() {
        Optional<Client> optionalClient = clientRepository.findById(1L);

        if (optionalClient.isPresent()) {
            Client client = optionalClient.orElseThrow();

            Invoice invoice = new Invoice("comprar de oficina", 250L);
            invoice.setClient(client);
            Invoice invoicedb = invoiceRepository.save(invoice);
            System.out.println(invoicedb);
        }

    }
}
