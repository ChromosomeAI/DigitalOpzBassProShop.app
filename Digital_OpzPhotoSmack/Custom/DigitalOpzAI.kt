class DigitalOpzAI {
    val aiProcessor = AIProcessor(
        models = mapOf(
            "enhance" to AIModel("enhance_v2", resolution = 8192),
            "portrait" to AIModel("portrait_pro", features = portraitFeatures),
            "background" to AIModel("background_v3", modes = backgroundModes),
            "color" to AIModel("color_science", profiles = colorProfiles)
        )
    )

    val photoProcessor = PhotoProcessor(
        settings = ProcessingSettings(
            resolution = 8192,
            colorDepth = 32,
            formats = supportedFormats,
            quality = 100
        ),
        aiSupport = true
    )
}
