package dev.lone.itemsadder.api;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;

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

}
