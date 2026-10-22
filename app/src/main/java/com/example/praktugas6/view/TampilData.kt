package com.example.praktugas6.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktugas6.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    nama: String = "Contoh Nama",
    jenisKelamin: String = "Lainnya",
    alamat: String = "Yogyakarta",
    onBackBtnClick: () -> Unit = {},
){
    val item = listOf(
        Pair(stringResource(id = R.string.nama_lengkap), nama),
        Pair(stringResource(id = R.string.jenis_kelamin), jenisKelamin),
        Pair(stringResource(id = R.string.alamat), alamat)
    )
    Scaffold(modifier = Modifier,
        topBar = {
            TopAppBar(
                title = {Text(text = stringResource(id = R.string.tampil), color = Color.White)},
                colors = TopAppBarDefaults.topAppBarColors(containerColor = colorResource(id = R.color.teal_700))
            )
        }){isiRuang ->
        Column(modifier = Modifier.padding(paddingValues = isiRuang).padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)){
            item.forEach {dataItem ->
                Column(verticalArrangement = Arrangement.spacedBy(2.dp)){
                    Text(text = dataItem.first.uppercase(), fontSize = 13.sp, color = Color.Gray)
                    Text(text = dataItem.second, fontWeight = FontWeight.Bold, fontSize = 18.sp)
                }
                HorizontalDivider(thickness = 1.dp, color = Color.LightGray)
            }
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = onBackBtnClick) {
                Text(text = stringResource(id = R.string.back))
            }
        }
    }
}
