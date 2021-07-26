package dev.lone.itemsadder.api;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;

public class ItemsAdder
{
    @Deprecated
    public static boolean areItemsLoaded()
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static boolean isCustomItem(ItemStack itemStack)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static boolean isCustomItem(String customItemName)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static ItemStack getCustomItem(String namespacedId)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static void placeCustomBlock(Location location, ItemStack itemStack)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static void removeCustomBlock(Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static ItemStack getCustomBlockByFaces(Material material, HashMap<BlockFace, Boolean> blockFaces)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static boolean isCustomBlock(Block block)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static List<ItemStack> getCustomBlockLoot(Block block, boolean includeSelfBlock)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static List<ItemStack> getCustomBlockLoot(Block block)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static List<ItemStack> getCustomBlockLoot(Block block, ItemStack tool, boolean includeSelfBlock)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static void placeCustomCrop(Location location, ItemStack seed)//TODO: not tested
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static boolean isCustomCrop(Block block)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static String getCustomSeedNameFromCrop(Block block)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static ItemStack getCustomBlock(Block block)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static boolean matchCustomItemName(ItemStack itemStack, String customItemName)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static boolean isFurniture(Entity entity)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static String getCustomItemName(ItemStack itemStack)
    {
        throw new NotActuallyItemsAdderException();
    }


    @Deprecated
    public static int getCustomItemUsages(ItemStack itemStack)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static ItemStack setCustomItemDurability(ItemStack item, int durability)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static int getCustomItemDurability(ItemStack itemStack)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static int getCustomItemMaxDurability(ItemStack itemStack)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static List<String> getNamespacedBlocksNamesInConfig(String searchStr)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static List<String> getNamespacedBlocksNamesInConfig()
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static BlockData getCustomBlockBlockData(ItemStack customBlock, boolean lightweight)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Play totem animation.
     * <br>Warning: Make sure to delay it using a bukkit runnable (1 tick should be ok)
     * if you call this after you close an inventory or sometimes animation won't show.
     *
     * @param  player
     *         The player to play the anomation towards.
     * @param  namespacedId
     *         The ID in the format {@code namespace:id} to get the totem animation from.
     * 
     * @return True if successfull, false when provided ID was invalid.
     */
    public static boolean playTotemAnimation(Player player, String namespacedId)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    public static void setLiquid(String namespacedID, Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Deprecated
    @Nullable
    public static String getLiquidName(Location location)
    {
        throw new NotActuallyItemsAdderException();
    }
    
    /**
     * Applies the Resource pack set for ItemsAdder to the provided player.
     * 
     * @param player
     *        The player to apply the resource pack to.
     */
    public static void applyResourcepack(Player player)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns all the registered items.
     * @return null if ItemsAdder is not loaded completely, be sure to listen to ItemsAdderFirstLoadEvent
     */
    public static List<CustomStack> getAllItems()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns all the registered items by a specific namespace.
     * @return null if ItemsAdder is not loaded completely, be sure to listen to ItemsAdderFirstLoadEvent
     */
    public static List<CustomStack> getAllItems(String namespace)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Returns all the registered items which use a specific Bukkit Material.
     * @return null if ItemsAdder is not loaded completely, be sure to listen to ItemsAdderFirstLoadEvent
     */
    public static List<CustomStack> getAllItems(Material material)
    {
        throw new NotActuallyItemsAdderException();
    }
}
