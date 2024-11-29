class ProcessingEngine(
    private val maxResolution: Int,
    private val colorDepth: Int,
    private val formats: List<String>,
    private val quality: Int
) {
    fun process(input: ByteArray): ByteArray {
        return optimize(input)
            .enhance()
            .export()
    }
}
