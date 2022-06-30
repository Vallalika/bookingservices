package com.codeclan.bookingservices;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles("test")

@RunWith(SpringRunner.class)
@SpringBootTest
class BookingservicesApplicationTests {

	@Test
	void contextLoads() {
	}

}
