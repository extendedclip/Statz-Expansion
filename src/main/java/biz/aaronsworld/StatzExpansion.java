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

    private Statz plugin;
    API api;

    @Override
    public boolean canRegister() {
        Statz statz = (Statz) Bukkit.getServer().getPluginManager().getPlugin("Statz");

        if (statz != null) {
            api = statz.getStatzAPI();
        }
        return api != null;
    }


    @Override
    public boolean register() {
        /*
         * Make sure "SomePlugin" is on the server
         */
        if (!canRegister()) {
            return false;
        }

        plugin = (Statz) Bukkit.getPluginManager().getPlugin(getPlugin());

        if (plugin == null) {
            return false;
        }

        return PlaceholderAPI.registerPlaceholderHook(getIdentifier(), this);
    }

    @Override
    public String getAuthor() {
        return "Ironic_8b49";
    }

    @Override
    public String getIdentifier() {
        return "statz";
    }

    @Override
    public String getPlugin() {
        return "Statz";
    }

    @Override
    public String getVersion() {
        return "1.0.3";
    }

    @Override
    public String onPlaceholderRequest(Player player, String identifier) {

        if (player == null) {
            return "";
        }

        switch(identifier) {
            case "joins":
                return String.valueOf(api.getSpecificData(PlayerStat.JOINS, player.getUniqueId()).longValue());
            case "death":
                return String.valueOf(api.getSpecificData(PlayerStat.DEATHS, player.getUniqueId()).longValue());
            case "blocks_broken":
                return String.valueOf(api.getSpecificData(PlayerStat.BLOCKS_BROKEN, player.getUniqueId()).longValue());
            case "blocks_placed":
                return String.valueOf(api.getSpecificData(PlayerStat.BLOCKS_PLACED, player.getUniqueId()).longValue());
            case "damage_taken":
                return String.valueOf(api.getSpecificData(PlayerStat.DAMAGE_TAKEN, player.getUniqueId()).longValue());
            case "distance_traveled":
                return String.valueOf(api.getSpecificData(PlayerStat.DISTANCE_TRAVELLED, player.getUniqueId()).longValue());
            case "food_eaten":
                return String.valueOf(api.getSpecificData(PlayerStat.FOOD_EATEN, player.getUniqueId()).longValue());
            case "crafted_items":
                return String.valueOf(api.getSpecificData(PlayerStat.ITEMS_CRAFTED, player.getUniqueId()).longValue());
            case "caught_items":
                return String.valueOf(api.getSpecificData(PlayerStat.ITEMS_CAUGHT, player.getUniqueId()).longValue());
            case "players_killed":
                return String.valueOf(api.getSpecificData(PlayerStat.KILLS_PLAYERS, player.getUniqueId()).longValue());
            case "time_played":
                return String.valueOf(api.getSpecificData(PlayerStat.TIME_PLAYED, player.getUniqueId()).longValue());
            case "times_shorn":
                return String.valueOf(api.getSpecificData(PlayerStat.TIMES_SHORN, player.getUniqueId()).longValue());
            case "xp_gained":
                return String.valueOf(api.getSpecificData(PlayerStat.XP_GAINED, player.getUniqueId()).longValue());
            case "mobs_killed":
                return String.valueOf(api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId()).longValue());
            case "mobs_killed_bat":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "BAT")).longValue());
            case "mobs_killed_blaze":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "BLAZE")).longValue());
            case "mobs_killed_cave_spider":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "CAVE_SPIDER")).longValue());
            case "mobs_killed_chicken":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "CHICKEN")).longValue());
            case "mobs_killed_cow":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "COW")).longValue());
            case "mobs_killed_creeper":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "CREEPER")).longValue());
            case "mobs_killed_donkey":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "DONKEY")).longValue());
            case "mobs_killed_elder_guardian":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "ELDER_GUARDIAN")).longValue());
            case "mobs_killed_enderman":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "ENDERMAN")).longValue());
            case "mobs_killed_endermite":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "ENDERMITE")).longValue());
            case "mobs_killed_ender_dragon":
                  return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "ENDER_DRAGON")).longValue());
            case "mobs_killed_evoker":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "EVOKER")).longValue());
            case "mobs_killed_ghast":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "GHAST")).longValue());
            case "mobs_killed_giant":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "GIANT")).longValue());
            case "mobs_killed_guardian":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "GUARDIAN")).longValue());
            case "mobs_killed_horse":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "HORSE")).longValue());
            case "mobs_killed_husk":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "HUSK")).longValue());
            case "mobs_killed_iron_golem":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "IRON_GOLEM")).longValue());
            case "mobs_killed_killer_rabbit":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "KILLER RABBIT")).longValue());
            case "mobs_killed_llama":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "LLeweAMA")).longValue());
            case "mobs_killed_magma_cube":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "MAGMA_CUBE")).longValue());
            case "mobs_killed_mule":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "MULE")).longValue());
            case "mobs_killed_mushroom_cow":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "MUSHROOM_COW")).longValue());
            case "mobs_killed_ocelot":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "OCELOT")).longValue());
            case "mobs_killed_parrot":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "PARROT")).longValue());
            case "mobs_killed_pig":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "PIG")).longValue());
            case "mobs_killed_pig_zombie":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "PIG_ZOMBIE")).longValue());
            case "mobs_killed_polar_bear":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "POLAR_BEAR")).longValue());
            case "mobs_killed_powered_creeper":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "POWERED CREEPER")).longValue());
            case "mobs_killed_rabbit":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "RABBIT")).longValue());
            case "mobs_killed_sheep":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "SHEEP")).longValue());
            case "mobs_killed_shulker":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "SHULKER")).longValue());
            case "mobs_killed_silverfish":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "SILVERFISH")).longValue());
            case "mobs_killed_skeleton":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "SKELETON")).longValue());
            case "mobs_killed_skeleton_horse":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "SKELETON_HORSE")).longValue());
            case "mobs_killed_slime":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "SLIME")).longValue());
            case "mobs_killed_snowman":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "SNOWMAN")).longValue());
            case "mobs_killed_spider":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "SPIDER")).longValue());
            case "mobs_killed_spider_jockey":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "SPIDER JOCKEY")).longValue());
            case "mobs_killed_squid":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "SQUID")).longValue());
            case "mobs_killed_stray":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "STRAY")).longValue());
            case "mobs_killed_vex":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "VEX")).longValue());
            case "mobs_killed_villager":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "VILLAGER")).longValue());
            case "mobs_killed_vindicator":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "VINDICATOR")).longValue());
            case "mobs_killed_witch":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "WITCH")).longValue());
            case "mobs_killed_wither_skeleton":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "WITHER_SKELETON")).longValue());
            case "mobs_killed_wolf":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "WOLF")).longValue());
            case "mobs_killed_zombie":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "ZOMBIE")).longValue());
            case "mobs_killed_zombie_villager":
                return String.valueOf(this.api.getSpecificData(PlayerStat.KILLS_MOBS, player.getUniqueId(), new RowRequirement("mob", "ZOMBIE_VILLAGER")).longValue());
        }
        return null;
    }

}