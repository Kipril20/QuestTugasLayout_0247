package com.example.tugaslayout

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.tugaslayout.ui.theme.TugasLayoutTheme

@Composable
fun TugasLayout(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        containerColor = colorResource(id = R.color.screen_background)
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(
                    horizontal = dimensionResource(id = R.dimen.padding_screen_horizontal),
                    vertical = dimensionResource(id = R.dimen.padding_screen_vertical)
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Header: Judul Program Studi
            Text(
                text = stringResource(id = R.string.header_title),
                color = colorResource(id = R.color.header_title_color),
                fontSize = with(LocalDensity.current) { dimensionResource(id = R.dimen.text_size_title).toSp() },
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_header_subtitle)))

            // Header: Nama Universitas
            Text(
                text = stringResource(id = R.string.header_subtitle),
                color = colorResource(id = R.color.header_subtitle_color),
                fontSize = with(LocalDensity.current) { dimensionResource(id = R.dimen.text_size_subtitle).toSp() },
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_header_cards)))

            // Card 1: Bambang Sumantri (Font Cursive, Tanpa Nomor Telepon, Alamat Kuning)
            ProfileCard(
                nameRes = R.string.card_1_name,
                addressRes = R.string.card_1_location,
                bgCardColorRes = R.color.card_1_bg,
                addressColorRes = R.color.text_yellow,
                isCursive = true
            )

            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_cards)))

            // Card 2: Gibran Fathoni (Background Ungu, Alamat Kuning)
            ProfileCard(
                nameRes = R.string.card_2_name,
                phoneRes = R.string.card_2_phone,
                addressRes = R.string.card_2_location,
                bgCardColorRes = R.color.card_2_bg,
                addressColorRes = R.color.text_yellow
            )

            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_cards)))

            // Card 3: Zhilal Fadhilah (Background Biru, Alamat Putih)
            ProfileCard(
                nameRes = R.string.card_3_name,
                phoneRes = R.string.card_3_phone,
                addressRes = R.string.card_3_location,
                bgCardColorRes = R.color.card_3_bg,
                addressColorRes = R.color.text_white
            )

            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_cards)))

            // Card 4: Ahmad Alfian (Background Hijau, Alamat Putih)
            ProfileCard(
                nameRes = R.string.card_4_name,
                phoneRes = R.string.card_4_phone,
                addressRes = R.string.card_4_location,
                bgCardColorRes = R.color.card_4_bg,
                addressColorRes = R.color.text_white
            )

            Spacer(modifier = Modifier.weight(1f))

            // Footer: Copyright
            Text(
                text = stringResource(id = R.string.footer_copyright),
                color = colorResource(id = R.color.footer_text_color),
                fontSize = with(LocalDensity.current) { dimensionResource(id = R.dimen.text_size_footer).toSp() },
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(bottom = dimensionResource(id = R.dimen.padding_footer))
            )
        }
    }
}

@Composable
fun ProfileCard(
    modifier: Modifier = Modifier,
    name: String,
    address: String,
    backgroundColor: Color,
    addressColor: Color,
    phone: String? = null,
    @DrawableRes logoRes: Int = R.drawable.logo_umy,
    isCursive: Boolean = false
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(dimensionResource(id = R.dimen.card_corner_radius)),
        colors = CardDefaults.cardColors(
            containerColor = backgroundColor
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = dimensionResource(id = R.dimen.card_elevation)
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(id = R.dimen.padding_card_content)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Logo Sisi Kiri
            Image(
                painter = painterResource(id = logoRes),
                contentDescription = stringResource(id = R.string.logo_umy_desc),
                modifier = Modifier.size(dimensionResource(id = R.dimen.logo_size))
            )

            // Kolom Informasi Tengah (Nama, No HP jika ada, Alamat)
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = dimensionResource(id = R.dimen.spacing_card_content)),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = name,
                    color = colorResource(id = R.color.text_white),
                    fontSize = with(LocalDensity.current) { dimensionResource(id = R.dimen.text_size_card_name).toSp() },
                    fontWeight = if (isCursive) FontWeight.Normal else FontWeight.Bold,
                    fontFamily = if (isCursive) FontFamily.Cursive else FontFamily.Default
                )

                if (phone != null) {
                    Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_card_text)))
                    Text(
                        text = phone,
                        color = colorResource(id = R.color.text_cyan),
                        fontSize = with(LocalDensity.current) { dimensionResource(id = R.dimen.text_size_card_phone).toSp() },
                        fontWeight = FontWeight.Normal
                    )
                }

                Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_card_text)))
                Text(
                    text = address,
                    color = addressColor,
                    fontSize = with(LocalDensity.current) { dimensionResource(id = R.dimen.text_size_card_location).toSp() },
                    fontWeight = FontWeight.Normal
                )
            }

            // Logo Sisi Kanan
            Image(
                painter = painterResource(id = logoRes),
                contentDescription = stringResource(id = R.string.logo_umy_desc),
                modifier = Modifier.size(dimensionResource(id = R.dimen.logo_size))
            )
        }
    }
}

@Composable
fun ProfileCard(
    modifier: Modifier = Modifier,
    @StringRes nameRes: Int,
    @StringRes addressRes: Int,
    @ColorRes bgCardColorRes: Int,
    @ColorRes addressColorRes: Int,
    @StringRes phoneRes: Int? = null,
    @DrawableRes logoRes: Int = R.drawable.logo_umy,
    isCursive: Boolean = false
) {
    ProfileCard(
        modifier = modifier,
        name = stringResource(id = nameRes),
        address = stringResource(id = addressRes),
        backgroundColor = colorResource(id = bgCardColorRes),
        addressColor = colorResource(id = addressColorRes),
        phone = phoneRes?.let { stringResource(id = it) },
        logoRes = logoRes,
        isCursive = isCursive
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TugasLayoutPreview() {
    TugasLayoutTheme {
        TugasLayout()
    }
}
