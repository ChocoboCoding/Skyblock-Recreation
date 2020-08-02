package me.chocobo.skyblockrecreation.utils;

import me.chocobo.skyblockrecreation.dataTypes.*;
import me.chocobo.skyblockrecreation.enums.EnemyType;
import me.chocobo.skyblockrecreation.enums.ItemRarity;
import me.chocobo.skyblockrecreation.enums.Rune;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.*;

public class Startup {
    private static Map<UUID, SkyblockPlayer> players = new HashMap<>();
    private static List<EnemyStats> enemies = new ArrayList<>();
    private static Map<UUID, SkyblockEnemy> livingEnemies = new HashMap<>();
    private static List<String> lore = new ArrayList<>();
    private static List<ItemStack> uiItems = new ArrayList<>();
    private static List<SkyblockItem> skyblockItems = new ArrayList<>();




    public static Map<UUID, SkyblockPlayer> getSkyblockPlayers() {
        return players;
    }
    public static List<EnemyStats> getSkyblockEnemies() {
        return enemies;
    }
    public static List<ItemStack> getUiItems() {
        return uiItems;
    }
    public static SkyblockItem getSkyblockItem(int index) {
        return new SkyblockItem(skyblockItems.get(index));
    }
    public static Map<UUID, SkyblockEnemy> getLivingEnemies() {
        return livingEnemies;
    }

