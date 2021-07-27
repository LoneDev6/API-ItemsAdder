package dev.lone.itemsadder.api.FontImages;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Class representing a custom textured inventory.
 */
public class TexturedInventoryWrapper
{
    /**
     * Create a custom textured inventory.
     *
     * @param owner
     *        The holder of the inventory, or null to indicate no holder
     *
     * @param type
     *        The type of inventory to create.
     *
     * @param title
     *        The title of the inventory, to be displayed when it is viewed.
     *
     * @param texture
     *        {@link FontImageWrapper} to be used as texture for this inventory
     */
    public TexturedInventoryWrapper(@Nullable InventoryHolder owner, @NotNull InventoryType type, @NotNull String title, FontImageWrapper texture)
    {
        this(owner, type, title, texture, 16, -16);
    }

    /**
     * Create a custom textured inventory.
     *
     * @param owner
     *        The holder of the inventory, or null to indicate no holder
     *
     * @param type
     *        The type of inventory to create.
     *
     * @param title
     *        The title of the inventory, to be displayed when it is viewed.
     *
     * @param texture
     *        {@link FontImageWrapper} to be used as texture for this inventory
     *
     * @param titleOffset
     *        Offset to shift the title back or forward. Default value is {@code 16}
     */
    public TexturedInventoryWrapper(@Nullable InventoryHolder owner, @NotNull InventoryType type, @NotNull String title, FontImageWrapper texture, int titleOffset)
    {
        this(owner, type, title, texture, titleOffset, -16);
    }

    /**
     * Create a custom textured inventory.
     *
     * @param owner
     *        The holder of the inventory, or null to indicate no holder
     *
     * @param type
     *        The type of inventory to create.
     *
     * @param title
     *        The title of the inventory, to be displayed when it is viewed.
     *
     * @param texture
     *        {@link FontImageWrapper} to be used as texture for this inventory
     *
     * @param titleOffset
     *        Offset to shift the title back or forward. Default value is {@code 16}
     *
     * @param textureOffset
     *        Offset to shift the {@link FontImageWrapper} back or forward. Default value is {@code -16}
     */
    public TexturedInventoryWrapper(@Nullable InventoryHolder owner, @NotNull InventoryType type, @NotNull String title, FontImageWrapper texture, int titleOffset, int textureOffset)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Create a custom textured inventory.
     *
     * @param owner
     *        The holder of the inventory, or null to indicate no holder
     *
     * @param size
     *        A multiple of 9 as the size of inventory to create
     *
     * @param title
     *        The title of the inventory, to be displayed when it is viewed.
     *
     * @param texture
     *        {@link FontImageWrapper} to be used as texture for this inventory
     */
    public TexturedInventoryWrapper(@Nullable InventoryHolder owner, int size, @NotNull String title, FontImageWrapper texture)
    {
        this(owner, size, title, texture, 16, -16);
    }

    /**
     * Create a custom textured inventory.
     *
     * @param owner
     *        The holder of the inventory, or null to indicate no holder
     *
     * @param size
     *        A multiple of 9 as the size of inventory to create
     *
     * @param title
     *        The title of the inventory, to be displayed when it is viewed.
     *
     * @param texture
     *        {@link FontImageWrapper} to be used as texture for this inventory
     *
     * @param titleOffset
     *        Offset to shift the title back or forward. Default value is {@code 16}
     */
    public TexturedInventoryWrapper(@Nullable InventoryHolder owner, int size, @NotNull String title, FontImageWrapper texture, int titleOffset)
    {
        this(owner, size, title, texture, titleOffset, -16);
    }

    /**
     * Create a custom textured inventory.
     *
     * @param owner
     *        The holder of the inventory, or null to indicate no holder
     *
     * @param size
     *        A multiple of 9 as the size of inventory to create
     *
     * @param title
     *        The title of the inventory, to be displayed when it is viewed.
     *
     * @param texture
     *        {@link FontImageWrapper} to be used as texture for this inventory
     *
     * @param titleOffset
     *        Offset to shift the title back or forward. Default value is {@code 16}
     *
     * @param textureOffset
     *        Offset to shift the {@link FontImageWrapper} back or forward. Default value is {@code -16}
     */
    public TexturedInventoryWrapper (@Nullable InventoryHolder owner, int size, @NotNull String title, FontImageWrapper texture, int titleOffset, int textureOffset)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Static utility method to change texture of an inventory at runtime.
     * This can be used with any inventory, also Bukkit ones.
     *
     * @param player
     *        Player who's viewing the inventory.
     *
     * @param texture
     *        {@link FontImageWrapper} to be used as texture for this inventory
     *
     * @param title
     *        The title of the inventory, to be displayed when it is viewed.
     */
    public static void setPlayerInventoryTexture(Player player, FontImageWrapper texture, String title)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Static utility method to change texture of an inventory at runtime.
     * This can be used with any inventory, also Bukkit ones.
     *
     * @param player
     *        Player who's viewing the inventory.
     *
     * @param texture
     *        {@link FontImageWrapper} to be used as texture for this inventory
     */
    public static void setPlayerInventoryTexture(Player player, FontImageWrapper texture)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Static utility method to change texture of an inventory at runtime.
     * This can be used with any inventory, also Bukkit ones.
     *
     * @param player
     *        Player who's viewing the inventory.
     *
     * @param texture
     *        {@link FontImageWrapper} to be used as texture for this inventory
     *
     * @param titleOffset
     *        Offset to shift the title back or forward. Default value is {@code 16}
     */
    public static void setPlayerInventoryTexture(Player player, FontImageWrapper texture, int titleOffset)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Static utility method to change texture of an inventory at runtime.
     * This can be used with any inventory, also Bukkit ones.
     *
     * @param player
     *        Player who's viewing the inventory.
     *
     * @param texture
     *        {@link FontImageWrapper} to be used as texture for this inventory
     *
     * @param titleOffset
     *        Offset to shift the title back or forward. Default value is {@code 16}
     *
     * @param textureOffset
     *        Offset to shift the {@link FontImageWrapper} back or forward. Default value is {@code -16}
     */
    public static void setPlayerInventoryTexture(Player player, FontImageWrapper texture, String title, int titleOffset, int textureOffset)
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Get the Bukkit inventory.
     * @return
     */
    public Inventory getInternal()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Show this custom inventory to a player.
     * @param player
     *        Player to show the inventory to.
     */
    public void showInventory(Player player)
    {
        throw new NotActuallyItemsAdderException();
    }
}
