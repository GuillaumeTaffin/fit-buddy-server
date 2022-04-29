package gt.com.fitbuddy.server.acceptance.workouts

import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import kotlin.test.assertEquals

class WorkoutsTest {

    @Test
    fun `No workouts by default`() = testApplication {

        client.get("/workouts").apply {
            assertEquals(HttpStatusCode.OK, status)
            assertThat(bodyAsText()).isEqualTo("{\"workouts\":[]}")
        }

    }
}