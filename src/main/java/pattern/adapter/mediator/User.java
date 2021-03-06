package pattern.adapter.mediator;

public abstract class User {

    private Mediator mediator;

    public User(Mediator mediator){
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void work();
}
