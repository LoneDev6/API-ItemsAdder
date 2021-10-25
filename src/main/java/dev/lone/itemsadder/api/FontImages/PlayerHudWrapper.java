package dev.lone.itemsadder.api.FontImages;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;

public class PlayerHudWrapper
{
    public PlayerHudWrapper(PlayerHudsHolderWrapper playerHUDsHolderWrapper, String namespacedID)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the internal ItemsAdder object. Should only be used by the plugin developer.
     * @return Internal ItemsAdder object.
     */
    public Object getInternal()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Obtain the original X offset of this player hud, useful in case you edited it using the API.
     * @return integer value of the original X offset.
     */
    public int getInitialOffsetX()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Obtain the current X offset of this player HUD.
     * @return integer value of current X offset.
     */
    public int getOffsetX()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the Namespace and ID in the format {@code namespace:id} for this HUD.
     *
     * @return String representing the namespace and ID of the HUD.
     */
    public String getNamespacedID()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Check if the HUD exists in the ItemsAdder files and it's valid to be used by your plugin code.
     * @return True the HUD exists in ItemsAdder files, otherwise false.
     */
    public boolean exists()
    {
        throw new NotActuallyItemsAdderException();
    }

    public void setVisible(boolean value)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Edit the X offset of this player HUD. Since this is a HUD instance it will be applied only to the
     * player which owns this HUD.
     * @param offset The X offset.
     */
    public void setOffsetX(int offset)
    {
        throw new NotActuallyItemsAdderException();
    }
}
