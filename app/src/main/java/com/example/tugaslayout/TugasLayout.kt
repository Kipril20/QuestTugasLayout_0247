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
}