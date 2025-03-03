package observer;

public class DemoObserver {
    public static void main(String[] args) {
        YouTubeChannel ssChannel = new YouTubeChannel();

        Subscriber alice = new Subscriber("Alice");
        Subscriber bob = new Subscriber("Bob");
        Subscriber charlie = new Subscriber("Charlie");

        ssChannel.subscribe(alice);
        ssChannel.subscribe(bob);
        ssChannel.subscribe(charlie);

        ssChannel.updateVideo("Welcome new freshers!");

        ssChannel.unsubscribe(bob);

        ssChannel.updateVideo("Summer holiday!");
    }
}
