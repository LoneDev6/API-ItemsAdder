package dev.lone.itemsadder.api;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CustomBlock extends CustomStack
{
    /**
     * Gets a clone of the custom stack declared in ItemsAdder registry.
     * You can give this to a player and do whatever you want without overwriting the original item.
     *
     * @param namespacedID
     * @return
     */
    @Nullable
    public static CustomBlock getInstance(String namespacedID)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns null if the provided {@ItemStack} is not a custom item created with ItemsAdder
     *
     * @param itemStack
     * @return
     */
    @Nullable
    public static CustomBlock byItemStack(ItemStack itemStack)
    {
        throw new NotActuallyItemsAdderException();
    }

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
     *
     * @param location
     * @return
     */
    public static boolean remove(Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    public BlockData generateBlockData()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Gets the Bukkit Block
     *
     * @return
     */
    public Block getBlock()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Checks if this CustomBlock instance is in the world or not.
     *
     * @return
     */
    public boolean isPlaced()
    {
        throw new NotActuallyItemsAdderException();
    }

    public CustomBlock place(Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns true if removed and false if not removed (not a custom block)
     *
     * @param
     * @return
     */
    public boolean remove()
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
