class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void subscribeToObserver(Subject subject, Observer observer) {
        subject.registerObserver(observer, this);
    }

    public void unsubscribeFromObserver(Subject subject, Observer observer) {
        subject.removeObserver(observer);
    }
}