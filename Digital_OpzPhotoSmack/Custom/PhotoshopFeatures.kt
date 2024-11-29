class PhotoshopFeatures {
    val tools = mapOf(
        "healing" to Tool(
            name = "Healing Brush",
            aiMode = "smart_heal",
            settings = healingSettings
        ),
        "clone" to Tool(
            name = "Clone Stamp",
            aiMode = "pattern_match",
            settings = cloneSettings
        ),
        "select" to Tool(
            name = "Select Subject",
            aiMode = "object_detect",
            settings = selectSettings
        )
    )

    val filters = mapOf(
        "sharpen" to Filter(
            name = "Smart Sharpen",
            aiMode = "edge_enhance",
            settings = sharpenSettings
        ),
        "denoise" to Filter(
            name = "Reduce Noise",
            aiMode = "noise_reduce",
            settings = denoiseSettings
        ),
        "lighting" to Filter(
            name = "Lighting Effects",
            aiMode = "light_enhance",
            settings = lightingSettings
        )
    )
}
