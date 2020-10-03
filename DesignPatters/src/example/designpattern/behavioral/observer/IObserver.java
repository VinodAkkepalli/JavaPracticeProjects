package example.designpattern.behavioral.observer;

/**
 * <b>Description</b> :
 *
 * @author Vinod Akkepalli
 */


public interface IObserver {

    //method to update the observer, used by subject
    void update();

    //attach with subject to observe
    void setSubject(ISubject sub);
}
