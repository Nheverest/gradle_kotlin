/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package demo

import kotlin.test.Test
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class AppTest {
    @Test fun appHasAGreeting() {
        val classUnderTest = App()
        assertNotNull(classUnderTest.greeting, "app should have a greeting")
    }

    @Test fun appGreetingContainsHello() {
        val classUnderTest = App()
        assertTrue(classUnderTest.greeting.contains("Hello"), "app should say Hello")
    }
}
