package com.example.praktugas6.view

import androidx.compose.material3.Scaffold
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick: () -> Unit,
){
    val item = listof(
        Pair(stringResource(id = R.string.nama_lengkap),"Contoh Nama"),
        Pair(stringResource(id = R.string.jenis_kelamin),"Lainnya"),
        Pair(stringResource(id = R.string.alamat),"Yogyakarta")
    )
    Scaffold(modifier = Modifier,
        topBar = {
            TopAppBar(
                tittle = {Text(text = sttringResource(id = R.string.tampil), color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = colorResource(id = R.color.teal_700))
            )
        }){isiRuang ->
        Column(modifier = Modifier.padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.SpaceBetween){

        }

}