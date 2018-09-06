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

    public Word(String defaultTranslation, String miwokTranslation) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
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
}
