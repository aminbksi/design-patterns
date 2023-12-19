dictionary = {
    'Post': {'fa': 'پست'},
    'Draft': {'fa': 'پیش‌نویس'},
}


class Settings:
    language = 'en'


class Button:
    def __init__(self, text):
        self.text = text

    def show(self):
        print(self.text)


class T:
    def __init__(self, text):
        self.text = text

    def __str__(self):
        return dictionary.get(self.text, {}).get(Settings.language, self.text) 


class Twitter:
    def input(self):
        buttons = [
            Button(T("Post")),
            Button(T("Draft")),
        ]
        self.show_buttons(buttons)

    def show_buttons(self, buttons):
        for b in buttons:
            b.show()