package com.loryblu.feature.logbook.di

import com.loryblu.data.logbook.local.CategoryItem
import com.loryblu.feature.logbook.model.LogbookTaskModel
import com.loryblu.feature.logbook.ui.home.LogbookHomeViewModel
import com.loryblu.feature.logbook.ui.task.LogbookTaskViewModel
import com.loryblu.feature.logbook.ui.task.edit.LogbookEditTaskViewModel
import com.loryblu.feature.logbook.useCases.EditTaskUseCase
import com.loryblu.feature.logbook.useCases.EditTaskUseCaseImpl
import com.loryblu.feature.logbook.useCases.GetUserTaskByDayOfWeek
import com.loryblu.feature.logbook.useCases.GetUserTaskByDayOfWeekImpl
import com.loryblu.feature.logbook.useCases.GetUserTaskById
import com.loryblu.feature.logbook.useCases.GetUserTaskByIdImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val logbookModule = module {
    viewModel { LogbookTaskViewModel(get(), get(), get()) }
    viewModel { LogbookHomeViewModel(get())}
    viewModel { LogbookEditTaskViewModel(get(), get(), get(), get()) }

    single<GetUserTaskByDayOfWeek> { GetUserTaskByDayOfWeekImpl(get()) }
    single<GetUserTaskById> { GetUserTaskByIdImpl(get())}
    single<EditTaskUseCase> { EditTaskUseCaseImpl(get()) }
    single<LogbookTaskModel> { LogbookTaskModel(CategoryItem.Routine, "", "", listOf()) }
}
