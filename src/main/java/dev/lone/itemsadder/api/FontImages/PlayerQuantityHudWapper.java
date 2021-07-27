package dev.lone.itemsadder.api.FontImages;


import dev.lone.itemsadder.api.NotActuallyItemsAdderException;

public class PlayerQuantityHudWapper extends PlayerHudWapper
{
    public PlayerQuantityHudWapper(PlayerHUDsHolderWrapper playerHUDsHolderWrapper, String namespacedID)
    {
        super(playerHUDsHolderWrapper, namespacedID);
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the internal ItemsAdder object. Should only be used by the plugin developer.
     */
    public Object getInternal()
    {
        throw new NotActuallyItemsAdderException();
    }

    public void setFloatValue(float value)
    {
        throw new NotActuallyItemsAdderException();
    }

    public float getFloatValue()
    {
        throw new NotActuallyItemsAdderException();
    }
}
