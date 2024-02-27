package com.loryblu.data.logbook.remote.api

import com.loryblu.core.network.model.ApiResponse
import com.loryblu.core.network.model.ApiResponseWithData
import com.loryblu.data.logbook.remote.model.LogbookTask
import com.loryblu.data.logbook.remote.model.LogbookTaskRequest
import kotlinx.coroutines.flow.Flow

interface LogbookApi {
    suspend fun createTask(logbookTaskRequest: LogbookTaskRequest, onResult: suspend (ApiResponseWithData<ApiResponse>) -> Unit)

    suspend fun getUserTasks(): Flow<ApiResponseWithData<List<LogbookTask>>>
}