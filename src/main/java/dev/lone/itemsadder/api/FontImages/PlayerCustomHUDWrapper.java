package dev.lone.itemsadder.api.FontImages;


import dev.lone.itemsadder.api.NotActuallyItemsAdderException;

import java.util.List;

public class PlayerCustomHUDWrapper extends PlayerQuantityHudWapper
{
    public PlayerCustomHUDWrapper(PlayerHUDsHolderWrapper playerHUDsHolderWrapper, String namespacedID)
    {
        super(playerHUDsHolderWrapper, namespacedID);
        throw new NotActuallyItemsAdderException();
    }

    public void clearFontImagesAndRefresh()
    {
        throw new NotActuallyItemsAdderException();
    }

    public void setFontImages(List<FontImageWrapper> fontImageWrappers)
    {
        throw new NotActuallyItemsAdderException();
    }

    public void removeFontImageByIndex(int index)
    {
        throw new NotActuallyItemsAdderException();
    }

    public void addFontImageToIndex(FontImageWrapper fontImageWrapper, int index)
    {
        throw new NotActuallyItemsAdderException();
    }

    public void addFontImage(FontImageWrapper fontImageWrapper)
    {
        throw new NotActuallyItemsAdderException();
    }

    public int getFontImagesCount()
    {
        throw new NotActuallyItemsAdderException();
    }
}
