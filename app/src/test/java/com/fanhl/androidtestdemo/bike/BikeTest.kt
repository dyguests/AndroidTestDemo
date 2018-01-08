package com.fanhl.androidtestdemo.bike

import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.mock
import org.junit.Assert.assertEquals
import org.junit.Test

class BikeTest {
    @Test
    fun run_test() {
        val mock = mock<Bike> {
            on { track() } doReturn "==="
        }

        assertEquals("=== run!!! ===", mock.run())
    }
}