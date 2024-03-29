package com.example.firstunittesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest{
    private lateinit var resourceComparer : ResourceComparer

    @Before
    fun setUp(){
        resourceComparer = ResourceComparer()
    }

    @After
    fun tearDown(){

    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        //resourceComparer = ResourceComparer()
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name,"First Unit Testing")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse(){
       // resourceComparer = ResourceComparer()
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context, R.string.app_name,"Hello")
        assertThat(result).isFalse()
    }
}