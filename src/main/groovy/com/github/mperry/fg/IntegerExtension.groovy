package com.github.mperry.fg

import groovy.transform.TypeChecked
import groovy.transform.TypeCheckingMode

/**
 * Created by MarkPerry on 7/01/14.
 */
@TypeChecked
class IntegerExtension {

//    @TypeChecked(TypeCheckingMode.SKIP)
    static void instanceMethod1(Integer i) {
        ListStaticExtension.staticMethod2([])
    }

}
