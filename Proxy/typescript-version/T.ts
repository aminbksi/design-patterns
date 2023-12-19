class T {
    private text: string;

    constructor(text: string) {
        this.text = text;
    }

    toString(): string {
        return Dictionary.dictionary[this.text][Settings.language] || this.text;
    }
}
