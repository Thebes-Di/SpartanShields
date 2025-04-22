package com.oblivioussp.spartanshields.enchantment;

import com.oblivioussp.spartanshields.item.ItemShieldBase;

import com.oblivioussp.spartanshields.util.ConfigHandler;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.common.util.EnumHelper;

public abstract class EnchantmentSS extends Enchantment 
{
	public static final EnumEnchantmentType TYPE_SHIELD = EnumHelper.addEnchantmentType("ss_shield", item -> {
		if (item instanceof ItemShieldBase) {
			ItemShieldBase shield = (ItemShieldBase) item;
			return !(shield.isTowerShield() && ConfigHandler.disableTowerShieldBashOnly);
		}
		return false;
	});
	
	protected EnchantmentSS(Rarity rarityIn, EnumEnchantmentType typeIn, EntityEquipmentSlot[] slots) 
	{
		super(rarityIn, typeIn, slots);
	}
	
	/**
	 * Called when a user with the enchanted item is attacked (regardless if the user is blocking)
	 * Allows the application of Spikes when the user is blocking.
	 * @param user
	 * @param attacker
	 * @param level
	 */
	public abstract void onUserAttacked(EntityLivingBase user, Entity attacker, int level);

}
