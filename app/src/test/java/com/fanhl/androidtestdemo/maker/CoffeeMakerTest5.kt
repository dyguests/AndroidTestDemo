package com.fanhl.androidtestdemo.maker

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

/**
 * desc:
 * date: 2018/1/8
 *
 * @author fanhl
 */
class CoffeeMakerTest5 {
    @Mock lateinit var testClass: CoffeeMaker

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        Mockito.`when`(testClass.make()).thenReturn("Milk")
    }

    @Test
    fun make_test() {
        assertEquals("Milk", testClass.make())
    }
}
