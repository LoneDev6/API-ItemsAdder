package dev.lone.itemsadder.api;

import org.bukkit.plugin.Plugin;

/**
 * The {@link NotActuallyItemsAdderException} is thrown whenever someone seems to
 * invoke an API method without actually having ItemsAdder installed.
 * <p>
 * Remember, this is just a "mock", not the actual ItemsAdder project.
 *
 * @author TheBusyBiscuit
 */
public class NotActuallyItemsAdderException extends UnsupportedOperationException
{
    /**
     * Our generated serial version UID (For serialization).
     */
    private static final long serialVersionUID = -4279938101049189157L;

    /**
     * This creates a new {@link NotActuallyItemsAdderException}.
     * Use the actual {@link Plugin} to test your features, not this.
     */
    public NotActuallyItemsAdderException()
    {
        super("Error: ItemsAdder does not seem to be installed. This is just the API reference, not the actual implementation.");
    }
}
