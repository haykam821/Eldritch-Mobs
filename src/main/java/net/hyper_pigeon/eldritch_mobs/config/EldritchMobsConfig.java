package net.hyper_pigeon.eldritch_mobs.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;
import me.sargunvohra.mcmods.autoconfig1u.shadowed.blue.endless.jankson.Comment;
import net.hyper_pigeon.eldritch_mobs.mod_components.modifiers.ModifierComponent;

@Config(name = "eldritch_mobs")
public class EldritchMobsConfig implements ConfigData {

    @Comment("Enable Water Creatures with Eldritch Modifiers")
    public boolean toggleEldritchWaterCreatures = false;
    @Comment("Enable Boss Mobs with Eldritch Modifiers")
    public boolean toggleEldritchBossMobs = false;
    @Comment("Turn off custom names")
    public boolean turnOffNames = false;

    @Comment("Out of 100 Mobs")
    public int EliteSpawnRates = 10;

    @Comment("Out of 100 Elites")
    public int UltraSpawnRates = 10;

    @Comment("Out of 100 Ultras")
    public int EldritchSpawnRates = 10;

    @ConfigEntry.Gui.CollapsibleObject
    public DisableModifiers disableModifiers = new DisableModifiers();

    public static class DisableModifiers {
        public boolean disableAlchemist = false;
        public boolean disableBeserk = false;
        public boolean disableYeeter = false;
        public boolean disableBlinding = false;
        public boolean disableBurning = false;
        public boolean disableCloaked = false;
        public boolean disableDeflector = false;
        public  boolean disableDraining = false;
        public  boolean disableDrowning = false;
        public  boolean disableEnder = false;
        public  boolean disableGhastly = false;
        public  boolean disableGravity = false;
        public  boolean disableLethargic = false;
        public  boolean disableLifesteal = false;
        public  boolean disableOneUp = false;
        public  boolean disableRegen = false;
        public  boolean disableResistant = false;
        public  boolean disableRust = false;
        public  boolean disableSnatcher = false;
        public  boolean disableSpeedster = false;
        public  boolean disableSprinter = false;
        public  boolean disableStarving = false;
        public  boolean disableStormy = false;
        public  boolean disableThorny = false;
        public  boolean disableToxic = false;
        public  boolean disableWeakness = false;
        public  boolean disableWebslinging = false;
        public  boolean disableWithering = false;
        public  boolean disableSniper = false;
    }

    public void removeMods(){
        if(disableModifiers.disableAlchemist){
            ModifierComponent.all_mods.remove("alchemist");
        }
        if(disableModifiers.disableBeserk){
            ModifierComponent.all_mods.remove("beserk");
        }
        if(disableModifiers.disableYeeter){
            ModifierComponent.all_mods.remove("yeeter");
        }
        if(disableModifiers.disableBlinding){
            ModifierComponent.all_mods.remove("blinding");
        }
        if(disableModifiers.disableBurning){
            ModifierComponent.all_mods.remove("burning");
        }
        if(disableModifiers.disableCloaked){
            ModifierComponent.all_mods.remove("cloaked");
        }
        if(disableModifiers.disableDeflector){
            ModifierComponent.all_mods.remove("deflector");
        }
        if(disableModifiers.disableDraining){
            ModifierComponent.all_mods.remove("draining");
        }
        if(disableModifiers.disableDrowning){
            ModifierComponent.all_mods.remove("drowning");
        }
        if(disableModifiers.disableEnder){
            ModifierComponent.all_mods.remove("ender");
        }
        if(disableModifiers.disableGhastly){
            ModifierComponent.all_mods.remove("ghastly");
        }
        if(disableModifiers.disableGravity){
            ModifierComponent.all_mods.remove("gravity");
        }
        if(disableModifiers.disableLethargic){
            ModifierComponent.all_mods.remove("lethargic");
        }
        if(disableModifiers.disableLifesteal){
            ModifierComponent.all_mods.remove("lifesteal");
        }
        if(disableModifiers.disableOneUp){
            ModifierComponent.all_mods.remove("one_up");
        }
        if(disableModifiers.disableRegen){
            ModifierComponent.all_mods.remove("regen");
        }
        if(disableModifiers.disableResistant){
            ModifierComponent.all_mods.remove("resistant");
        }
        if(disableModifiers.disableRust){
            ModifierComponent.all_mods.remove("rust");
        }
        if(disableModifiers.disableSnatcher){
            ModifierComponent.all_mods.remove("snatcher");
        }
        if(disableModifiers.disableSpeedster){
            ModifierComponent.all_mods.remove("speedster");
        }
        if(disableModifiers.disableSprinter){
            ModifierComponent.all_mods.remove("sprinter");
        }
        if(disableModifiers.disableStarving){
            ModifierComponent.all_mods.remove("starving");
        }
        if(disableModifiers.disableStormy){
            ModifierComponent.all_mods.remove("stormy");
        }
        if(disableModifiers.disableThorny){
            ModifierComponent.all_mods.remove("thorny");
        }
        if(disableModifiers.disableToxic){
            ModifierComponent.all_mods.remove("toxic");
        }
        if(disableModifiers.disableWeakness){
            ModifierComponent.all_mods.remove("weakness");
        }
        if(disableModifiers.disableWebslinging){
            ModifierComponent.all_mods.remove("webslinging");
        }
        if(disableModifiers.disableWithering){
            ModifierComponent.all_mods.remove("withering");
        }
        if(disableModifiers.disableSniper){
            ModifierComponent.all_mods.remove("sniper");
        }
    }



}
