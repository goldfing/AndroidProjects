package com.hans.android.httploginterceptorexam.data.model

import com.hans.android.httploginterceptorexam.data.city.CityEntity

class CityMapper {
    fun entityToDto(entity: CityEntity?): CityDto? {
        if (entity == null) return null
        return CityDto(entity.title, entity.city)
    }
}