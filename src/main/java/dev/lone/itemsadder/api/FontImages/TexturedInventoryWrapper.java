package dev.lone.itemsadder.api.FontImages;

import dev.lone.itemsadder.api.NotActuallyItemsAdderException;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TexturedInventoryWrapper
{
    public TexturedInventoryWrapper(@Nullable InventoryHolder owner, @NotNull InventoryType type, @NotNull String title, FontImageWrapper texture)
    {
        this(owner, type, title, texture, 16, -16);
    }
    public TexturedInventoryWrapper(@Nullable InventoryHolder owner, @NotNull InventoryType type, @NotNull String title, FontImageWrapper texture, int titleOffset)
    {
        this(owner, type, title, texture, titleOffset, -16);
    }
    public TexturedInventoryWrapper(@Nullable InventoryHolder owner, @NotNull InventoryType type, @NotNull String title, FontImageWrapper texture, int titleOffset, int textureOffset)
    {
        throw new NotActuallyItemsAdderException();
    }

    public TexturedInventoryWrapper(@Nullable InventoryHolder owner, int size, @NotNull String title, FontImageWrapper texture)
    {
        this(owner, size, title, texture, 16, -16);
    }
    public TexturedInventoryWrapper(@Nullable InventoryHolder owner, int size, @NotNull String title, FontImageWrapper texture, int titleOffset)
    {
        this(owner, size, title, texture, titleOffset, -16);
    }

    public TexturedInventoryWrapper (@Nullable InventoryHolder owner, int size, @NotNull String title, FontImageWrapper texture, int titleOffset, int textureOffset)
    {
        throw new NotActuallyItemsAdderException();
    }

    public static void setPlayerInventoryTexture(Player player, FontImageWrapper texture, String title)
    {
        throw new NotActuallyItemsAdderException();
    }

    public static void setPlayerInventoryTexture(Player player, FontImageWrapper texture)
    {
        throw new NotActuallyItemsAdderException();
    }

    public static void setPlayerInventoryTexture(Player player, FontImageWrapper texture, int titleOffset)
    {
        throw new NotActuallyItemsAdderException();
    }

    public static void setPlayerInventoryTexture(Player player, FontImageWrapper texture, String title, int titleOffset, int textureOffset)
    {
        throw new NotActuallyItemsAdderException();
    }

    public Inventory getInternal()
    {
        throw new NotActuallyItemsAdderException();
    }

    public void showInventory(Player player)
    {
        throw new NotActuallyItemsAdderException();
    }
}
