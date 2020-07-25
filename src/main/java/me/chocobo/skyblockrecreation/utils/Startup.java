package me.chocobo.skyblockrecreation.utils;

import me.chocobo.skyblockrecreation.dataTypes.*;
import me.chocobo.skyblockrecreation.enums.EnemyType;
import me.chocobo.skyblockrecreation.enums.ItemRarity;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.*;

public class Startup {
    private static Map<UUID, SkyblockPlayer> players = new HashMap<>();
    private static List<SkyblockEnemy> enemies = new ArrayList<>();
    private static Map<UUID, SkyblockEnemy> livingEnemies = new HashMap<>();
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
    public static Map<UUID, SkyblockEnemy> getLivingEnemies() {
        return livingEnemies;
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
    public static void addLivingEnemy(UUID enemy, SkyblockEnemy skyblockEnemy) {
        livingEnemies.put(enemy, skyblockEnemy);
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
        addSkyblockItems(new SkyblockWeapon(Material.WOOD_SWORD,"Wooden Sword", "", ItemRarity.COMMON,
                new ItemStats().setDamage(20)));
        addSkyblockItems(new SkyblockWeapon(Material.GOLD_SWORD, "Golden Sword", "", ItemRarity.COMMON,
                new ItemStats().setDamage(20)));
        addSkyblockItems(new SkyblockWeapon(Material.STONE_SWORD, "Stone Sword", "", ItemRarity.COMMON,
                new ItemStats().setDamage(25)));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "IRON Sword", "", ItemRarity.COMMON,
                new ItemStats().setDamage(30)));
        addSkyblockItems(new SkyblockWeapon(Material.DIAMOND_SWORD, "Diamond Sword", "", ItemRarity.UNCOMMON,
                new ItemStats().setDamage(35)));
        addSkyblockItems(new SkyblockWeapon(Material.WOOD_SWORD, "Aspect of the Jerry","", ItemRarity.COMMON,
                new ItemStats().setDamage(1)));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "Fancy Sword", "", ItemRarity.COMMON,
                new ItemStats().setDamage(20)));
        addSkyblockItems(new SkyblockWeapon(Material.GOLD_SWORD, "Rogue Sword", "", ItemRarity.COMMON,
                new ItemStats().setDamage(20)));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "Spider Sword", "", ItemRarity.COMMON,
                new ItemStats().setDamage(30)));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "Undead Sword", "", ItemRarity.COMMON,
                new ItemStats().setDamage(30)));
        addSkyblockItems(new SkyblockWeapon(Material.DIAMOND_SWORD, "End Sword", "", ItemRarity.UNCOMMON,
                new ItemStats().setDamage(35)));
        addSkyblockItems(new SkyblockWeapon(Material.GOLD_SWORD, "Cleaver", "", ItemRarity.UNCOMMON,
                new ItemStats().setDamage(40).setStrength(10)));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "Flaming Sword", "", ItemRarity.UNCOMMON,
                new ItemStats().setDamage(50).setStrength(20)));
        addSkyblockItems(new SkyblockWeapon(Material.PRISMARINE_SHARD, "Prismarine Blade", "", ItemRarity.UNCOMMON,
                new ItemStats().setDamage(50).setStrength(25)));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "Hunter Knife", "", ItemRarity.UNCOMMON,
                new ItemStats().setDamage(50).setMovementSpeed(40)));
        addSkyblockItems(new SkyblockWeapon(Material.WOOD_SWORD, "Tactician's Sword", "", ItemRarity.RARE,
                new ItemStats().setDamage(50).setStrength(20)));
        addSkyblockItems(new SkyblockWeapon(Material.BLAZE_ROD, "Ember Rod", "", ItemRarity.EPIC,
                new ItemStats().setDamage(80).setStrength(35).setIntelligence(20)));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_HOE, "Frozen Scythe", "", ItemRarity.RARE,
                new ItemStats().setDamage(80)));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "Golem Sword", "", ItemRarity.RARE,
                new ItemStats().setDamage(80).setStrength(125).setDefense(25)));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_AXE, "Raiders Axe", "", ItemRarity.RARE,
                new ItemStats().setDamage(80).setStrength(50)));
        addSkyblockItems(new SkyblockWeapon(Material.DIAMOND_SWORD, "Revenant Falchion", "", ItemRarity.RARE,
                new ItemStats().setDamage(90).setStrength(50).setIntelligence(100)));
        addSkyblockItems(new SkyblockWeapon(Material.GHAST_TEAR, "Silver Fang", "", ItemRarity.UNCOMMON,
                new ItemStats().setDamage(100)));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "Shaman Sword", "", ItemRarity.EPIC,
                new ItemStats().setDamage(100).setStrength(20).setMovementSpeed(5)));
        addSkyblockItems(new SkyblockWeapon(Material.DIAMOND_SWORD, "Aspect of the End", "", ItemRarity.RARE,
                new ItemStats().setDamage(100).setStrength(100)));
        addSkyblockItems(new SkyblockWeapon(Material.WOOD_SWORD, "Scorpion Foil", "", ItemRarity.EPIC,
                new ItemStats().setDamage(100).setStrength(100)));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "Zombie Sword", "", ItemRarity.RARE,
                new ItemStats().setDamage(100).setStrength(50).setIntelligence(50)));
        addSkyblockItems(new SkyblockWeapon(Material.GOLD_SWORD, "Ornate Zombie Sword", "", ItemRarity.EPIC,
                new ItemStats().setDamage(110).setStrength(60).setIntelligence(50)));
        addSkyblockItems(new SkyblockWeapon(Material.GOLD_SWORD, "End Stone Sword", "", ItemRarity.EPIC,
                new ItemStats().setDamage(120).setStrength(80)));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "Recluse Fang", "", ItemRarity.RARE,
                new ItemStats().setDamage(120).setStrength(30).setCritDamage(20)));
        addSkyblockItems(new SkyblockWeapon(Material.DIAMOND_SWORD, "Reaper Falchion", "", ItemRarity.EPIC,
                new ItemStats().setDamage(120).setStrength(100).setIntelligence(200)));
        addSkyblockItems(new SkyblockWeapon(Material.GOLD_SWORD, "Pooch Sword", "", ItemRarity.LEGENDARY,
                new ItemStats().setDamage(120).setStrength(20).setMovementSpeed(5)));
        addSkyblockItems(new SkyblockWeapon(Material.MUTTON, "Edible Mace", "", ItemRarity.RARE,
                new ItemStats().setDamage(125).setStrength(25)));
        addSkyblockItems(new SkyblockWeapon(Material.STICK, "Ink Wand", "", ItemRarity.EPIC,
                new ItemStats().setDamage(130).setStrength(90)));
        addSkyblockItems(new SkyblockWeapon(Material.EMERALD, "Emerald Blade", "", ItemRarity.EPIC,
                new ItemStats().setDamage(130)));
        addSkyblockItems(new SkyblockWeapon(Material.GOLD_SWORD, "Midas Sword", "", ItemRarity.LEGENDARY,
                new ItemStats().setDamage(150)));
        addSkyblockItems(new SkyblockWeapon(Material.GOLD_SWORD, "Leaping Sword", "", ItemRarity.EPIC,
                new ItemStats().setDamage(150).setStrength(100).setCritDamage(25)));
        addSkyblockItems(new SkyblockWeapon(Material.IRON_SWORD, "Yeti Sword", "", ItemRarity.LEGENDARY,
                new ItemStats().setDamage(150).setStrength(150).setIntelligence(50)));
        addSkyblockItems(new SkyblockWeapon(Material.GOLD_SWORD, "Silk-Edge Sword", "", ItemRarity.EPIC,
                new ItemStats().setDamage(175).setStrength(125).setCritDamage(25)));
        addSkyblockItems(new SkyblockWeapon(Material.GOLD_SWORD, "Pigman Sword", "", ItemRarity.LEGENDARY,
                new ItemStats().setDamage(200).setStrength(100).setCritDamage(30).setCritHit(5)));
        addSkyblockItems(new SkyblockWeapon(Material.DIAMOND_SWORD, "Aspect of the Dragons", "", ItemRarity.LEGENDARY,
                new ItemStats().setDamage(225).setStrength(100)));
        addSkyblockItems(new SkyblockWeapon(Material.DIAMOND_HOE, "Reaper Scythe", "", ItemRarity.LEGENDARY,
                new ItemStats().setDamage(333).setMovementSpeed(10)));
        addSkyblockItems(new SkyblockWeapon(Material.STONE_SWORD, "Adaptive Blade", "", ItemRarity.EPIC,
                new ItemStats().setDamage(170)));
    }

    public static void enemyCache() {
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.ZOMBIE_VILLAGER, new EnemyStats().setLevel(1).setDamage(20).setMaxHp(5)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.ZOMBIE, new EnemyStats().setLevel(1).setMaxHp(100).setDamage(20)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.ENDERMITE, new EnemyStats().setLevel(1).setMaxHp(2000).setDamage(475)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SLIME_SMALL, new EnemyStats().setLevel(5).setMaxHp(80).setDamage(70)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SLIME_MEDIUM, new EnemyStats().setLevel(10).setMaxHp(150).setDamage(100)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SLIME_LARGE, new EnemyStats().setLevel(15).setMaxHp(250).setDamage(150)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.CREEPER, new EnemyStats().setLevel(3).setMaxHp(120).setDamage(80)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.LAPIS_ZOMBIE, new EnemyStats().setLevel(7).setMaxHp(200).setDamage(50)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SKELETON, new EnemyStats().setLevel(6).setMaxHp(200).setDamage(0)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.DIAMOND_SKELETON, new EnemyStats().setLevel(20).setMaxHp(300).setDamage(190)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.HARDENED_DIAMOND_SKELETON, new EnemyStats().setLevel(15).setMaxHp(250).setDamage(142)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.DIAMOND_ZOMBIE, new EnemyStats().setLevel(20).setMaxHp(300).setDamage(275)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.HARDENED_DIAMOND_ZOMBIE, new EnemyStats().setLevel(15).setMaxHp(250).setDamage(200)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.ZOMBIE_PIGMAN, new EnemyStats().setLevel(10).setMaxHp(250).setDamage(0)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SPLITTER_SPIDER, new EnemyStats().setLevel(2).setMaxHp(180).setDamage(0)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SPLITTER_SPIDER, new EnemyStats().setLevel(4).setMaxHp(220).setDamage(0)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.DASHER_SPIDER, new EnemyStats().setLevel(4).setMaxHp(170).setDamage(55)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.DASHER_SPIDER, new EnemyStats().setLevel(6).setMaxHp(210).setDamage(0)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.WEAVER_SPIDER, new EnemyStats().setLevel(3).setMaxHp(160).setDamage(35)));
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.SPIDER_JOCKEY, 3, 220, 55));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.JOCKEY_SKELETON, new EnemyStats().setLevel(3).setMaxHp(250).setDamage(0)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SKELETON, new EnemyStats().setLevel(2).setMaxHp(100).setDamage(0)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.VORACIOUS_SPIDER, new EnemyStats().setLevel(10).setMaxHp(1000).setDamage(100)));
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.BROOD_MOTHER, 12, 6000, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SILVERFISH, new EnemyStats().setLevel(1).setMaxHp(50).setDamage(20)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SLIME, new EnemyStats().setLevel(8).setMaxHp(0).setDamage(0)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.BLAZE, new EnemyStats().setLevel(12).setMaxHp(500).setDamage(0)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.BLAZE, new EnemyStats().setLevel(15).setMaxHp(600).setDamage(9)));
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.WITHER_SKELETON, new EnemyStats().setLevel(10).setMaxHp(250).setDamage(0)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.ZOMBIE_PIGMAN, new EnemyStats().setLevel(12).setMaxHp(240).setDamage(0)));
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.CUBE_BOSS, 100, 150000, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.CUBE_SMALL, new EnemyStats().setLevel(3).setMaxHp(200).setDamage(0)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.CUBE_MEDIUM, new EnemyStats().setLevel(6).setMaxHp(250).setDamage(0)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.CUBE_LARGE, new EnemyStats().setLevel(9).setMaxHp(300).setDamage(0)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.GHAST, new EnemyStats().setLevel(17).setMaxHp(330).setDamage(0)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.WOLF, new EnemyStats().setLevel(15).setMaxHp(250).setDamage(90)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.OLD_WOLF, new EnemyStats().setLevel(55).setMaxHp(15000).setDamage(800)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.ENDERMAN_SMALL, new EnemyStats().setLevel(55).setMaxHp(1500).setDamage(800)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.ENDERMAN_MEDIUM, new EnemyStats().setLevel(45).setMaxHp(6000).setDamage(600)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.ENDERMAN_LARGE, new EnemyStats().setLevel(50).setMaxHp(9000).setDamage(700)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.ZEALOT, new EnemyStats().setLevel(55).setMaxHp(13000).setDamage(1250)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.CHEST_ZEALOT,new EnemyStats().setLevel(55).setMaxHp(13000).setDamage(1250)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SPECIAL_ZEALOT, new EnemyStats().setLevel(55).setMaxHp(2000).setDamage(1250)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.WATCHER, new EnemyStats().setLevel(55).setMaxHp(9500).setDamage(475)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.OBSIDIAN_DEFENDER, new EnemyStats().setLevel(55).setMaxHp(10000).setDamage(0)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.ENDERMITE, new EnemyStats().setLevel(40).setMaxHp(2000).setDamage(475)));
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.ENDSTONE_PROTECTOR, 0, 5000000, 0));
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.DRAGON, 0, 7500000, 0));
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.OLD_DRAGON, 0, 12000000, 0));
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.YOUNG_DRAGON, 0, 6000000, 0));
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.SUPERIOR_DRAGON, 0, 10000000, 0));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.CRYPT_GHOUL, new EnemyStats().setLevel(30).setMaxHp(2000).setDamage(350)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.GOLDEN_GHOUL, new EnemyStats().setLevel(50).setMaxHp(45000).setDamage(800)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.PACK_SPIRIT, new EnemyStats().setLevel(30).setMaxHp(6000).setDamage(0)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.HOWLING_SPIRIT, new EnemyStats().setLevel(35).setMaxHp(7000).setDamage(500)));
        addSkyblockEnemy(new SkyblockEnemy(EnemyType.SOUL_OF_THE_ALPHA, new EnemyStats().setLevel(55).setMaxHp(31150).setDamage(1150)));
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.HEADLESS_HORSEMAN, 100, 3000000, 0));


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
        lore.add("§7View and edit your SkyBlock//§eClick to view!// //§eClick to view!//");
        lore.add("§7settings.");
        lore.add("");
        lore.add("§eClick to view!");
        ItemStack itemStack = new ItemBuilder().setMaterial(Material.REDSTONE_TORCH_ON).setDisplayName("§2Settings").setLore(lore).build();
        lore.clear();
        addUiItems(itemStack);
    }
}
