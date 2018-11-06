package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Reads the input files to create a
 * 
 * @author Gence Yalcin
 * @version 11.6.2018
 */
public class DataFileReader {

    // -------------------FIELDS--------------------- //
    private File songFile;
    private File entryFile;


    // -------------------CONSTRUCTOR--------------------- //
    public DataFileReader(File songFile, File entryFile) {
        this.songFile = songFile;
        this.entryFile = entryFile;
    }


    // -------------------METHODS--------------------- //

    /**
     * Compiles the input song file into a doubly linked list of songs
     * 
     * @return A doubly linked list of songs
     * @throws FileNotFoundException
     */
    public DLinkedList<Song> generateSongList() {
        try {
            Scanner input = new Scanner(songFile);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        //TODO - FinishMethod
        
        return null;
    }


    /**
     * Compiles the input entry file into a doubly linked list of entries
     * 
     * @return 
     * @throws FileNotFoundException
     */
    public DLinkedList<Entry> generateEntryList() {
        try {
            Scanner input = new Scanner(entryFile);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        //TODO - Finish Method
        
        return null;
    }
}
