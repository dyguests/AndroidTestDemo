package com.fanhl.androidtestdemo

import org.junit.Assert
import org.junit.Test

/**
 * desc:
 * date: 2018/1/8
 *
 * @author fanhl
 */
class MainActivityTest2 {
    @Test
    fun priceFormat_test() {
        val testClass = MainActivity()

        Assert.assertEquals("1", testClass.priceFormat("1"))
        Assert.assertEquals("1.1", testClass.priceFormat("1.14"))
    }

    @Test
    fun getX_test() {
        val testClass = MainActivity()

        Assert.assertEquals(1, testClass.getX())
    }
}