class EmailStockSubscriber implements Observer {
    @Override
    public void update(Subject subject, User user) {
        System.out.println(user.getName() + " received an update from " 
        + subject.getClass().getSimpleName()+ " via email" + " with the price of " + ((Stock)subject).getPrice());
    }
}