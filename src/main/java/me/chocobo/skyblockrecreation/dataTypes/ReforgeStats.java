package me.chocobo.skyblockrecreation.dataTypes;

import java.util.ArrayList;
import java.util.List;

public class ReforgeStats {

    private final ItemStats commonStats, uncommonStats, rareStats, epicStats, legendaryStats;
    private final List<ItemStats> stats = new ArrayList<>();

    public ReforgeStats(ItemStats commonStats, ItemStats uncommonStats, ItemStats rareStats, ItemStats epicStats, ItemStats legendaryStats) {
        this.commonStats = commonStats;
        this.uncommonStats = uncommonStats;
        this.rareStats = rareStats;
        this.epicStats = epicStats;
        this.legendaryStats = legendaryStats;
        stats.add(commonStats);
        stats.add(uncommonStats);
        stats.add(rareStats);
        stats.add(epicStats);
        stats.add(legendaryStats);
    }

    public List<ItemStats> getStats() {
        return stats;
    }
    public ItemStats getStats(int rarity) {
        return stats.get(rarity);
    }
    public ItemStats getCommonStats() {
        return commonStats;
    }
    public ItemStats getUncommonStats() {
        return uncommonStats;
    }
    public ItemStats getRareStats() {
        return rareStats;
    }
    public ItemStats getEpicStats() {
        return epicStats;
    }
    public ItemStats getLegendaryStats() {
        return legendaryStats;
    }
}
