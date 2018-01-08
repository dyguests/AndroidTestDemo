package com.fanhl.androidtestdemo.bike

import com.nhaarman.mockito_kotlin.whenever
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Spy
import org.mockito.junit.MockitoJUnitRunner

/**
 * desc:
 * date: 2018/1/8
 *
 * @author fanhl
 */
@RunWith(MockitoJUnitRunner::class)
class BikeTest7 {
    @Mock
    lateinit var bike: Bike

    @Spy
    lateinit var call: Call

    @Before
    fun setup() {
        whenever(bike.call()).thenCallRealMethod()
//        whenever(call.call()).thenReturn("Duang")
    }

    @Test
    fun call_test() {
        assertEquals("Ring", bike.call())
        assertEquals("Ring", call.call())
    }
}