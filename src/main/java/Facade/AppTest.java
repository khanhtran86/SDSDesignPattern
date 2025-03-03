package Facade;

public class AppTest {
    public static void main(String[] args) {
        String videoFile = "MyVideo.mp4";
        String format = "mp3";

        VideoConverterFacade converter = new VideoConverterFacade();
        converter.convertVideoFile(videoFile, format);
    }
}
