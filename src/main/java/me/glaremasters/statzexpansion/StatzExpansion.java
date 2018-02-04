package me.glaremasters.statzexpansion;

import me.clip.placeholderapi.PlaceholderAPI;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import me.staartvin.statz.Statz;
import me.staartvin.statz.api.API;
import me.staartvin.statz.datamanager.PlayerStat;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 * Created by GlareMasters on 2/3/2018.
 */
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
        return "Blockslayer22";
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
        return "1.0.0";
    }

    @Override
    public String onPlaceholderRequest(Player player, String identifier) {

        if (player == null) {
            return "";
        }

        if (identifier.equals("joins")) {
            return String.valueOf(
                    api.getSpecificData(PlayerStat.JOINS, player.getUniqueId()).longValue());
        }

        if (identifier.equals("deaths")) {
            return String.valueOf(
                    api.getSpecificData(PlayerStat.DEATHS, player.getUniqueId()).longValue());
        }

        if (identifier.equals("blocks_broken")) {
            return String.valueOf(
                    api.getSpecificData(PlayerStat.BLOCKS_BROKEN, player.getUniqueId())
                            .longValue());
        }

        if (identifier.equals("blocks_placed")) {
            return String.valueOf(
                    api.getSpecificData(PlayerStat.BLOCKS_PLACED, player.getUniqueId())
                            .longValue());
        }

        if (identifier.equals("damage_taken")) {
            return String.valueOf(
                    api.getSpecificData(PlayerStat.DAMAGE_TAKEN, player.getUniqueId()).longValue());
        }

        if (identifier.equals("distance_travelled")) {
            return String.valueOf(
                    api.getSpecificData(PlayerStat.DISTANCE_TRAVELLED, player.getUniqueId())
                            .longValue());
        }

        if (identifier.equals("food_eaten")) {
            return String.valueOf(
                    api.getSpecificData(PlayerStat.FOOD_EATEN, player.getUniqueId()).longValue());
        }

        if (identifier.equals("crafted_items")) {
            return String.valueOf(
                    api.getSpecificData(PlayerStat.ITEMS_CRAFTED, player.getUniqueId())
                            .longValue());
        }

        if (identifier.equals("caught_items")) {
            return String.valueOf(
                    api.getSpecificData(PlayerStat.ITEMS_CAUGHT, player.getUniqueId()).longValue());
        }

        if (identifier.equals("players_killed")) {
            return String.valueOf(
                    api.getSpecificData(PlayerStat.KILLS_PLAYERS, player.getUniqueId())
                            .longValue());
        }

        if (identifier.equals("time_played")) {
            return String.valueOf(
                    api.getSpecificData(PlayerStat.TIME_PLAYED, player.getUniqueId()).longValue());
        }

        if (identifier.equals("times_shorn")) {
            return String.valueOf(
                    api.getSpecificData(PlayerStat.TIMES_SHORN, player.getUniqueId()).longValue());
        }

        if (identifier.equals("xp_gained")) {
            return String.valueOf(
                    api.getSpecificData(PlayerStat.XP_GAINED, player.getUniqueId()).longValue());
        }

        if (identifier.equals("votes")) {
            return String.valueOf(
                    api.getSpecificData(PlayerStat.VOTES, player.getUniqueId()).longValue());
        }

        return null;
    }

}
