class Twitter {
    input(): void {
        const buttons: Button[] = [
            new Button(new T('Post').toString()),
            new Button(new T('Draft').toString()),
        ];
        this.showButtons(buttons);
    }

    private showButtons(buttons: Button[]): void {
        for (const b of buttons) {
            b.show();
        }
    }
}
