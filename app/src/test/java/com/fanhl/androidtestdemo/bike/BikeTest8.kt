package com.fanhl.androidtestdemo.bike

import com.nhaarman.mockito_kotlin.whenever
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
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
class BikeTest8 {
    @Spy
    @InjectMocks
    lateinit var bike: Bike

    @Mock
    lateinit var call: Call

    @Before
    fun setup() {
        whenever(call.call()).thenReturn("Duang")
    }

    @Test
    fun call_test() {
//        assertEquals("Duang", bike.call())
        assertEquals("Duang", bike.call2())//这是一种替代的测试方法
    }
}