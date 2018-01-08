package com.fanhl.androidtestdemo

import org.junit.Assert
import org.junit.Test

/**
 * desc:
 * date: 2018/1/8
 *
 * @author fanhl
 */
class MainActivityTest {
    @Test
    fun priceFormat() {
        val testClass = MainActivity()

        Assert.assertEquals("1.1", testClass.priceFormat("1.14"))
    }
}