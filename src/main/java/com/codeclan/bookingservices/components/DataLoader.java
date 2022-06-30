package com.codeclan.bookingservices.components;

import com.codeclan.bookingservices.models.Booking;
import com.codeclan.bookingservices.models.Course;
import com.codeclan.bookingservices.models.Customer;
import com.codeclan.bookingservices.repositories.BookingRepository;
import com.codeclan.bookingservices.repositories.CourseRepository;
import com.codeclan.bookingservices.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
//@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Course python = new Course("Python intro", "Edinburgh", 5.00);
        courseRepository.save(python);

        Course java = new Course("Advanced Java", "Glasgow", 3.70);
        courseRepository.save(java);

        Course spring = new Course("Spring", "Glasgow", 2.50);
        courseRepository.save(spring);

        Customer val = new Customer("Val","Edinburgh",37);
        customerRepository.save(val);

        Customer billy = new Customer("Billy", "Glasgow", 21);
        customerRepository.save(billy);

        Customer blobby = new Customer("M. Blobby", "Dundee", 41);
        customerRepository.save(blobby);

        Booking bookingOne = new Booking("30-06-2022",python,val);
        bookingRepository.save(bookingOne);

        Booking bookingTwo = new Booking("28-06-2022",java,billy);
        bookingRepository.save(bookingTwo);

        Booking bookingThree = new Booking("28-07-2022",spring,blobby);
        bookingRepository.save(bookingThree);
    }
}
