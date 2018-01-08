package com.fanhl.androidtestdemo.bike

import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.mock
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class BikeTest6 {
    lateinit var testClass: Bike

    @Before
    fun setup() {
        testClass = mock {
            on { track() } doReturn "==="
            on { run() }.thenCallRealMethod()
        }
    }

    @Test
    fun run_test() {
        assertEquals("=== run ===", testClass.run())
    }
}