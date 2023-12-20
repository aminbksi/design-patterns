class UserFileHandler:
    @staticmethod
    def save_to_file(users, filename):
        with open(filename, 'w') as f:
            for user in users:
                f.write(f"{user.name},{user.age},{user.email}\n")

    @staticmethod
    def read_from_file(filename):
        users = []
        with open(filename, 'r') as f:
            for line in f.readlines():
                name, age, email = line.strip().split(',')
                users.append(User(name, age, email))
        return users