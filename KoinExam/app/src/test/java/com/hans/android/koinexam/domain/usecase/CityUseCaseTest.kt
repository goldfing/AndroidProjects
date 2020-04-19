package com.hans.android.koinexam.domain.usecase

import com.google.common.truth.Truth.assertThat
import com.hans.android.koinexam.data.repository.CityRepository
import com.hans.android.koinexam.di.myModule
import org.junit.Test

import org.junit.Rule
import org.koin.core.logger.Level
import org.koin.test.KoinTest
import org.koin.test.KoinTestRule
import org.koin.test.inject
import org.koin.test.mock.MockProviderRule
import org.koin.test.mock.declareMock
import org.mockito.ArgumentMatchers.anyString
import org.mockito.BDDMockito.given
import org.mockito.Mockito

class CityUseCaseTest: KoinTest {
    @get:Rule
    val koinTestRule = KoinTestRule.create {
        printLogger(Level.DEBUG)
        modules(myModule)
    }

    @get:Rule
    val mockProvider = MockProviderRule.create {
        clazz -> Mockito.mock(clazz.java)
    }

    val cityUseCase: CityUseCase by inject()
    @Test
    fun isExistsCity() {
        val cityRepository = declareMock<CityRepository> {
            given(isExistsCity(anyString())).willReturn(true)
        }

        assertThat(cityUseCase.isExistsCity("Seoul")).isTrue()
    }
}