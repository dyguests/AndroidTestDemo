package com.fanhl.androidtestdemo

import org.junit.Assert
import org.junit.Before
import org.junit.Test

/**
 * desc:
 * date: 2018/1/8
 *
 * @author fanhl
 */
class MainActivityTest3 {
    private lateinit var testClass: MainActivity

    @Before
    fun setup() {
        testClass = MainActivity()
    }

    @Test
    fun priceFormat_test() {
        Assert.assertEquals("1", testClass.priceFormat("1"))
        Assert.assertEquals("1.1", testClass.priceFormat("1.14"))
    }

    @Test
    fun getX_test() {
        Assert.assertEquals(1, testClass.getX())
    }

    @Test
    fun parseString_test() {
        val method = testClass.javaClass.getDeclaredMethod("parseString", Int::class.java)
        method.isAccessible = true
        val actual = method.invoke(testClass, 1) as String?

        Assert.assertEquals("1", actual)
    }
}