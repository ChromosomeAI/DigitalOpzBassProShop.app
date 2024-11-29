class DetailProcessor {
    process(input: ProcessedImage): EnhancedImage {
        return this.pipeline([
            this.superResolve,
            this.enhanceDetails,
            this.optimizeOutput,
            this.validateQuality
        ]).execute(input)
    }
}
