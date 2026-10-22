package com.example.praktugas6.view

import androidx.compose.material3.Button
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.praktugas6.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK: List<String> = listOf("Laki-Laki", "Perempuan"),
    OnSubmitBtnClick: (String, String, String) -> Unit = { _, _, _ -> }
) {
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var selectedJk by remember { mutableStateOf("") }

    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(stringResource(id = R.string.home), color = Color.White) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.teal_700)
                )
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier
                .padding(paddingValues = isiRuang)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            OutlinedTextField(
                value = textNama,
                singleLine = true,
                modifier = Modifier
                    .width(250.dp),
                label = { Text(text = "Nama Lengkap") },
                onValueChange = { textNama = it },
            )
            HorizontalDivider(
                modifier = Modifier
                    .padding(vertical = 20.dp)
                    .width(250.dp),
                thickness = 1.dp,
                color = Color.Red
            )
            Row(
                modifier = Modifier.width(250.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                jenisK.forEach { item ->
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(end = 8.dp)
                    ) {
                        RadioButton(
                            selected = (selectedJk == item),
                            onClick = { selectedJk = item }
                        )
                        Text(text = item)
                    }
                }
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(vertical = 20.dp)
                    .width(250.dp),
                thickness = 1.dp,
                color = Color.Red
            )
            OutlinedTextField(
                value = textAlamat,
                singleLine = true,
                modifier = Modifier
                    .width(250.dp),
                label = { Text(text = "Alamat") },
                onValueChange = { textAlamat = it },
            )
            Spacer(modifier = Modifier.height(30.dp))
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 25.dp),
                onClick = { OnSubmitBtnClick(textNama, selectedJk, textAlamat) }
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(3.dp),
                        modifier = Modifier.width(16.dp)
                    ) {
                        HorizontalDivider(thickness = 2.dp, color = Color.White)
                        HorizontalDivider(thickness = 2.dp, color = Color.White)
                        HorizontalDivider(thickness = 2.dp, color = Color.White)
                    }
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(stringResource(id = R.string.submit))
                }
            }
        }
    }
}
