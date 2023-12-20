class UserManager:
    def __init__(self):
        self.users = []

    def register_user(self, name, age, email):
        user = User(name, age, email)
        self.users.append(user)

    def display_users(self):
        for user in self.users:
            print(f"Name: {user.name}, Age: {user.age}, Email: {user.email}")
