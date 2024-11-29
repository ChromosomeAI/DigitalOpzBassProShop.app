@Composable
fun ProcessingCard(
    title: String,
    progress: Float,
    onProcess: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = 8.dp
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.h6
            )
            LinearProgressIndicator(
                progress = progress,
                modifier = Modifier.fillMaxWidth()
            )
            Button(
                onClick = onProcess,
                modifier = Modifier.align(Alignment.End)
            ) {
                Text("Process")
            }
        }
    }
}

@Composable
fun TemplateSelector(
    templates: List<Template>,
    onTemplateSelected: (Template) -> Unit
) {
    LazyRow {
        items(templates) { template ->
            TemplatePreview(
                template = template,
                onClick = { onTemplateSelected(template) }
            )
        }
    }
}
