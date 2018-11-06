package prj5;

import java.io.File;

/**
 * Processes data
 * 
 * @author Gence Yalcin
 * @version 11.6.2018
 */
public class DataProcessor {

    // -------------------FIELDS--------------------- //

    private DataFileReader reader;
    private DLinkedList<Song> songList;
    private DLinkedList<Entry> entryList;


    // -------------------CONSTRUCTOR--------------------- //

    /**
     * Constructs a data processor with parameter files passed to the reader
     * field
     * 
     * @param songFile
     *            File of which songs will be imported
     * @param entryFile
     *            File of which entries will be imported
     */
    public DataProcessor(File songFile, File entryFile) {
        reader = new DataFileReader(songFile, entryFile);
        songList = reader.generateSongList();
        entryList = reader.generateEntryList();
    }


    // -------------------METHODS--------------------- //

    /**
     * 
     * @return
     */
    public DLinkedList<GUIGlyph> generateGlyphs(
        SongEnum songSort,
        EntryEnum entrySort) {
        // TODO - Finish method
        return null;
    }


    /**
     * 
     * 
     * @return
     */
    public GUILegend generateLegend(
        SongEnum songSort,
        EntryEnum entrySort) {
        // TODO - Finish method
        return null;
    }


    /**
     * 
     * @param song
     * @param entrySort
     * @return
     */
    public double percentageHeard(Song song, EntryEnum entrySort) {
        // TODO - Finish method
        return 0;
    }


    /**
     * 
     * @param song
     * @param entrySort
     * @return
     */
    public double percentageLikes(Song song, EntryEnum entrySort) {
        // TODO - Finish method
        return 0;
    }


    /**
     * Sorts entries by song characteristics
     * 
     * @param sort
     */
    private void sortSongs(SongEnum sort) {

    }


    /**
     * Sorts entries by entry characteristics
     * 
     * @param sort
     */
    private void sortEntries(EntryEnum sort) {

    }
}
