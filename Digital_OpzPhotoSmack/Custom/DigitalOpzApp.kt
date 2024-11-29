class DigitalOpzApp : Application() {
    companion object {
        const val VERSION = "2.0.0"
        const val TARGET_SDK = 34
    }

    val processor = ProcessingEngine(
        maxResolution = 8192,
        colorDepth = 32,
        formats = listOf("RAW", "TIFF", "PNG", "JPG", "WEBP"),
        quality = 100
    )

    val templates = TemplateEngine(
        standardSizes = mapOf(
            "professional" to Size(3508, 2480),
            "portrait" to Size(800, 1200),
            "card" to Size(1050, 600)
        )
    )
}
