package org.example

import spock.lang.Specification
import spock.lang.Verify

class LibraryTest extends Specification {
    def "someLibraryMethod returns true"() {
        setup:
        def lib = new Library()

        when:
        def result = lib.someLibraryMethod()

        then:
        assertFalse(result)
    }

    @Verify
    private static void assertFalse(boolean result) {
        !result
    }
}
