package com.example.tugaslayout


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
        }