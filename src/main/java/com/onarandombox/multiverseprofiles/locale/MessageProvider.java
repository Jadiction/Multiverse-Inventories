package com.onarandombox.multiverseprofiles.locale;

import java.util.List;
import java.util.Locale;

/**
 * Multiverse 2 MessageProvider
 * <p>
 * This interface describes a Multiverse-MessageProvider
 */
public interface MessageProvider {
    /**
     * The default locale.
     */
    public static final Locale DEFAULT_LOCALE = Locale.ENGLISH;

    /**
     * Returns a message (as {@link String}) for the specified key (as {@link MultiverseMessage}).
     *
     * @param key The key
     * @param args Args for String.format()
     * @return The message
     */
    public String getMessage(MultiverseMessage key, Object... args);

    /**
     * Returns a message (as {@link String}) in a specified {@link Locale} for the specified key (as {@link MultiverseMessage}).
     *
     * @param key The Key
     * @param locale The {@link Locale}
     * @param args Args for String.format()
     * @return The message
     */
    public String getMessage(MultiverseMessage key, Locale locale, Object... args);

    /**
     * Returns a message (as {@link List}) of Strings for the specified key (as {@link MultiverseMessage}).
     *
     * @param key The key
     * @param args Args for String.format()
     * @return The messages
     */
    public List<String> getMessages(MultiverseMessage key, Object... args);

    /**
     * Returns a message (as {@link List}) of Strings in a specified {@link Locale} for the specified key (as {@link MultiverseMessage}).
     *
     * @param key The key
     * @param locale The {@link Locale}
     * @param args Args for String.format()
     * @return The messages
     */
    public List<String> getMessages(MultiverseMessage key, Locale locale, Object... args);

    /**
     * Returns the Locale this MessageProvider is currently using.
     */
    public Locale getLocale();

    /**
     * Sets the locale for this MessageProvider.
     *
     * @param locale The new {@link Locale}.
     */
    public void setLocale(Locale locale);
}
