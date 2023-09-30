package com.example.loryblu.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loryblu.R
import com.example.loryblu.register.child.ChildRegisterViewModel
import com.example.loryblu.util.GenderButtonValid

@Composable
fun LBBoyButton(
    onClick: () -> Unit,
    modifier: Modifier,
    isClicked: Boolean,
    isBothButtonClicked: Boolean,

) {
    val buttonBorderColor = if (isClicked || isBothButtonClicked) Color(0xff004a98) else MaterialTheme.colorScheme.error

    OutlinedButton(
        onClick = { onClick()},
        modifier = modifier,
        shape = RoundedCornerShape(10.dp),
        contentPadding = PaddingValues(end = 16.dp, start = 8.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = if (isClicked) Color.White else Color.LightGray,
            containerColor = if (isClicked) Color(0xff004a98) else Color.Transparent,
        ),
        border = BorderStroke(
            width = 1.dp,
            color = buttonBorderColor,
        )
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_boy),
            contentDescription = stringResource(id = R.string.boy_icon),
            tint = if (isClicked) Color.White else Color.LightGray,
            modifier = Modifier.padding(end = 16.dp),
        )
        Text(
            text = stringResource(R.string.boy),
            color = if (isClicked) Color.White else Color.LightGray,
            textAlign = TextAlign.Left,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
        )
    }
}
@Composable
@Preview
fun PreviewLBBoyButton() {
    LBBoyButton(
        onClick = {}, modifier = Modifier, isClicked = false, isBothButtonClicked = false
    )
}