package me.chocobo.skyblockrecreation.utils;

import me.chocobo.skyblockrecreation.dataTypes.SkyblockEnemy;
import me.chocobo.skyblockrecreation.dataTypes.SkyblockItem;
import me.chocobo.skyblockrecreation.dataTypes.SkyblockPlayer;
import me.chocobo.skyblockrecreation.dataTypes.SkyblockWeapon;
import me.chocobo.skyblockrecreation.enums.EnemyType;
import me.chocobo.skyblockrecreation.enums.ItemRarity;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.*;

public class Startup {
    private static Map<UUID, SkyblockPlayer> players = new HashMap<>();
    private static List<SkyblockEnemy> enemies = new ArrayList<>();
    private static List<String> lore = new ArrayList<>();
    private static List<ItemStack> uiItems = new ArrayList<>();
    private static List<SkyblockItem> skyblockItems = new ArrayList<>();



    public static Map<UUID, SkyblockPlayer> getSkyblockPlayers() {
        return players;
    }
    public static List<SkyblockEnemy> getSkyblockEnemies() {
        return enemies;
    }
    public static List<ItemStack> getUiItems() {
        return uiItems;
    }
    public static List<SkyblockItem> getSkyblockItems() {
        return skyblockItems;
    }

    public static void addSkyblockPlayer(SkyblockPlayer player) {
        players.put(player.getUuid(), player);
    }
    public static void addSkyblockEnemy(SkyblockEnemy enemy) {
        enemies.add(enemy);
    }
    private static void addUiItems(ItemStack itemStack) {
        uiItems.add(itemStack);
    }
    private static void addSkyblockItems(SkyblockItem skyblockItem) {
        skyblockItems.add(skyblockItem);
    }

    public static Inventory fillSbMenu(Player player, Inventory inv) {
        List<ItemStack> startupItems = getUiItems();

        inv.setItem(13, new ItemBuilder().setMaterial(Material.SKULL).setDisplayName("§2Your SkyBlock Profile").build());
        for(int i = 0; i < 7; i++) {
            inv.setItem(i+19, startupItems.get(i+1));
        }
        inv.setItem(31, startupItems.get(9));
        for(int i = 0; i < 4; i++) {
            inv.setItem(i+47, startupItems.get(i+12));
        }
        return inv;
    }

    public static Inventory createSbMenu() {
        Inventory inv = new InventoryBuilder().setSize(9*6).setTitle("SkyBlock Menu").createSize()
                .fillInventory(new ItemBuilder().setMaterial(Material.STAINED_GLASS_PANE).setDisplayName("").build()).build();
        return inv;
    }

    public static void menuCache() {
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
        weaponCache();
    }

    /*
    Material material, String name, List<String> lore, ItemRarity rarity,
    int damage, int strength, int critDamage, int critHit, int attackSpeed, int intelligence
     */

