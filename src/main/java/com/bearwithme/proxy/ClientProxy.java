package com.bearwithme.proxy;

import com.bearwithme.entity.*;
import com.bearwithme.proxy.CommonProxy;
import com.bearwithme.lib.*;

import net.minecraft.client.model.ModelPolarBear;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit () {

        super.preInit();
        ItemHandler.initOnClient();
        
        RenderingRegistry.registerEntityRenderingHandler(EntityGrizzlyBear.class, manager -> new RenderGrizzlyBear(manager, new ModelPolarBear(), 0.7F));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlackBear.class, manager -> new RenderBlackBear(manager, new ModelPolarBear(), 0.7F));
        RenderingRegistry.registerEntityRenderingHandler(EntityPandaBear.class, manager -> new RenderPandaBear(manager, new ModelPolarBear(), 0.7F));
    }
}
