package kr.tekit.lion.daongil.datasource.areacode

import kr.tekit.lion.daongil.dto.request.AreaCodeRequest
import kr.tekit.lion.daongil.dto.response.areacode.AreaCodeResponse
import kr.tekit.lion.daongil.network.service.KorWithService

class RemoteAreaCodeDataSource(
    private val korWithService: KorWithService
): AreaCodeDataSource {
    override suspend fun getAreaCode(request: AreaCodeRequest): AreaCodeResponse {
        return korWithService.getAreaCode(request)
    }

    override suspend fun setAreaCode() {
        TODO("Not yet implemented")
    }

}