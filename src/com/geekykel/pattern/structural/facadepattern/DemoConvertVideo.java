package com.geekykel.pattern.structural.facadepattern;

import java.io.File;

public class DemoConvertVideo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
