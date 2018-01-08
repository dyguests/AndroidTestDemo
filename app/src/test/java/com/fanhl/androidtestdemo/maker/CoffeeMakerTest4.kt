package com.fanhl.androidtestdemo.maker

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito

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
        testClass = Mockito.mock(CoffeeMaker::class.java)
    }

    @Test
    fun make_test() {
//        val testClass = CoffeeMaker()


        assertEquals("Coffee", testClass.make())
    }
}
