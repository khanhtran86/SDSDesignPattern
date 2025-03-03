package observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{
    private List<Observer> subscriber = new ArrayList<>();
    private String channelTitle;
    @Override
    public void subscribe(Observer observer) {
        subscriber.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscriber.remove(observer);
    }

    @Override
    public void notifyObservers(String videoTitle) {
        for(Observer observer : subscriber) {
            observer.update(videoTitle);
        }
    }

    public void updateVideo(String videoTitle) {
        System.out.println("Youtube channel has new video with title: " + videoTitle);
        notifyObservers(videoTitle);
    }
}
