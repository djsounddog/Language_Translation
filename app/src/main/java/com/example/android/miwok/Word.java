package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn
 * It contains a default translation and the corresponding Miwok translation
 */
public class Word {

    //** Default translation for the word */
    private String mDefaultTranslation;

    //** Miwok translation for the word */
    private String mMiwokTranslation;

    //* Image that relates to the word */
    private int mImage = NO_IMAGE_PROVIDED;

    //*State for when there is no image */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int image) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImage = image;
    }
    /**
     * @return the default translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * @return the Miwok translation of the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * @return the image for the word
     */
    public int getImage() {
        return mImage;
    }

    public boolean hasImage() {
        return mImage != -1;
    }
}
