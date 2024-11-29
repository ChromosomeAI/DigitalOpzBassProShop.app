class TemplateSystem {
    private templates = new Map<string, Template>()
    
    processTemplate(name: string, template: Template) {
        return template.pipe([
            optimize,
            prepare,
            validate,
            export
        ])
    }
}
