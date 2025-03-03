package Facade;

public class VideoConverterFacade {
    public void convertVideoFile(String fileName, String format) {
        VideoFile videoFile = new VideoFile();
        videoFile.redVideoFile(fileName);

        BitrateReader bitrateReader = new BitrateReader();
        bitrateReader.readBitrate(fileName);

        CodecFactory codecFactory = new CodecFactory();
        codecFactory.loadCodec();

        SaveVideoFile saveVideoFile = new SaveVideoFile();
        saveVideoFile.saveVideoFile(format);
    }
}
