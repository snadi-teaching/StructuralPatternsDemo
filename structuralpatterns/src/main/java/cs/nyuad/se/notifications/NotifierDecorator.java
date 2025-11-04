package cs.nyuad.se.notifications;

public class NotifierDecorator extends Notifier {
    private Notifier wrappee;

    public NotifierDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void sendNotification(String message) {
        wrappee.sendNotification(message);
    }

}
