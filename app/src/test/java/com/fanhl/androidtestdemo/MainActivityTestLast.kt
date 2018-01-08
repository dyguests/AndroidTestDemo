package com.fanhl.androidtestdemo

import org.junit.Before
import org.junit.Test

/**
 * desc: 一个实际的例子
 * date: 2018/1/8
 *
 * @author fanhl
 */
class MainActivityTestLast {
    private lateinit var testClass: MainActivity

    @Before
    fun setup() {
        testClass = MainActivity()
    }

    @Test
    fun priceFormat_test() {
        val cases = arrayOf(
                // expected , input
                arrayOf("1", "1"),
                arrayOf("1", "1.0"),
                arrayOf("1.1", "1.1"),
                arrayOf("1.1", "1.11"),
                arrayOf("1.2", "1.16"),
                arrayOf("2", "1.99"),
                arrayOf("1.6", "1.55"),
                arrayOf("1.2", "1.234"),
                arrayOf("1.5", "1.549"),
                arrayOf("1", "1.00"),
                arrayOf("1.1", "1.05"),
                arrayOf("123", "123"),
                arrayOf("123", "123.0"),
                arrayOf("200", "199.99"),
                arrayOf(null as String?, null as String?),
                arrayOf("abc", "abc"),
                arrayOf("0.1", ".1"),
                arrayOf("0.6", ".55"),
                arrayOf("-0", "-0"),
                arrayOf("-0.1", "-0.11"),
                arrayOf("-1", "-0.99")
        )

        cases.forEach {
            val expected = it[0]

            val method = testClass.javaClass.getDeclaredMethod("priceFormat", String::class.java)
            method.isAccessible = true
            val actual = method.invoke(testClass, it[1]) as String?

            junit.framework.Assert.assertEquals("input:${it[1]}", expected, actual)
        }
    }

}