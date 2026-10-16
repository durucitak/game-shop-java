/**
 * Track.java
 * Represents a single music track in a streaming playlist.
 * Your Name: Duru Çıtak
 * Your Student ID: 250444015
 * Your Date: 16.10.2026
 */
public class Track {

    // -------------------------------------------------------
    // Instance variables
    // -------------------------------------------------------
    private String title;
    private String artist;
    private int    durationSeconds;
    private boolean isExplicit;

    // -------------------------------------------------------
    // TODO 1: Full constructor (all four parameters).
    // -------------------------------------------------------
    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        this.title = title;
        this.artist = artist;
        this.isExplicit = isExplicit;

        if (durationSeconds < 0) {
            System.out.println("Warning: Invalid duration. Setting to 0.");
            this.durationSeconds = 0;
        } else {
            this.durationSeconds = durationSeconds;
        }
    }

    // -------------------------------------------------------
    // TODO 2: Title + artist constructor.
    // -------------------------------------------------------
    public Track(String title, String artist) {
        this(title, artist, 0, false);
    }

    // -------------------------------------------------------
    // TODO 3: Title-only constructor.
    // -------------------------------------------------------
    public Track(String title) {
        this(title, "Unknown Artist", 0, false);
    }

    // -------------------------------------------------------
    // TODO 4: Default constructor.
    // -------------------------------------------------------
    public Track() {
        // Note: Using "Unknowm Title" to perfectly match your provided Expected Output typo.
        this("Unknowm Title", "Unknown Artist", 0, false);
    }

    // -------------------------------------------------------
    // TODO 5: Getters for all four fields.
    // -------------------------------------------------------
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public boolean isExplicit() {
        return isExplicit;
    }

    // -------------------------------------------------------
    // TODO 6: getDurationFormatted()
    // -------------------------------------------------------
    public String getDurationFormatted() {
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }

    // -------------------------------------------------------
    // TODO 7: toString()
    // -------------------------------------------------------
    @Override
    public String toString() {
        String baseStr = String.format("\"%s\" by %s [%s]", title, artist, getDurationFormatted());
        if (isExplicit) {
            return baseStr + " [EXPLICIT]";
        }
        return baseStr;
    }
}