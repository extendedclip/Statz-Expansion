package biz.aaronsworld;

import me.clip.placeholderapi.PlaceholderAPI;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import me.staartvin.statz.Statz;
import me.staartvin.statz.api.API;
import me.staartvin.statz.database.datatype.RowRequirement;
import me.staartvin.statz.datamanager.PlayerStat;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class StatzExpansion extends PlaceholderExpansion {
    private API api;

    public boolean canRegister() {
        Statz statz = (Statz)Bukkit.getServer().getPluginManager().getPlugin("Statz");
        if (statz != null) {
            this.api = statz.getStatzAPI();
        }

        return this.api != null;
    }

    public boolean register() {
        if (!this.canRegister()) {
            return false;
        } else {
            Statz plugin = (Statz) Bukkit.getPluginManager().getPlugin(this.getPlugin());
            return plugin != null && PlaceholderAPI.registerPlaceholderHook(this.getIdentifier(), this);
        }
    }

    public String getAuthor() {
        return "Blockslayer22 & Ironic_8b49";
    }

    public String getIdentifier() {
        return "statz";
    }

    public String getPlugin() {
        return "Statz";
    }

    public String getVersion() {
        return "1.0.2";
    }

    public String onPlaceholderRequest(Player player, String identifier) {
        if (player == null) {
            return "";
        } else if (identifier.equals("joins")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.JOINS, player.getUniqueId()).longValue());
        } else if (identifier.equals("deaths")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.DEATHS, player.getUniqueId()).longValue());
        } else if (identifier.equals("blocks_broken")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.BLOCKS_BROKEN, player.getUniqueId()).longValue());
        } else if (identifier.equals("blocks_placed")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.BLOCKS_PLACED, player.getUniqueId()).longValue());
        } else if (identifier.equals("damage_taken")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.DAMAGE_TAKEN, player.getUniqueId()).longValue());
        } else if (identifier.equals("distance_traveled")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.DISTANCE_TRAVELLED, player.getUniqueId()).longValue());
        } else if (identifier.equals("food_eaten")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.FOOD_EATEN, player.getUniqueId()).longValue());
        } else if (identifier.equals("crafted_items")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.ITEMS_CRAFTED, player.getUniqueId()).longValue());
        } else if (identifier.equals("kills_mobs")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId()).longValue());
        } else if (identifier.equals("kills_mobs_bat")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "BAT")).longValue());
        } else if (identifier.equals("kills_mobs_blaze")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "BLAZE")).longValue());
        } else if (identifier.equals("kills_mobs_cave_spider")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "CAVE_SPIDER")).longValue());
        } else if (identifier.equals("kills_mobs_chicken")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "CHICKEN")).longValue());
        } else if (identifier.equals("kills_mobs_cow")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "COW")).longValue());
        } else if (identifier.equals("kills_mobs_creeper")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "CREEPER")).longValue());
        } else if (identifier.equals("kills_mobs_donkey")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "DONKEY")).longValue());
        } else if (identifier.equals("kills_mobs_elder_guardian")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "ELDER_GUARDIAN")).longValue());
        } else if (identifier.equals("kills_mobs_enderman")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "ENDERMAN")).longValue());
        } else if (identifier.equals("kills_mobs_endermite")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "ENDERMITE")).longValue());
        } else if (identifier.equals("kills_mobs_ender_dragon")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "ENDER_DRAGON")).longValue());
        } else if (identifier.equals("kills_mobs_evoker")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "EVOKER")).longValue());
        } else if (identifier.equals("kills_mobs_ghast")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "GHAST")).longValue());
        } else if (identifier.equals("kills_mobs_giant")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "GIANT")).longValue());
        } else if (identifier.equals("kills_mobs_guardian")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "GUARDIAN")).longValue());
        } else if (identifier.equals("kills_mobs_horse")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "HORSE")).longValue());
        } else if (identifier.equals("kills_mobs_husk")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "HUSK")).longValue());
        } else if (identifier.equals("kills_mobs_iron_golem")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "IRON_GOLEM")).longValue());
        } else if (identifier.equals("kills_mobs_killer_rabbit")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "KILLER RABBIT")).longValue());
        } else if (identifier.equals("kills_mobs_llama")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "LLeweAMA")).longValue());
        } else if (identifier.equals("kills_mobs_magma_cube")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "MAGMA_CUBE")).longValue());
        } else if (identifier.equals("kills_mobs_mule")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "MULE")).longValue());
        } else if (identifier.equals("kills_mobs_mushroom_cow")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "MUSHROOM_COW")).longValue());
        } else if (identifier.equals("kills_mobs_ocelot")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "OCELOT")).longValue());
        } else if (identifier.equals("kills_mobs_parrot")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "PARROT")).longValue());
        } else if (identifier.equals("kills_mobs_pig")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "PIG")).longValue());
        } else if (identifier.equals("kills_mobs_pig_zombie")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "PIG_ZOMBIE")).longValue());
        } else if (identifier.equals("kills_mobs_polar_bear")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "POLAR_BEAR")).longValue());
        } else if (identifier.equals("kills_mobs_powered_creeper")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "POWERED CREEPER")).longValue());
        } else if (identifier.equals("kills_mobs_rabbit")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "RABBIT")).longValue());
        } else if (identifier.equals("kills_mobs_sheep")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "SHEEP")).longValue());
        } else if (identifier.equals("kills_mobs_shulker")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "SHULKER")).longValue());
        } else if (identifier.equals("kills_mobs_silverfish")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "SILVERFISH")).longValue());
        } else if (identifier.equals("kills_mobs_skeleton")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "SKELETON")).longValue());
        } else if (identifier.equals("kills_mobs_skeleton_horse")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "SKELETON_HORSE")).longValue());
        } else if (identifier.equals("kills_mobs_slime")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "SLIME")).longValue());
        } else if (identifier.equals("kills_mobs_snowman")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "SNOWMAN")).longValue());
        } else if (identifier.equals("kills_mobs_spider")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "SPIDER")).longValue());
        } else if (identifier.equals("kills_mobs_spider_jockey")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "SPIDER JOCKEY")).longValue());
        } else if (identifier.equals("kills_mobs_squid")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "SQUID")).longValue());
        } else if (identifier.equals("kills_mobs_stray")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "STRAY")).longValue());
        } else if (identifier.equals("kills_mobs_vex")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "VEX")).longValue());
        } else if (identifier.equals("kills_mobs_villager")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "VILLAGER")).longValue());
        } else if (identifier.equals("kills_mobs_vindicator")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "VINDICATOR")).longValue());
        } else if (identifier.equals("kills_mobs_witch")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "WITCH")).longValue());
        } else if (identifier.equals("kills_mobs_wither_skeleton")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "WITHER_SKELETON")).longValue());
        } else if (identifier.equals("kills_mobs_wolf")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "WOLF")).longValue());
        } else if (identifier.equals("kills_mobs_zombie")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "ZOMBIE")).longValue());
        } else if (identifier.equals("kills_mobs_zombie_villager")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "ZOMBIE_VILLAGER")).longValue());
        } else if (identifier.equals("caught_items")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.ITEMS_CAUGHT, player.getUniqueId()).longValue());
        } else if (identifier.equals("players_killed")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_PLAYERS, player.getUniqueId()).longValue());
        } else if (identifier.equals("time_played")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.TIME_PLAYED, player.getUniqueId()).longValue());
        } else if (identifier.equals("times_shorn")) {
            return String.valueOf(this.api.getSpecificData(PlayerStat.TIMES_SHORN, player.getUniqueId()).longValue());
        } else {
            return identifier.equals("xp_gained") ? String.valueOf(this.api.getSpecificData(PlayerStat.XP_GAINED, player.getUniqueId()).longValue()) : null;
        }
    }
}
