package me.chocobo.skyblockrecreation.utils;

import me.chocobo.skyblockrecreation.dataTypes.SkyblockPlayer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class Startup {
    private static List<SkyblockPlayer> players = new ArrayList<>();

    private static List<String> lore = new ArrayList<>();

    private static List<ItemStack> items = new ArrayList<>();

    public static void addPlayer(SkyblockPlayer player) {
        players.add(player);
    }

    public static List<SkyblockPlayer> getPlayers() {
        return players;
    }

    public static List<ItemStack> getItems() {
        return items;
    }

    private static void addItems(ItemStack itemStack) {
        items.add(itemStack);
    }

    public static void startupItems() {
        sbmenu();
        skills();
        collection();
        recipeBook();
        trades();
        questLog();
        calendar();
        enderChest();
        pets();
        craftingTable();
        wardrobe();
        personalBank();
        fastTravel();
        profileManagement();
        close();
        settings();
    }

    private static void sbmenu() {
        lore.add("§7View all of your SkyBlock");
        lore.add("§7progress, including your Skills,");
        lore.add("§7Collections, Recipes, and more!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.NETHER_STAR).setDisplayName("§2SkyBlock Menu §7(Right Click)").setLore(lore).build();
        lore.clear();
        addItems(itemStack);
    }

    private static void skills() {
        lore.add("§7View your Skill progression and");
        lore.add("§7rewards.");
        lore.add("");
        lore.add("§eClick to view!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.DIAMOND_SWORD).setDisplayName("§2Your Skills").setLore(lore).build();
        lore.clear();
        addItems(itemStack);
    }

    private static void collection() {
        lore.add("§7View all of the items available");
        lore.add("§7in Skyblock. Collect more of an");
        lore.add("§7item to unlock rewards on your");
        lore.add("§7way to becoming the master of");
        lore.add("§7SkyBlock!");
        lore.add("");
        lore.add("§7Collection Maxed Out: ");
        lore.add("");
        lore.add("");
        lore.add("§eClick to view!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.PAINTING).setDisplayName("§2Collection").setLore(lore).build();
        lore.clear();
        addItems(itemStack);
    }

    private static void recipeBook() {
        lore.add("§7Through your adventure, you will");
        lore.add("§7unlock recipes for all kinds of");
        lore.add("§7special items! You can view how");
        lore.add("§7to craft these items here.");
        lore.add("");
        lore.add("§7Recipe Book Unlocked: ");
        lore.add("");
        lore.add("");
        lore.add("§eClick to view!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.BOOK).setDisplayName("§2Recipe Book").setLore(lore).build();
        lore.clear();
        addItems(itemStack);
    }

    private static void trades() {
        lore.add("§7View your available trades.");
        lore.add("§7These trades are always");
        lore.add("§7available and accesible through");
        lore.add("§7the SkyBlock Menu.");
        lore.add("");
        lore.add("§7Trades Unlocked: ");
        lore.add("");
        lore.add("");
        lore.add("§eClick to view!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.EMERALD).setDisplayName("§2Trades").setLore(lore).build();
        lore.clear();
        addItems(itemStack);
    }

    private static void questLog() {
        lore.add("§7View your active quests,");
        lore.add("§7progress, and rewards.");
        lore.add("");
        lore.add("§eClick to view!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.BOOK_AND_QUILL).setDisplayName("§2Quest Log").setLore(lore).build();
        lore.clear();
        addItems(itemStack);
    }

    private static void calendar() {
        lore.add("§7View the SkyBlock Calendar,");
        lore.add("§7upcoming events, and event");
        lore.add("§7rewards!");
        lore.add("");
        lore.add("§7Next Event: ");
        lore.add("§7Starting in: ");
        lore.add("");
        lore.add("§eClick to view!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.WATCH).setDisplayName("§2Calendar and Events").setLore(lore).build();
        lore.clear();
        addItems(itemStack);
    }

    private static void enderChest() {
        lore.add("§7Store global items that you want");
        lore.add("§7to access at any time from");
        lore.add("§7anywhere here.");
        lore.add("");
        lore.add("§eClick to view!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.ENDER_CHEST).setDisplayName("§2Ender Chest").setLore(lore).build();
        lore.clear();
        addItems(itemStack);
    }

    private static void pets() {
        lore.add("§7View and manage all of your");
        lore.add("§7Pets.");
        lore.add("");
        lore.add("§7Level up your pets faster by gaining xp in their favourite");
        lore.add("§7skill!");
        lore.add("");
        lore.add("Selected pet: ");
        lore.add("");
        lore.add("§eClick to view!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.BONE).setDisplayName("§2Pets").setLore(lore).build();
        lore.clear();
        addItems(itemStack);
    }

    private static void craftingTable() {
        lore.add("§7Opens the crafting grid.");
        lore.add("");
        lore.add("§eClick to view!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.WORKBENCH).setDisplayName("§2Crafting Table").setLore(lore).build();
        lore.clear();
        addItems(itemStack);
    }

    private static void wardrobe() {
        lore.add("§7Store armor sets and quickly");
        lore.add("§7swap between them!");
        lore.add("");
        lore.add("§eClick to view!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.LEATHER_CHESTPLATE).setDisplayName("§2Wardrobe").setLore(lore).build();
        lore.clear();
        addItems(itemStack);
    }

    private static void personalBank() {
        lore.add("§7Contact your Banker from");
        lore.add("§7anywhere.");
        lore.add("§7Cooldown: ");
        lore.add("");
        lore.add("§7Banker Status:");
        lore.add("");
        lore.add("");
        lore.add("§eClick to open!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.SKULL_ITEM).setDisplayName("§2Personal Bank").setLore(lore).build();
        lore.clear();
        addItems(itemStack);
    }

    private static void fastTravel() {
        lore.add("§7Teleport to islands you've");
        lore.add("§7already visited.");
        lore.add("");
        lore.add("§bRight-Click for hub warp!");
        lore.add("§eClick to pick location!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.SKULL_ITEM).setDisplayName("§bFast Travel").setLore(lore).build();
        lore.clear();
        addItems(itemStack);
    }

    private static void profileManagement() {
        lore.add("§7You can have multiple");
        lore.add("§7Skyblock profiles at the");
        lore.add("§7same time.");
        lore.add("");
        lore.add("§7Each profile has its own");
        lore.add("§7island, inventory, quest");
        lore.add("§7log...");
        lore.add("");
        lore.add("§7Profiles: ");
        lore.add("§7Playing on: ");
        lore.add("");
        lore.add("§bPlay with friends using /coop!");
        lore.add("");
        lore.add("§eClick to manage!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.NAME_TAG).setDisplayName("§2Profile Management").setLore(lore).build();
        lore.clear();
        addItems(itemStack);
    }

    private static void close() {
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.BARRIER).setDisplayName("§cClose").build();
        addItems(itemStack);
    }

    private static void settings() {
        lore.add("§7View and edit your SkyBlock");
        lore.add("§7settings.");
        lore.add("");
        lore.add("§eClick to view!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.REDSTONE_TORCH_ON).setDisplayName("§2Settings").setLore(lore).build();
        lore.clear();
        addItems(itemStack);
    }
}