    public static void addSkyblockPlayer(SkyblockPlayer player) {
        players.put(player.getUuid(), player);
    }
    public static void addSkyblockEnemy(EnemyStats enemy) {
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

    public static void caches() {
        menuCache();
        weaponCache();
        enemyCache();
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
    }

    /*
    Material material, String name, List<String> lore, ItemRarity rarity,
    int damage, int strength, int critDamage, int critHit, int attackSpeed, int intelligence
     */

    public static void weaponCache() {
        addSkyblockItems(new SkyblockItem().setMaterial(Material.WOOD_SWORD).setName("Wooden Sword")
                .setItemStats(new ItemStats().setDamage(20)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.GOLD_SWORD).setName("Golden Sword").
                setItemStats(new ItemStats().setDamage(20)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.STONE_SWORD).setName("Stone Sword").
                setItemStats(new ItemStats().setDamage(25)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.IRON_SWORD).setName("Iron Sword").
                setItemStats(new ItemStats().setDamage(30)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.DIAMOND_SWORD).setName("Diamond Sword").
                setItemStats(new ItemStats().setDamage(35)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.WOOD_SWORD).setName("Aspect of the Jerry").
                setItemStats(new ItemStats().setDamage(1)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.IRON_SWORD).setName("Fancy Sword").
                setItemStats(new ItemStats().setDamage(20)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.GOLD_SWORD).setName("Rogue Sword").
                setItemStats(new ItemStats().setDamage(20)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.IRON_SWORD).setName("Spider Sword").
                setItemStats(new ItemStats().setDamage(30)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.IRON_SWORD).setName("Undead Sword").
                setItemStats(new ItemStats().setDamage(30)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.DIAMOND_SWORD).setName("End Sword").setRarity(ItemRarity.UNCOMMON).
                setItemStats(new ItemStats().setDamage(35)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.GOLD_SWORD).setName("Cleaver").setRarity(ItemRarity.UNCOMMON).
                setItemStats(new ItemStats().setDamage(40).setStrength(10)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.IRON_SWORD).setName("Flaming Sword").setRarity(ItemRarity.UNCOMMON).
                setItemStats(new ItemStats().setDamage(50).setStrength(20)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.PRISMARINE_SHARD).setName("Prismarine Blade").setRarity(ItemRarity.UNCOMMON).
                setItemStats(new ItemStats().setDamage(50).setStrength(25)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.IRON_SWORD).setName("Hunter Knife").setRarity(ItemRarity.UNCOMMON).
                setItemStats(new ItemStats().setDamage(50).setMovementSpeed(40)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.WOOD_SWORD).setName("Tactician's Sword").setRarity(ItemRarity.RARE).
                setItemStats(new ItemStats().setDamage(50).setStrength(20)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.BLAZE_ROD).setName("Ember Rod").setRarity(ItemRarity.EPIC).
                setItemStats(new ItemStats().setDamage(80).setStrength(35).setIntelligence(20)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.IRON_HOE).setName("Frozen Scythe").setRarity(ItemRarity.RARE).
                setItemStats(new ItemStats().setDamage(80)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.IRON_SWORD).setName("Golem Sword").setRarity(ItemRarity.RARE).
                setItemStats(new ItemStats().setDamage(80).setStrength(125).setDefense(25)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.IRON_AXE).setName("Raiders Axe").setRarity(ItemRarity.RARE).
                setItemStats(new ItemStats().setDamage(80).setStrength(50)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.DIAMOND_SWORD).setName("Revenant Falchion").setRarity(ItemRarity.RARE).
                setItemStats(new ItemStats().setDamage(90).setStrength(50).setIntelligence(100)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.GHAST_TEAR).setName("Silver Fang").setRarity(ItemRarity.UNCOMMON).
                setItemStats(new ItemStats().setDamage(100)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.IRON_SWORD).setName("Shaman Sword").setRarity(ItemRarity.EPIC).
                setItemStats(new ItemStats().setDamage(100).setStrength(20).setMovementSpeed(5)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.DIAMOND_SWORD).setName("Aspect of the End").setRarity(ItemRarity.RARE).
                setItemStats(new ItemStats().setDamage(100).setStrength(100)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.WOOD_SWORD).setName("Scorpion Foil").setRarity(ItemRarity.EPIC).
                setItemStats(new ItemStats().setDamage(100).setStrength(100)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.IRON_SWORD).setName("Zombie Sword").setRarity(ItemRarity.RARE).
                setItemStats(new ItemStats().setDamage(100).setStrength(50).setIntelligence(50)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.GOLD_SWORD).setName("Ornate Zombie Sword").setRarity(ItemRarity.EPIC).
                setItemStats(new ItemStats().setDamage(110).setStrength(60).setIntelligence(50)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.GOLD_SWORD).setName("End Stone Sword").setRarity(ItemRarity.EPIC).
                setItemStats(new ItemStats().setDamage(120).setStrength(80)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.IRON_SWORD).setName("Recluse Fang").setRarity(ItemRarity.RARE).
                setItemStats(new ItemStats().setDamage(120).setStrength(30).setCritDamage(20)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.DIAMOND_SWORD).setName("Reaper Falchion").setRarity(ItemRarity.EPIC).
                setItemStats(new ItemStats().setDamage(120).setStrength(100).setIntelligence(200)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.GOLD_SWORD).setName("Pooch Sword").setRarity(ItemRarity.LEGENDARY).
                setItemStats(new ItemStats().setDamage(120).setStrength(20).setStrength(5)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.MUTTON).setName("Edible Mace").setRarity(ItemRarity.RARE).
                setItemStats(new ItemStats().setDamage(125).setStrength(25)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.STICK).setName("Ink Wand").setRarity(ItemRarity.EPIC).
                setItemStats(new ItemStats().setDamage(130).setStrength(90)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.EMERALD).setName("Emeral Blade").setRarity(ItemRarity.EPIC).
                setItemStats(new ItemStats().setDamage(130)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.GOLD_SWORD).setName("Midas Sword").setRarity(ItemRarity.LEGENDARY).
                setItemStats(new ItemStats().setDamage(150)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.GOLD_SWORD).setName("Leaping Sword").setRarity(ItemRarity.EPIC).
                setItemStats(new ItemStats().setDamage(150).setStrength(100).setCritDamage(25)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.IRON_SWORD).setName("Yeti Sword").setRarity(ItemRarity.LEGENDARY).
                setItemStats(new ItemStats().setDamage(150).setStrength(150).setIntelligence(50)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.GOLD_SWORD).setName("Silk-Edge Sword").setRarity(ItemRarity.EPIC).
                setItemStats(new ItemStats().setDamage(175).setStrength(125).setCritDamage(25)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.GOLD_SWORD).setName("Pigman Sword").setRarity(ItemRarity.LEGENDARY).
                setItemStats(new ItemStats().setDamage(200).setStrength(100).setCritDamage(30).setCritHit(5)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.DIAMOND_SWORD).setName("Aspect of the Dragons").setRarity(ItemRarity.LEGENDARY).
                setItemStats(new ItemStats().setDamage(225).setStrength(100)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.DIAMOND_HOE).setName("Reaper Scythe").setRarity(ItemRarity.LEGENDARY).
                setItemStats(new ItemStats().setDamage(333).setMovementSpeed(10)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.STONE_SWORD).setName("Adaptive Blade").setRarity(ItemRarity.EPIC).
                setItemStats(new ItemStats().setDamage(170)));
        addSkyblockItems(new SkyblockItem().setMaterial(Material.GOLD_BLOCK).setName("Test Blade").setRarity(ItemRarity.LEGENDARY).
                setItemStats(new ItemStats().setDamage(500).setStrength(500).setCritHit(100).setCritDamage(500).setAttackSpeed(500).setDefense(500).setMovementSpeed(500).setIntelligence(500)).
                setLore("Test lore line 1//Test lore line 2//Test lore line 3").setRune(Rune.BLOOD));
    }

    public static void enemyCache() {
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.ZOMBIE_VILLAGER, new EnemyStats().setLevel(1).setDamage(20).setMaxHp(5)));
        addSkyblockEnemy(new EnemyStats(1, 100, 20, EnemyType.ZOMBIE));
        addSkyblockEnemy(new EnemyStats(1, 2000, 475, EnemyType.ENDERMITE));
        addSkyblockEnemy(new EnemyStats(5, 80, 70, EnemyType.SLIME_SMALL));
        addSkyblockEnemy(new EnemyStats(10, 150, 100, EnemyType.SLIME_MEDIUM));
        addSkyblockEnemy(new EnemyStats(15, 250, 150, EnemyType.SLIME_LARGE));
        addSkyblockEnemy(new EnemyStats(3, 120, 80, EnemyType.CREEPER));
        addSkyblockEnemy(new EnemyStats(7, 200, 50, EnemyType.LAPIS_ZOMBIE));
        addSkyblockEnemy(new EnemyStats(6, 200, 0, EnemyType.SKELETON));
        addSkyblockEnemy(new EnemyStats(20, 300, 190, EnemyType.DIAMOND_SKELETON));
        addSkyblockEnemy(new EnemyStats(15, 250, 142, EnemyType.HARDENED_DIAMOND_SKELETON));
        addSkyblockEnemy(new EnemyStats(20, 300, 275, EnemyType.DIAMOND_ZOMBIE));
        addSkyblockEnemy(new EnemyStats(15, 250, 200, EnemyType.HARDENED_DIAMOND_ZOMBIE));
        addSkyblockEnemy(new EnemyStats(10, 250, 0, EnemyType.ZOMBIE_PIGMAN));
        addSkyblockEnemy(new EnemyStats(2, 180, 0, EnemyType.SPLITTER_SPIDER));
        addSkyblockEnemy(new EnemyStats(4, 220, 0, EnemyType.SPLITTER_SPIDER));
        addSkyblockEnemy(new EnemyStats(4, 170, 55, EnemyType.DASHER_SPIDER));
        addSkyblockEnemy(new EnemyStats(6, 210, 0, EnemyType.DASHER_SPIDER));
        addSkyblockEnemy(new EnemyStats(3, 160, 35, EnemyType.WEAVER_SPIDER));
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.SPIDER_JOCKEY, 3, 220, 55));
        addSkyblockEnemy(new EnemyStats(3, 250, 0, EnemyType.JOCKEY_SKELETON));
        addSkyblockEnemy(new EnemyStats(2, 100, 0, EnemyType.SKELETON));
        addSkyblockEnemy(new EnemyStats(10, 1000, 100, EnemyType.VORACIOUS_SPIDER));
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.BROOD_MOTHER, 12, 6000, 0));
        addSkyblockEnemy(new EnemyStats(1, 50, 20, EnemyType.SILVERFISH));
        addSkyblockEnemy(new EnemyStats(8, 0, 0, EnemyType.SLIME));
        addSkyblockEnemy(new EnemyStats(12, 500, 0, EnemyType.BLAZE));
        addSkyblockEnemy(new EnemyStats(15, 600, 9, EnemyType.BLAZE));
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.WITHER_SKELETON, new EnemyStats().setLevel(10).setMaxHp(250).setDamage(0)));
        addSkyblockEnemy(new EnemyStats(12, 240, 0, EnemyType.ZOMBIE_PIGMAN));
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.CUBE_BOSS, 100, 150000, 0));
        addSkyblockEnemy(new EnemyStats(3, 200, 0, EnemyType.CUBE_SMALL));
        addSkyblockEnemy(new EnemyStats(6, 250, 0, EnemyType.CUBE_MEDIUM));
        addSkyblockEnemy(new EnemyStats(9, 300, 0, EnemyType.CUBE_LARGE));
        addSkyblockEnemy(new EnemyStats(17, 300, 0, EnemyType.GHAST));
        addSkyblockEnemy(new EnemyStats(15, 250, 90, EnemyType.WOLF));
        addSkyblockEnemy(new EnemyStats(55, 15000, 800, EnemyType.OLD_WOLF));
        addSkyblockEnemy(new EnemyStats(55, 1500, 800, EnemyType.ENDERMAN_SMALL));
        addSkyblockEnemy(new EnemyStats(45, 6000, 600, EnemyType.ENDERMAN_MEDIUM));
        addSkyblockEnemy(new EnemyStats(50, 9000, 700, EnemyType.ENDERMAN_LARGE));
        addSkyblockEnemy(new EnemyStats(55, 13000, 1250, EnemyType.ZEALOT));
        addSkyblockEnemy(new EnemyStats(55, 13000, 1250, EnemyType.CHEST_ZEALOT));
        addSkyblockEnemy(new EnemyStats(55, 2000, 1250, EnemyType.SPECIAL_ZEALOT));
        addSkyblockEnemy(new EnemyStats(55, 9500, 475, EnemyType.WATCHER));
        addSkyblockEnemy(new EnemyStats(55, 10000, 0, EnemyType.OBSIDIAN_DEFENDER));
        addSkyblockEnemy(new EnemyStats(40, 2000, 475, EnemyType.ENDERMITE));
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.ENDSTONE_PROTECTOR, 0, 5000000, 0));
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.DRAGON, 0, 7500000, 0));
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.OLD_DRAGON, 0, 12000000, 0));
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.YOUNG_DRAGON, 0, 6000000, 0));
        //addSkyblockEnemy(new SkyblockEnemy(EnemyType.SUPERIOR_DRAGON, 0, 10000000, 0));
        addSkyblockEnemy(new EnemyStats(30, 2000, 350, EnemyType.CRYPT_GHOUL));
        addSkyblockEnemy(new EnemyStats(50, 45000, 800, EnemyType.GOLDEN_GHOUL));
        addSkyblockEnemy(new EnemyStats(30, 6000, 0, EnemyType.PACK_SPIRIT));
        addSkyblockEnemy(new EnemyStats(35, 7000, 500, EnemyType.HOWLING_SPIRIT));
        addSkyblockEnemy(new EnemyStats(55, 31150, 1150, EnemyType.SOUL_OF_THE_ALPHA));
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
