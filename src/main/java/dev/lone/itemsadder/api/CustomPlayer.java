package dev.lone.itemsadder.api;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.Nullable;

public class CustomPlayer extends CustomEntity
{
    public String getPlayerName()
    {
        throw new NotActuallyItemsAdderException();
    }

    @Override
    public boolean playAnimation(String emoteName)
    {
        throw new NotActuallyItemsAdderException();
    }

    public void stopAnimation()
    {
        throw new NotActuallyItemsAdderException();
    }

    /**
     * Spawns a custom player entity
     * @param playerSkin can be a player name, a mineskin.org url and a signed texture string.
     * @param location the location where you want to spawn the entity
     * @return the entity wrapper
     */
    public static CustomPlayer spawn(String playerSkin, Location location)
    {
        throw new NotActuallyItemsAdderException();
    }

    @Nullable
    public static CustomPlayer byAlreadySpawned(Entity entity)
    {
        throw new NotActuallyItemsAdderException();
    }

    public static void playEmote(Player player, String emoteName)
    {
        throw new NotActuallyItemsAdderException();
    }

    public static void stopEmote(Player player)
    {
        throw new NotActuallyItemsAdderException();
    }
}
