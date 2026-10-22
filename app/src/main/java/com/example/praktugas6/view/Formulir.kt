package com.example.praktugas6.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK:List<String> = Listof("Laki-Laki","Perempuan"),
    OnSubmitBtnClick : () -> Unit
) {
    Scaffold(
        modifier = Modifier,
        topbar = {
            TopAppBar(
                tittle = {Text(stringResource(id = R.string.home), color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.Resource(id = R.color.teal_700)
                )
            ) }
    ){ isiRuang ->
        Column(
            modifier = Modifier.padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally) {
            OutlineTextfield(
                velue = "",
                singleLine = true,
                modfier = Modifier
                    .padding(top = 20.dp)
                    .width(250.dp),
                label = {Text(text = "Nama Lengkap")},
                onValueChange = {},
            )
        }

    }
}