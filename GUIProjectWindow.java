package prj5;

import CS2114.Window;

/**
 * 
 * @author Gence Yalcin
 *
 */
public class GUIProjectWindow {

    // -------------------FIELDS--------------------- //
    private SongEnum currentSongSort;
    private EntryEnum currentEntrySort;
    private DataProcessor dataProcessor;

    private int screenWidth;
    private int screenHeight;
    
    private Window window;
    private GUILegend legend;
    private DLinkedList<GUIGlyph> glyphs;
    
    private int pageNumber;
    private int pageMax;

    // -------------------CONSTRUCTOR--------------------- //
    public GUIProjectWindow(int width, int height, DataProcessor dp) {
        dataProcessor = dp;
    }

    // -------------------METHODS--------------------- //

}
