package backend.workshop

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.jdbc.Sql

@SpringBootTest
@Sql("/import-database.sql")
/**
 * This class will load the initial data into the database
 */
class LoadInitData (
    @Autowired
    val userRepository: UserRepository,


    ) {

    @Test
    fun testFindAll() {
        val userList: List<User> = userRepository.findAll()

        Assertions.assertAll("Import database test",
            { Assertions.assertTrue(userList.size == 4) },

        )
    }
}