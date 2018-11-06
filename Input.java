package prj5;

import java.io.File;

public class Input {

    public static void main(String[] args) {
        File songFile = new File(args[0]);
        File entryFile = new File(args[1]);
        
        DataProcessor dp = new DataProcessor(songFile, entryFile);
        
        new GUIProjectWindow(1500, 1000, dp);
    }
    
}
