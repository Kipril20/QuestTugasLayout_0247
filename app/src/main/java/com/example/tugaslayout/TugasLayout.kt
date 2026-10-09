package com.example.tugaslayout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign


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
            Text(
                text = stringResource(id = R.string.header_title),
                color = colorResource(id = R.color.header_title_color),
                fontSize = with(LocalDensity.current) { dimensionResource(id = R.dimen.text_size_title).toSp() },
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_header_subtitle)))

            Text(
                text = stringResource(id = R.string.header_subtitle),
                color = colorResource(id = R.color.header_subtitle_color),
                fontSize = with(LocalDensity.current) { dimensionResource(id = R.dimen.text_size_subtitle).toSp() },
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_header_cards)))

            ProfileCard(
                nameRes = R.string.card_1_name,
                addressRes = R.string.card_1_location,
                bgCardColorRes = R.color.card_1_bg,
                addressColorRes = R.color.text_yellow,
                isCursive = true
            )

            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_cards)))

            ProfileCard(
                nameRes = R.string.card_2_name,
                phoneRes = R.string.card_2_phone,
                addressRes = R.string.card_2_location,
                bgCardColorRes = R.color.card_2_bg,
                addressColorRes = R.color.text_yellow
            )

            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_cards)))

            ProfileCard(
                nameRes = R.string.card_3_name,
                phoneRes = R.string.card_3_phone,
                addressRes = R.string.card_3_location,
                bgCardColorRes = R.color.card_3_bg,
                addressColorRes = R.color.text_white
            )

            Spacer(modifier = Modifier.height(dimensionResource(id = R.dimen.spacing_cards)))

            ProfileCard(
                nameRes = R.string.card_4_name,
                phoneRes = R.string.card_4_phone,
                addressRes = R.string.card_4_location,
                bgCardColorRes = R.color.card_4_bg,
                addressColorRes = R.color.text_white
            )

            Spacer(modifier = Modifier.weight(1f))

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
