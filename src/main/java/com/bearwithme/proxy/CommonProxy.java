package com.bearwithme.proxy;

import com.bearwithme.lib.*;

public class CommonProxy {

    public void preInit()
    {
        ContentHandler.initBlocks();
		ItemHandler.init();
		EntityHandler.init();
    }	

    public void init()
    {
    	ContentHandler.initRecipes();
    }

    public void postInit()
    {

    }

}
