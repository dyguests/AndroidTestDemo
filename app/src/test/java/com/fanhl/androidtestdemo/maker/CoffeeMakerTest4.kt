package com.fanhl.androidtestdemo.maker

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * desc:
 * date: 2018/1/8
 *
 * @author fanhl
 */
class CoffeeMakerTest4 {
    lateinit var testClass: CoffeeMaker

    @Before
    fun setup() {
        testClass = CoffeeMaker()
    }

    @Test
    fun make_test() {
        assertEquals("Coffee", testClass.make())
    }
}
