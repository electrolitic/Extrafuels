package electrolitic.extrafuels.util;

import electrolitic.extrafuels.handlers.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Colin on 7/17/2016.
 */
public class BlockRegister extends Block {

    public BlockRegister(String name, Material material)
    {
        super(material);
        setRegistryName(new ResourceLocation("extrafuels", name));
        setUnlocalizedName(name);
    }

    public ItemBlock createItemBlock(){
        //index 0-4 are "block", so I only want the stuff after it, hence substring.
        return (ItemBlock)(new ItemBlock(this).setRegistryName(new ResourceLocation(Reference.MODID, "item" + this.getRegistryName().getResourcePath().substring(5))));
    }
}
