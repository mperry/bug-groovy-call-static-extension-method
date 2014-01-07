package com.github.mperry.fg

import groovy.transform.TypeChecked
import org.junit.Test

import static org.junit.Assert.assertTrue

/**
 * Created by MarkPerry on 7/01/14.
 */
@TypeChecked
class Test1 {

    @Test
    void test1() {

        def i = 3
        IntegerExtension.instanceMethod1(3)
        assertTrue(true)

    }

}
