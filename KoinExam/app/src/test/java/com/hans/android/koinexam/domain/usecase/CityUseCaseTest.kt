package com.hans.android.koinexam.domain.usecase

import com.google.common.truth.Truth.assertThat
import com.hans.android.koinexam.AbstractKoinTest
import com.hans.android.koinexam.data.repository.CityRepository
import org.junit.Test
import org.koin.test.inject
import org.koin.test.mock.declareMock
import org.mockito.ArgumentMatchers.anyString
import org.mockito.BDDMockito.given

class CityUseCaseTest: AbstractKoinTest() {

    val cityUseCase: CityUseCase by inject()

    @Test
    fun isExistsCity() {
        // Case #1 for using Mock
        val cityRepository = declareMock<CityRepository> {
            given(isExistsCity(anyString())).willReturn(true)
        }

        // Case #2 for using Mock as another 'given-willReturn'
//        given(cityRepository.isExistsCity(anyString())).willReturn((true))

        // Case #2 for using Mock as 'when-thenReturn'
//        val cityRepository = declareMock()
//        Mockito.`when`(cityRepository.isExistsCity(anyString())).thenReturn(true)

        assertThat(cityUseCase.isExistsCity("Seoul")).isTrue()
    }
}