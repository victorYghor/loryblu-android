package com.loryblu.feature.logbook.ui.task.edit

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.loryblu.core.ui.components.LBTopAppBar
import com.loryblu.data.logbook.local.CategoryItem
import com.loryblu.feature.home.R
import com.loryblu.feature.logbook.ui.task.CategoryContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditCategoryScreen(
    cardClicked: Int,
    onCardClick: (cardClicked: Int) -> Unit,
    onBackButtonClicked: () -> Unit,
    onNextScreenClicked: (category: CategoryItem) -> Unit,
) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            LBTopAppBar(
                scrollBehavior = scrollBehavior,
                title = stringResource(R.string.edit_task_title),
                onBackClicked = { onBackButtonClicked() },
                showCloseButton = false
            )
        },
        content = { innerPadding ->
            CategoryContent(
                innerPadding = innerPadding,
                cardClicked = cardClicked,
                onCardClick = onCardClick,
                onNextScreenClicked = onNextScreenClicked
            )
        }
    )
}