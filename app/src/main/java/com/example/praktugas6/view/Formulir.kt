package com.example.praktugas6.view

import android.R.attr.button
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.praktugas6.R
import kotlinx.coroutines.awaitAll

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK:List<String> = listOf("Laki-Laki","Perempuan"),
    OnSubmitBtnClick : () -> Unit
) {
    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = {Text(stringResource(id = R.string.home), color = Color.White)},
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            ) }
    ){ isiRuang ->
        Column(
            modifier = Modifier.padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally) {
            OutlinedTextField(
                value = "",
                singleLine = true,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .width(250.dp),
                label = {Text(text = "Nama Lengkap")},
                onValueChange = {},
            )
            HorizontalDivider(modifier = Modifier
                .padding(all = 20.dp)
                .width(250.dp), thickness = 1.dp,color = Color.Red)
            Row{
                jenisK.forEach {
                    RadioButton(
                        selected = false,
                        onClick = {}
                    )
                    Text(text = it)
                }
            }

        }
        HorizontalDivider(modifier = Modifier
            .padding(all = 20.dp)
            .width(250.dp),
            thickness = 1.dp,
            color = Color.Red
        )
        OutlinedTextField(
            value = "",
            singleLine = true,
            modifier = Modifier
                .width(250.dp),
            label = { Text(text = "Alamat") },
            onValueChange = {},
        )
        Spacer(modifier = Modifier.height(30.dp))
        button(
            modifier = Modifier.fillMaxWidth(fraction = if)
                .padding(all = 25.dp),
            onClick = OnSubmitBtnClick
        ){
            Text(stringResource(id = R.string.submit)))
        }

    }
}