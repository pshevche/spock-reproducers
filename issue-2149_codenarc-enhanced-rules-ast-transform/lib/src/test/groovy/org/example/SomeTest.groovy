package org.example

import org.example.transform.ApplyDummyTransform
import spock.lang.Specification

class SomeTest extends Specification {
    def "some dummy test"() {
        when:
        doNothing()

        then:
        noExceptionThrown()
    }

    @ApplyDummyTransform
    private static void doNothing() {
        println("doNothing2")
    }
}
