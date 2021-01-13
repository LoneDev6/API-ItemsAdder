package dev.lone.itemsadder.api;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CustomBlock
{
    @Nullable
    public static CustomBlock place(String namespacedId, Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Nullable
    public static CustomBlock byAlreadyPlaced(Block block)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns true if removed and false if not removed (not a custom block)
     * @param location
     * @return
     */
    public static boolean remove(Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns true if removed and false if not removed (not a custom block)
     * @param
     * @return
     */
    public boolean remove()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the Bukkit Block
     * @return
     */
    public Block getBlock()
    {
        throw new NotActuallyItemsAdderException();
    }

    public CustomStack getCustomStack()
    {
        throw new NotActuallyItemsAdderException();
    }

    public List<ItemStack> getLoot(boolean includeSelfBlock)
    {
        throw new NotActuallyItemsAdderException();
    }

    public List<ItemStack> getLoot()
    {
        throw new NotActuallyItemsAdderException();
    }

    public List<ItemStack> getLoot(ItemStack tool, boolean includeSelfBlock)
    {
        throw new NotActuallyItemsAdderException();
    }

    public int getOriginalLightLevel()
    {
        throw new NotActuallyItemsAdderException();
    }

    public void setCurrentLightLevel(int level)
    {
        throw new NotActuallyItemsAdderException();
    }
}
