package example.designpattern.behavioral.observer;

/**
 * <b>Description</b> :
 *
 * @author Vinod Akkepalli
 */


public interface ISubject {

    //methods to register and unregister observers
    void register(IObserver obj);
    void unregister(IObserver obj);

    //method to notify observers of change
    void notifyObservers();

    //method to get updates from subject
    Object getUpdate(IObserver obj);

}
