package com.fanhl.androidtestdemo.bike

import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.mock
import org.junit.Assert.assertEquals
import org.junit.Test

class BikeTest {
    @Test
    fun run_test() {
        val testClass = mock<Bike> {
            on { track() } doReturn "==="
        }

        assertEquals("===", testClass.track())
    }
}