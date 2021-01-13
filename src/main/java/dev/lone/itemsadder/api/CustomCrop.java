package dev.lone.itemsadder.api;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.jetbrains.annotations.Nullable;

public class CustomCrop
{
    @Nullable
    public static CustomCrop place(String seed_namespacedId, Location location)
    {
        throw new NotActuallyItemsAdderException();
    }
    @Nullable
    public static CustomCrop byAlreadyPlaced(Block block)
    {
        throw new NotActuallyItemsAdderException();
    }

    public CustomStack getSeed()
    {
        throw new NotActuallyItemsAdderException();
    }

    public int getAge()
    {
        throw new NotActuallyItemsAdderException();
    }

    public void setAge(int age)
    {
        throw new NotActuallyItemsAdderException();
    }

    public boolean isFullyGrown()
    {
        throw new NotActuallyItemsAdderException();
    }

    public int getMaxAge()
    {
        throw new NotActuallyItemsAdderException();
    }

    public void setFullyGrown()
    {
        throw new NotActuallyItemsAdderException();
    }

    public void incrementAge()
    {
        throw new NotActuallyItemsAdderException();
    }
}
