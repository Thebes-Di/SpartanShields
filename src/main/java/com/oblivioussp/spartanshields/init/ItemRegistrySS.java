package com.oblivioussp.spartanshields.init;

import com.oblivioussp.spartanshields.item.ItemShieldBase;
import com.oblivioussp.spartanshields.item.ItemShieldBasic;
import com.oblivioussp.spartanshields.item.ItemShieldBotania;
import com.oblivioussp.spartanshields.item.ItemShieldElementium;
import com.oblivioussp.spartanshields.item.ItemShieldEnderium;
import com.oblivioussp.spartanshields.item.ItemShieldExtraMaterial;
import com.oblivioussp.spartanshields.item.ItemShieldExtraMod;
import com.oblivioussp.spartanshields.item.ItemShieldLumium;
import com.oblivioussp.spartanshields.item.ItemShieldObsidian;
import com.oblivioussp.spartanshields.item.ItemShieldPoweredFE;
import com.oblivioussp.spartanshields.item.ItemShieldSignalum;
import com.oblivioussp.spartanshields.item.ItemShieldSilver;
import com.oblivioussp.spartanshields.item.ItemShieldVoid;
import com.oblivioussp.spartanshields.util.ConfigHandler;
import com.oblivioussp.spartanshields.util.EnumPowerUnit;
import com.oblivioussp.spartanshields.util.LogHelper;
import com.oblivioussp.spartanshields.util.ModHelper;
import com.oblivioussp.spartanshields.util.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class ItemRegistrySS 
{
	// v1.0
	public static ItemShieldBase shieldWood;
	public static ItemShieldBase shieldStone;
	public static ItemShieldBase shieldIron;
	public static ItemShieldBase shieldGold;
	public static ItemShieldBase shieldDiamond;
	
	// New in v1.1
	public static ItemShieldExtraMaterial shieldBronze;
	public static ItemShieldExtraMaterial shieldSteel;
	
	// New in v1.2
	public static ItemShieldExtraMaterial shieldCopper;
	public static ItemShieldExtraMaterial shieldTin;
	public static ItemShieldExtraMaterial shieldSilver;
	public static ItemShieldBase shieldObsidian;
	
	// New in v1.3
	public static ItemShieldExtraMaterial shieldEnderium;
	public static ItemShieldExtraMaterial shieldInvar;
	public static ItemShieldExtraMaterial shieldPlatinum;
	public static ItemShieldExtraMaterial shieldElectrum;
	public static ItemShieldExtraMaterial shieldNickel;
	public static ItemShieldExtraMaterial shieldLead;
	public static ItemShieldExtraMaterial shieldSignalum;
	public static ItemShieldExtraMaterial shieldLumium;
	
	// New in v1.4
	public static ItemShieldExtraMaterial shieldConstantan;
	
	public static ItemShieldBasic shieldDarkstone;
	public static ItemShieldBasic shieldAbyssalnite;
	public static ItemShieldBasic shieldCoralium;
	public static ItemShieldBasic shieldDreadium;
	public static ItemShieldBasic shieldEthaxium;
	
	public static ItemShieldBasic shieldSoulforgedSteel;
	
	// Botania
	public static ItemShieldBasic shieldManasteel;
	public static ItemShieldBasic shieldTerrasteel;
	public static ItemShieldBasic shieldElementium;
	
	// Thaumcraft
	public static ItemShieldBasic shieldThaumium;
	public static ItemShieldBasic shieldVoid;
	
	// New in 1.1
	public static ItemShieldBase shieldFEEnderIO;
	//public static ItemShieldBase shieldFEActAdd = new ItemShieldPoweredFE("shield_riot_actadd", 1000000, 2048);
	// New in 1.2
	public static ItemShieldBase shieldFERFTools;
	// New in 1.3
	public static ItemShieldBase shieldFERedstoneArsenal;
	
	// New in 1.5
	public static ItemShieldBase shieldTowerWood;
	public static ItemShieldBase shieldTowerStone;
	public static ItemShieldBase shieldTowerIron;
	public static ItemShieldBase shieldTowerGold;
	public static ItemShieldBase shieldTowerDiamond;
	public static ItemShieldBase shieldTowerObsidian;
	
	public static ItemShieldBase shieldTowerBronze;
	public static ItemShieldBase shieldTowerSteel;
	public static ItemShieldBase shieldTowerCopper;
	public static ItemShieldBase shieldTowerTin;
	public static ItemShieldBase shieldTowerSilver;
	public static ItemShieldBase shieldTowerInvar;
	public static ItemShieldBase shieldTowerPlatinum;
	public static ItemShieldBase shieldTowerElectrum;
	public static ItemShieldBase shieldTowerNickel;
	public static ItemShieldBase shieldTowerLead;
	public static ItemShieldBase shieldTowerConstantan;
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> ev)
	{
		IForgeRegistry<Item> reg = ev.getRegistry();
		
		if(!ConfigHandler.disableStandardShields)
		{
			shieldWood = new ItemShieldBasic("shield_basic_wood", Math.round(ConfigHandler.durabilityWoodShield * ConfigHandler.durabilityMultiplierStandardShields), ToolMaterial.WOOD);
			shieldStone = new ItemShieldBasic("shield_basic_stone", Math.round(ConfigHandler.durabilityStoneShield * ConfigHandler.durabilityMultiplierStandardShields), ToolMaterial.STONE);
			shieldIron = new ItemShieldBasic("shield_basic_iron", Math.round(ConfigHandler.durabilityIronShield * ConfigHandler.durabilityMultiplierStandardShields), ToolMaterial.IRON);
			shieldGold = new ItemShieldBasic("shield_basic_gold", Math.round(ConfigHandler.durabilityGoldShield * ConfigHandler.durabilityMultiplierStandardShields), ToolMaterial.GOLD);
			shieldDiamond = new ItemShieldBasic("shield_basic_diamond", Math.round(ConfigHandler.durabilityDiamondShield * ConfigHandler.durabilityMultiplierStandardShields), ToolMaterial.DIAMOND);
			
			reg.registerAll(shieldWood, shieldStone, shieldIron, shieldGold, shieldDiamond);
			if(ConfigHandler.enableObsidianShield)
			{
				shieldObsidian = new ItemShieldObsidian("shield_basic_obsidian", Math.round(ConfigHandler.durabilityObsidianShield * ConfigHandler.durabilityMultiplierStandardShields), ModHelper.materialObsidian);
				reg.register(shieldObsidian);
			}
		}

		if(!ConfigHandler.disableTowerShields)
		{
			shieldTowerWood = new ItemShieldBasic("shield_tower_wood", Math.round(ConfigHandler.durabilityWoodShield * ConfigHandler.durabilityMultiplierTowerShields),ToolMaterial.WOOD);
			shieldTowerWood.setTowerShield(true);
			shieldTowerStone = new ItemShieldBasic("shield_tower_stone", Math.round(ConfigHandler.durabilityStoneShield * ConfigHandler.durabilityMultiplierTowerShields),ToolMaterial.STONE);
			shieldTowerStone.setTowerShield(true);
			shieldTowerIron = new ItemShieldBasic("shield_tower_iron", Math.round(ConfigHandler.durabilityIronShield * ConfigHandler.durabilityMultiplierTowerShields),ToolMaterial.IRON);
			shieldTowerIron.setTowerShield(true);
			shieldTowerGold = new ItemShieldBasic("shield_tower_gold", Math.round(ConfigHandler.durabilityGoldShield * ConfigHandler.durabilityMultiplierTowerShields),ToolMaterial.GOLD);
			shieldTowerGold.setTowerShield(true);
			shieldTowerDiamond = new ItemShieldBasic("shield_tower_diamond", Math.round(ConfigHandler.durabilityDiamondShield * ConfigHandler.durabilityMultiplierTowerShields),ToolMaterial.DIAMOND);
			shieldTowerDiamond.setTowerShield(true);
			
			reg.registerAll(shieldTowerWood, shieldTowerStone, shieldTowerIron, shieldTowerGold, shieldTowerDiamond);
			if(ConfigHandler.enableObsidianShield)
			{
				shieldTowerObsidian = new ItemShieldObsidian("shield_tower_obsidian", Math.round(ConfigHandler.durabilityObsidianShield * ConfigHandler.durabilityMultiplierTowerShields),ModHelper.materialObsidian);
				shieldTowerObsidian.setTowerShield(true);
				reg.register(shieldTowerObsidian);
			}
		}
		
		// Only load the following items if Vanilla Only mode is disabled.
		if(!ConfigHandler.vanillaOnly)
		{
			if(ConfigHandler.enableBronzeShield)
			{
				if(!ConfigHandler.disableStandardShields)
				{
					shieldBronze = new ItemShieldExtraMaterial("shield_basic_bronze", Math.round(ConfigHandler.durabilityBronzeShield * ConfigHandler.durabilityMultiplierStandardShields),ModHelper.materialBronze, "ingotBronze");
					reg.register(shieldBronze);
				}
				if(!ConfigHandler.disableTowerShields)
				{
					shieldTowerBronze = new ItemShieldExtraMaterial("shield_tower_bronze", Math.round(ConfigHandler.durabilityBronzeShield * ConfigHandler.durabilityMultiplierTowerShields),ModHelper.materialBronze, "ingotBronze");
					shieldTowerBronze.setTowerShield(true);
					reg.register(shieldTowerBronze);
				}
			}
			if(ConfigHandler.enableSteelShield)
			{
				if(!ConfigHandler.disableStandardShields)
				{
					shieldSteel = new ItemShieldExtraMaterial("shield_basic_steel", Math.round(ConfigHandler.durabilitySteelShield * ConfigHandler.durabilityMultiplierStandardShields),ModHelper.materialSteel, "ingotSteel");
					reg.register(shieldSteel);
				}
				if(!ConfigHandler.disableTowerShields)
				{
					shieldTowerSteel = new ItemShieldExtraMaterial("shield_tower_steel", Math.round(ConfigHandler.durabilitySteelShield * ConfigHandler.durabilityMultiplierTowerShields),ModHelper.materialSteel, "ingotSteel");
					shieldTowerSteel.setTowerShield(true);
					reg.register(shieldTowerSteel);
				}
			}
			if(ConfigHandler.enableCopperShield)
			{
				if(!ConfigHandler.disableStandardShields)
				{
					shieldCopper = new ItemShieldExtraMaterial("shield_basic_copper", Math.round(ConfigHandler.durabilityCopperShield * ConfigHandler.durabilityMultiplierStandardShields),ModHelper.materialCopper, "ingotCopper");
					reg.register(shieldCopper);
				}
				if(!ConfigHandler.disableTowerShields)
				{
					shieldTowerCopper = new ItemShieldExtraMaterial("shield_tower_copper", Math.round(ConfigHandler.durabilityCopperShield * ConfigHandler.durabilityMultiplierTowerShields),ModHelper.materialCopper, "ingotCopper");
					shieldTowerCopper.setTowerShield(true);
					reg.register(shieldTowerCopper);
				}
			}
			if(ConfigHandler.enableTinShield)
			{
				if(!ConfigHandler.disableStandardShields)
				{
					shieldTin = new ItemShieldExtraMaterial("shield_basic_tin", Math.round(ConfigHandler.durabilityTinShield * ConfigHandler.durabilityMultiplierStandardShields),ModHelper.materialTin, "ingotTin");
					reg.register(shieldTin);
				}
				if(!ConfigHandler.disableTowerShields)
				{
					shieldTowerTin = new ItemShieldExtraMaterial("shield_tower_tin", Math.round(ConfigHandler.durabilityTinShield * ConfigHandler.durabilityMultiplierTowerShields),ModHelper.materialTin, "ingotTin");
					shieldTowerTin.setTowerShield(true);
					reg.register(shieldTowerTin);
				}
			}
			if(ConfigHandler.enableSilverShield)
			{
				if(!ConfigHandler.disableStandardShields)
				{
					shieldSilver = new ItemShieldSilver("shield_basic_silver", Math.round(ConfigHandler.durabilitySilverShield * ConfigHandler.durabilityMultiplierStandardShields),ModHelper.materialSilver, "ingotSilver");
					reg.register(shieldSilver);
				}
				if(!ConfigHandler.disableTowerShields)
				{
					shieldTowerSilver = new ItemShieldSilver("shield_tower_silver", Math.round(ConfigHandler.durabilitySilverShield * ConfigHandler.durabilityMultiplierTowerShields),ModHelper.materialSilver, "ingotSilver");
					shieldTowerSilver.setTowerShield(true);
					reg.register(shieldTowerSilver);
				}
			}
			
			if(ConfigHandler.enableEnderiumShield)
			{
				shieldEnderium = new ItemShieldEnderium("shield_basic_enderium", ConfigHandler.durabilityEnderiumShield, ModHelper.materialEnderium, "ingotEnderium");
				reg.register(shieldEnderium);
			}
			
			if(ConfigHandler.enableInvarShield)
			{
				if(!ConfigHandler.disableStandardShields)
				{
					shieldInvar = new ItemShieldExtraMaterial("shield_basic_invar", Math.round(ConfigHandler.durabilityInvarShield * ConfigHandler.durabilityMultiplierStandardShields),ModHelper.materialInvar, "ingotInvar");
					reg.register(shieldInvar);
				}
				if(!ConfigHandler.disableTowerShields)
				{
					shieldTowerInvar = new ItemShieldExtraMaterial("shield_tower_invar", Math.round(ConfigHandler.durabilityInvarShield * ConfigHandler.durabilityMultiplierTowerShields),ModHelper.materialInvar, "ingotInvar");
					shieldTowerInvar.setTowerShield(true);
					reg.register(shieldTowerInvar);
				}
			}
			if(ConfigHandler.enablePlatinumShield)
			{
				if(!ConfigHandler.disableStandardShields)
				{
					shieldPlatinum = new ItemShieldExtraMaterial("shield_basic_platinum", Math.round(ConfigHandler.durabilityPlatinumShield * ConfigHandler.durabilityMultiplierStandardShields),ModHelper.materialPlatinum, "ingotPlatinum");
					reg.register(shieldPlatinum);
				}
				if(!ConfigHandler.disableTowerShields)
				{
					shieldTowerPlatinum = new ItemShieldExtraMaterial("shield_tower_platinum", Math.round(ConfigHandler.durabilityPlatinumShield * ConfigHandler.durabilityMultiplierTowerShields),ModHelper.materialPlatinum, "ingotPlatinum");
					shieldTowerPlatinum.setTowerShield(true);
					reg.register(shieldTowerPlatinum);
				}
			}
			if(ConfigHandler.enableElectrumShield)
			{
				if(!ConfigHandler.disableStandardShields)
				{
					shieldElectrum = new ItemShieldExtraMaterial("shield_basic_electrum", Math.round(ConfigHandler.durabilityElectrumShield * ConfigHandler.durabilityMultiplierStandardShields),ModHelper.materialElectrum, "ingotElectrum");
					reg.register(shieldElectrum);
				}
				if(!ConfigHandler.disableTowerShields)
				{
					shieldTowerElectrum = new ItemShieldExtraMaterial("shield_tower_electrum", Math.round(ConfigHandler.durabilityElectrumShield * ConfigHandler.durabilityMultiplierTowerShields),ModHelper.materialElectrum, "ingotElectrum");
					shieldTowerElectrum.setTowerShield(true);
					reg.register(shieldTowerElectrum);
				}
			}
			if(ConfigHandler.enableNickelShield)
			{
				if(!ConfigHandler.disableStandardShields)
				{
					shieldNickel = new ItemShieldExtraMaterial("shield_basic_nickel", Math.round(ConfigHandler.durabilityNickelShield * ConfigHandler.durabilityMultiplierStandardShields),ModHelper.materialNickel, "ingotNickel");
					reg.register(shieldNickel);
				}
				if(!ConfigHandler.disableTowerShields)
				{
					shieldTowerNickel = new ItemShieldExtraMaterial("shield_tower_nickel", Math.round(ConfigHandler.durabilityNickelShield * ConfigHandler.durabilityMultiplierTowerShields),ModHelper.materialNickel, "ingotNickel");
					shieldTowerNickel.setTowerShield(true);
					reg.register(shieldTowerNickel);
				}
			}
			if(ConfigHandler.enableLeadShield)
			{
				if(!ConfigHandler.disableStandardShields)
				{
					shieldLead = new ItemShieldExtraMaterial("shield_basic_lead", Math.round(ConfigHandler.durabilityLeadShield * ConfigHandler.durabilityMultiplierStandardShields),ModHelper.materialLead, "ingotLead");
					reg.register(shieldLead);
				}
				if(!ConfigHandler.disableTowerShields)
				{
					shieldTowerLead = new ItemShieldExtraMaterial("shield_tower_lead", Math.round(ConfigHandler.durabilityLeadShield * ConfigHandler.durabilityMultiplierTowerShields),ModHelper.materialLead, "ingotLead");
					shieldTowerLead.setTowerShield(true);
					reg.register(shieldTowerLead);
				}
			}
			
			if(ConfigHandler.enableSignalumShield)
			{
				shieldSignalum = new ItemShieldSignalum("shield_basic_signalum", ConfigHandler.durabilitySignalumShield, ModHelper.materialSignalum, "ingotSignalum");
				reg.register(shieldSignalum);
			}
			if(ConfigHandler.enableLumiumShield)
			{
				shieldLumium = new ItemShieldLumium("shield_basic_lumium", ConfigHandler.durabilityLumiumShield, ModHelper.materialLumium, "ingotLumium");
				reg.register(shieldLumium);
			}
			
			if(ConfigHandler.enableManasteelShield)
			{
				shieldManasteel = new ItemShieldBotania("shield_botania_manasteel", ConfigHandler.durabilityManasteelShield, ModHelper.materialManasteel);
				if(shieldManasteel != null)		reg.register(shieldManasteel);
			}
			if(ConfigHandler.enableTerrasteelShield)
			{
				shieldTerrasteel = new ItemShieldBotania("shield_botania_terrasteel", ConfigHandler.durabilityTerrasteelShield, ModHelper.materialTerrasteel, 100);
				if(shieldTerrasteel != null)	reg.register(shieldTerrasteel);
			}
			if(ConfigHandler.enableElementiumShield)
			{
				shieldElementium = new ItemShieldElementium("shield_botania_elementium", ConfigHandler.durabilityElementiumShield, ModHelper.materialElementium);
				if(shieldElementium != null)	reg.register(shieldElementium);
			}
			
			if(ConfigHandler.enableConstantanShield)
			{
				if(!ConfigHandler.disableStandardShields)
				{
					shieldConstantan = new ItemShieldExtraMaterial("shield_basic_constantan", Math.round(ConfigHandler.durabilityConstantanShield * ConfigHandler.durabilityMultiplierStandardShields),ModHelper.materialConstantan, "ingotConstantan");
					reg.register(shieldConstantan);
				}
				if(!ConfigHandler.disableTowerShields)
				{
					shieldTowerConstantan = new ItemShieldExtraMaterial("shield_tower_constantan", Math.round(ConfigHandler.durabilityConstantanShield * ConfigHandler.durabilityMultiplierTowerShields),ModHelper.materialConstantan, "ingotConstantan");
					shieldTowerConstantan.setTowerShield(true);
					reg.register(shieldTowerConstantan);
				}
			}
			
			if(ConfigHandler.enableDarkstoneShield)
			{
				shieldDarkstone = new ItemShieldExtraMod("shield_abyssalcraft_darkstone", ConfigHandler.durabilityDarkstoneShield, ModHelper.materialDarkstone, "darkstone", Reference.Abyssalcraft_ModID);
				reg.register(shieldDarkstone);
			}
			if(ConfigHandler.enableAbyssalniteShield)
			{
				shieldAbyssalnite = new ItemShieldExtraMod("shield_abyssalcraft_abyssalnite", ConfigHandler.durabilityAbyssalniteShield, ModHelper.materialAbyssalnite, "ingotAbyssalnite", Reference.Abyssalcraft_ModID);
				reg.register(shieldAbyssalnite);
			}
			if(ConfigHandler.enableCoraliumShield)	
			{
				shieldCoralium = new ItemShieldExtraMod("shield_abyssalcraft_coralium", ConfigHandler.durabilityCoraliumShield, ModHelper.materialCoralium, "ingotCoralium", Reference.Abyssalcraft_ModID);
				reg.register(shieldCoralium);
			}
			if(ConfigHandler.enableDreadiumShield)	
			{
				shieldDreadium = new ItemShieldExtraMod("shield_abyssalcraft_dreadium", ConfigHandler.durabilityDreadiumShield, ModHelper.materialDreadium, "ingotDreadium", Reference.Abyssalcraft_ModID);
				reg.register(shieldDreadium);
			}
			if(ConfigHandler.enableEthaxiumShield)	
			{
				shieldEthaxium = new ItemShieldExtraMod("shield_abyssalcraft_ethaxium", ConfigHandler.durabilityEthaxiumShield, ModHelper.materialEthaxium, "ingotEthaxium", Reference.Abyssalcraft_ModID);
				reg.register(shieldEthaxium);
			}
			
			if(ConfigHandler.enableSoulforgedSteelShield)
			{
				shieldSoulforgedSteel = new ItemShieldExtraMod("shield_basic_soulforged_steel", ConfigHandler.durabilitySoulforgedSteelShield, ModHelper.materialSoulforgedSteel, "ingotSoulforgedSteel", Reference.BWM_ModID);
				reg.register(shieldSoulforgedSteel);
			}
			
			if(ConfigHandler.enableThaumiumShield)
			{
				shieldThaumium = new ItemShieldExtraMod("shield_tc_thaumium", ConfigHandler.durabilityThaumiumShield, ModHelper.materialThaumium, "ingotThaumium", Reference.Thaumcraft_ModID);
				reg.register(shieldThaumium);
			}
			if(ConfigHandler.enableVoidShield)
			{
				shieldVoid = new ItemShieldVoid("shield_tc_void", ConfigHandler.durabilityVoidShield, ModHelper.materialVoid, "ingotVoid", Reference.Thaumcraft_ModID);
				if(shieldVoid != null)	reg.register(shieldVoid);
			}
			
			if(ConfigHandler.enableEnderIOShield)
			{
				shieldFEEnderIO = new ItemShieldPoweredFE("shield_riot_enderio", 1000000, 2048, Reference.EnderIO_ModID, EnumPowerUnit.MicroInfinity);
				reg.register(shieldFEEnderIO);
			}
			if(ConfigHandler.enableRFToolsShield)
			{
				shieldFERFTools = new ItemShieldPoweredFE("shield_riot_rftools", 1000000, 2048, Reference.RFTools_ModID, EnumPowerUnit.RedstoneFlux);
				reg.register(shieldFERFTools);
			}
			if(ConfigHandler.enableRAShield)
			{
				shieldFERedstoneArsenal = new ItemShieldPoweredFE("shield_flux_ra", 1000000, 2048, Reference.RedstoneArsenal_ModID, EnumPowerUnit.RedstoneFlux);
				reg.register(shieldFERedstoneArsenal);
			}
		}
		LogHelper.info("Items Registered!");
	}
	
	@Optional.Method(modid=Reference.Botania_ModID)
	public static void initBotaniaShields()
	{
		/**
		 * Unavailable (for now until Botania gets a 1.12 release)
		 */
		/*
		shieldManasteel = shieldManasteel.setToolMaterial(BotaniaAPI.manasteelToolMaterial);
		shieldTerrasteel = shieldTerrasteel.setToolMaterial(BotaniaAPI.terrasteelToolMaterial);
		shieldElementium = shieldElementium.setToolMaterial(BotaniaAPI.elementiumToolMaterial);
		*/
	}
}