    public static void weaponCache() {
        addSkyblockItems(new SkyblockWeapon(Material.WOOD_SWORD,"Wooden Sword", new ArrayList<>(), ItemRarity.COMMON,
                20, 0, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.GOLD_SWORD, "Golden Sword", new ArrayList<>(), ItemRarity.COMMON,
                20, 0, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.STONE_SWORD, "Stone Sword", new ArrayList<>(), ItemRarity.COMMON,
                25, 0, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "IRON Sword", new ArrayList<>(), ItemRarity.COMMON,
                30, 0, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.DIAMOND_SWORD, "Diamond Sword", new ArrayList<>(), ItemRarity.UNCOMMON,
                35, 0, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.WOOD_SWORD, "Aspect of the Jerry", new ArrayList<>(), ItemRarity.COMMON,
                1, 0, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "Fancy Sword", new ArrayList<>(), ItemRarity.COMMON,
                20, 0, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.GOLD_SWORD, "Rogue Sword", new ArrayList<>(), ItemRarity.COMMON,
                20, 0, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "Spider Sword", new ArrayList<>(), ItemRarity.COMMON,
                30, 0, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "Undead Sword", new ArrayList<>(), ItemRarity.COMMON,
                30, 0, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.DIAMOND_SWORD, "End Sword", new ArrayList<>(), ItemRarity.UNCOMMON,
                35, 0, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.GOLD_SWORD, "Cleaver", new ArrayList<>(), ItemRarity.UNCOMMON,
                40, 10, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "Flaming Sword", new ArrayList<>(), ItemRarity.UNCOMMON,
                50, 20, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.PRISMARINE_SHARD, "Prismarine Blade", new ArrayList<>(), ItemRarity.UNCOMMON,
                50, 25, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "Hunter Knife", new ArrayList<>(), ItemRarity.UNCOMMON,
                50, 0, 0, 0, 0, 0, 40, 0));
        addSkyblockItems(new SkyblockWeapon(Material.WOOD_SWORD, "Tactician's Sword", new ArrayList<>(), ItemRarity.RARE,
                50, 20, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.BLAZE_ROD, "Ember Rod", new ArrayList<>(), ItemRarity.EPIC,
                80, 35, 0, 0, 0, 20, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_HOE, "Frozen Scythe", new ArrayList<>(), ItemRarity.RARE,
                80, 0, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "Golem Sword", new ArrayList<>(), ItemRarity.RARE,
                80, 125, 0, 0, 0, 0, 0, 25));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_AXE, "Raiders Axe", new ArrayList<>(), ItemRarity.RARE,
                80, 50, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.DIAMOND_SWORD, "Revenant Falchion", new ArrayList<>(), ItemRarity.RARE,
                90, 50, 0, 0, 0, 100, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.GHAST_TEAR, "Silver Fang", new ArrayList<>(), ItemRarity.UNCOMMON,
                100, 0, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "Shaman Sword", new ArrayList<>(), ItemRarity.EPIC,
                100, 20, 0, 0, 0, 0, 5, 0));
        addSkyblockItems(new SkyblockWeapon(Material.DIAMOND_SWORD, "Aspect of the End", new ArrayList<>(), ItemRarity.RARE,
                100, 100, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.WOOD_SWORD, "Scorpion Foil", new ArrayList<>(), ItemRarity.EPIC,
                100, 100, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "Zombie Sword", new ArrayList<>(), ItemRarity.RARE,
                100, 50, 0, 0, 0, 50, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.GOLD_SWORD, "Ornate Zombie Sword", new ArrayList<>(), ItemRarity.EPIC,
                110, 60, 0, 0, 0, 50, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.GOLD_SWORD, "End Stone Sword", new ArrayList<>(), ItemRarity.EPIC,
                120, 80, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "Recluse Fang", new ArrayList<>(), ItemRarity.RARE,
                120, 30, 20, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.DIAMOND_SWORD, "Reaper Falchion", new ArrayList<>(), ItemRarity.EPIC,
                120, 100, 0, 0, 0, 200, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.GOLD_SWORD, "Pooch Sword", new ArrayList<>(), ItemRarity.LEGENDARY,
                120, 20, 0, 0, 0, 0, 5, 0));
        addSkyblockItems(new SkyblockWeapon(Material.MUTTON, "Edible Mace", new ArrayList<>(), ItemRarity.RARE,
                125, 25, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.STICK, "Ink Wand", new ArrayList<>(), ItemRarity.EPIC,
                130, 90, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.EMERALD, "Emerald Blade", new ArrayList<>(), ItemRarity.EPIC,
                130, 0, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.GOLD_SWORD, "Midas Sword", new ArrayList<>(), ItemRarity.LEGENDARY,
                150, 0, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.GOLD_SWORD, "Leaping Sword", new ArrayList<>(), ItemRarity.EPIC,
                150, 100, 25, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "Yeti Sword", new ArrayList<>(), ItemRarity.LEGENDARY,
                150, 150, 0, 0, 0, 50, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.GOLD_SWORD, "Silk-Edge Sword", new ArrayList<>(), ItemRarity.EPIC,
                175, 125, 25, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.GOLD_SWORD, "Pigman Sword", new ArrayList<>(), ItemRarity.LEGENDARY,
                200, 100, 30, 5, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.DIAMOND_SWORD, "Aspect of the Dragons", new ArrayList<>(), ItemRarity.LEGENDARY,
                225, 100, 0, 0, 0, 0, 0, 0));
        addSkyblockItems(new SkyblockWeapon(Material.DIAMOND_HOE, "Reaper Scythe", new ArrayList<>(), ItemRarity.LEGENDARY,
                333, 0, 0, 0, 0, 0, 10, 0));
        addSkyblockItems(new SkyblockWeapon(Material.STONE_SWORD, "Adaptive Blade", new ArrayList<>(), ItemRarity.EPIC,
                170, 0, 0, 0, 0, 0, 0, 0));
    }

    public static void enemyCache() {
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.ZOMBIE_VILLAGER, 1, 120, 24));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.ZOMBIE, 1, 100, 20));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.ENDERMITE, 1, 2000, 475));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SLIME_SMALL, 5, 80, 70));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SLIME_MEDIUM, 10, 150, 100));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SLIME_LARGE, 15, 250, 150));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.CREEPER, 3, 120, 80));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.LAPIS_ZOMBIE, 7, 200, 50));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SKELETON, 6, 200, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.DIAMOND_SKELETON, 20, 300, 190));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.HARDENED_DIAMOND_SKELETON, 15, 250, 142));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.DIAMOND_ZOMBIE, 20, 300, 275));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.HARDENED_DIAMOND_ZOMBIE, 15, 250, 200));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.ZOMBIE_PIGMAN, 10, 250, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SPLITTER_SPIDER, 2, 180, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SPLITTER_SPIDER, 4, 220, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.DASHER_SPIDER, 4, 170, 55));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.DASHER_SPIDER, 6, 210, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.WEAVER_SPIDER, 3, 160, 35));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SPIDER_JOCKEY, 3, 220, 55));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.JOCKEY_SKELETON, 3, 250, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SKELETON, 2, 100, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.VORACIOUS_SPIDER, 10, 1000, 100));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.BROOD_MOTHER, 12, 6000, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SILVERFISH, 1, 50, 20));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SLIME, 8, 0, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.BLAZE, 12, 500, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.BLAZE, 15, 600, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.WITHER_SKELETON, 10, 250, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.ZOMBIE_PIGMAN, 12, 240, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.CUBE_BOSS, 100, 150000, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.CUBE_SMALL, 3, 200, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.CUBE_MEDIUM, 6, 250, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.CUBE_LARGE, 9, 300, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.GHAST, 17, 330, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.WOLF, 15, 250, 90));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.OLD_WOLF, 55, 15000, 800));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.ENDERMAN_SMALL, 42, 4500, 500));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.ENDERMAN_MEDIUM, 45, 6000, 600));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.ENDERMAN_LARGE, 50, 9000, 700));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.ZEALOT, 55, 13000, 1250));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.CHEST_ZEALOT,55, 13000, 1250));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SPECIAL_ZEALOT, 55, 2000, 1250));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.WATCHER, 55, 9500, 475));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.OBSIDIAN_DEFENDER, 55, 10000, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.ENDERMITE, 40, 2000, 475));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.ENDSTONE_PROTECTOR, 0, 5000000, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.DRAGON, 0, 7500000, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.OLD_DRAGON, 0, 12000000, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.YOUNG_DRAGON, 0, 6000000, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SUPERIOR_DRAGON, 0, 10000000, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.CRYPT_GHOUL, 30, 2000, 350));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.GOLDEN_GHOUL, 50, 45000, 800));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.PACK_SPIRIT, 30, 6000, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.HOWLING_SPIRIT, 35, 7000, 500));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SOUL_OF_THE_ALPHA, 55, 31150, 1150));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.HEADLESS_HORSEMAN, 100, 3000000, 0));


    }

    private static void sbmenu() {
        lore.add("§7View all of your SkyBlock");
        lore.add("§7progress, including your Skills,");
        lore.add("§7Collections, Recipes, and more!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.NETHER_STAR).setDisplayName("§2SkyBlock Menu §7(Right Click)").setLore(lore).build();
        lore.clear();
        addUiItems(itemStack);
    }

    private static void skills() {
        lore.add("§7View your Skill progression and");
        lore.add("§7rewards.");
        lore.add("");
        lore.add("§eClick to view!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.DIAMOND_SWORD).setDisplayName("§2Your Skills").setLore(lore).build();
        lore.clear();
        addUiItems(itemStack);
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
        addUiItems(itemStack);
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
        addUiItems(itemStack);
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
        addUiItems(itemStack);
    }

    private static void questLog() {
        lore.add("§7View your active quests,");
        lore.add("§7progress, and rewards.");
        lore.add("");
        lore.add("§eClick to view!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.BOOK_AND_QUILL).setDisplayName("§2Quest Log").setLore(lore).build();
        lore.clear();
        addUiItems(itemStack);
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
        addUiItems(itemStack);
    }

    private static void enderChest() {
        lore.add("§7Store global items that you want");
        lore.add("§7to access at any time from");
        lore.add("§7anywhere here.");
        lore.add("");
        lore.add("§eClick to view!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.ENDER_CHEST).setDisplayName("§2Ender Chest").setLore(lore).build();
        lore.clear();
        addUiItems(itemStack);
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
        addUiItems(itemStack);
    }

    private static void craftingTable() {
        lore.add("§7Opens the crafting grid.");
        lore.add("");
        lore.add("§eClick to view!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.WORKBENCH).setDisplayName("§2Crafting Table").setLore(lore).build();
        lore.clear();
        addUiItems(itemStack);
    }

    private static void wardrobe() {
        lore.add("§7Store armor sets and quickly");
        lore.add("§7swap between them!");
        lore.add("");
        lore.add("§eClick to view!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.LEATHER_CHESTPLATE).setDisplayName("§2Wardrobe").setLore(lore).build();
        lore.clear();
        addUiItems(itemStack);
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
        addUiItems(itemStack);
    }

    private static void fastTravel() {
        lore.add("§7Teleport to islands you've");
        lore.add("§7already visited.");
        lore.add("");
        lore.add("§bRight-Click for hub warp!");
        lore.add("§eClick to pick location!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.SKULL_ITEM).setDisplayName("§bFast Travel").setLore(lore).build();
        lore.clear();
        addUiItems(itemStack);
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
        addUiItems(itemStack);
    }

    private static void close() {
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.BARRIER).setDisplayName("§cClose").build();
        addUiItems(itemStack);
    }

    private static void settings() {
        lore.add("§7View and edit your SkyBlock");
        lore.add("§7settings.");
        lore.add("");
        lore.add("§eClick to view!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.REDSTONE_TORCH_ON).setDisplayName("§2Settings").setLore(lore).build();
        lore.clear();
        addUiItems(itemStack);
    }
}
