package fr.sstealzz.workshop.item;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public enum Items {
    SWORD(Material.DIAMOND_SWORD),
    APPLE(Material.GOLDEN_APPLE),
    BOW(Material.BOW),

    ;

    private final Material material;

    Items(Material material) {
        this.material = material;
    }

    public ItemStack toItemStack() {
        return new ItemStack(material);
    }
}
