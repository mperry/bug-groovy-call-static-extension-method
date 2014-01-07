package com.github.mperry.fg

import groovy.transform.TypeChecked

/**
 * Created by MarkPerry on 7/01/14.
 */
@TypeChecked
class ListExtension {

    static void instanceMethod1(List list) {
        ListStaticExtension.staticMethod2(list)
    }

}
