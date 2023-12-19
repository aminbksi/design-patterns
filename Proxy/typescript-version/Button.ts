class Button {
    private text: string;

    constructor(text: string) {
        this.text = text;
    }

    show(): void {
        console.log(this.text);
    }
}
