//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import net.minecraft.client.*;
import java.util.*;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.common.*;
import net.minecraft.network.play.server.*;

public abstract class fdghgfdjhgikhyoj
{
    private ArrayList<ghjkmgvhjlkihjop> values;
    private Category category;
    private boolean state;
    protected static Minecraft mc;
    private ArrayList<fghjnfcgfhyhin> booleans;
    private String name;
    private boolean Toggled;
    private int key;
    private boolean enabled;
    
    public void onDisable() {
    }
    
    public S18PacketEntityTeleport onEntityTeleport(final S18PacketEntityTeleport s18PacketEntityTeleport) {
        return s18PacketEntityTeleport;
    }
    
    public boolean getState() {
        return this.state;
    }
    
    public Category getCategory() {
        return this.category;
    }
    
    public void setup() {
    }
    
    public static ArrayList<fdghgfdjhgikhyoj> getCategoryModules(final Category category) {
        final ArrayList<fdghgfdjhgikhyoj> list = new ArrayList<fdghgfdjhgikhyoj>();
        for (final fdghgfdjhgikhyoj e : xsgdfhfgujgfhifghi.getModules()) {
            if (e.getCategory() == category) {
                list.add(e);
            }
        }
        return list;
    }
    
    public boolean setToggled(final boolean state) {
        return this.state = state;
    }
    
    public boolean onRelativeMove(final S14PacketEntity s14PacketEntity) {
        return false;
    }
    
    public fdghgfdjhgikhyoj(final String name, final int key, final Category category) {
        fdghgfdjhgikhyoj.mc = Minecraft.getMinecraft();
        this.booleans = new ArrayList<fghjnfcgfhyhin>();
        this.values = new ArrayList<ghjkmgvhjlkihjop>();
        this.name = name;
        this.key = key;
        this.state = false;
        this.category = category;
    }
    
    public void setKey(final int key) {
        this.key = key;
    }
    
    public int getKey() {
        return this.key;
    }
    
    public void update() {
    }
    
    public String getName() {
        return this.name;
    }
    
    public ArrayList<ghjkmgvhjlkihjop> getValues() {
        return this.values;
    }
    
    public void setState(final boolean state) {
        if (this.state == state) {
            return;
        }
        this.state = state;
        if (state) {
            MinecraftForge.EVENT_BUS.register((Object)this);
            FMLCommonHandler.instance().bus().register((Object)this);
            this.onEnable();
        }
        else {
            MinecraftForge.EVENT_BUS.unregister((Object)this);
            FMLCommonHandler.instance().bus().unregister((Object)this);
            this.onDisable();
        }
    }
    
    public void toggle() {
        this.setState(!this.state);
    }
    
    public void onDestroyEntities(final S13PacketDestroyEntities s13PacketDestroyEntities) {
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void onEnable() {
    }
    
    public boolean isToggle() {
        return this.Toggled;
    }
    
    public ArrayList<fghjnfcgfhyhin> getBooleans() {
        return this.booleans;
    }
    
    public static fdghgfdjhgikhyoj getModule(final Class<? extends fdghgfdjhgikhyoj> clazz) {
        for (final fdghgfdjhgikhyoj fdghgfdjhgikhyoj : xsgdfhfgujgfhifghi.getModules()) {
            if (fdghgfdjhgikhyoj.getClass() == clazz) {
                return fdghgfdjhgikhyoj;
            }
        }
        return null;
    }
    
    public void addValue(final ghjkmgvhjlkihjop e) {
        this.values.add(e);
    }
    
    public boolean isEnabled() {
        return this.enabled;
    }
    
    public void addBoolean(final fghjnfcgfhyhin e) {
        this.booleans.add(e);
    }
    
    public enum Category
    {
        private static final Category[] $VALUES;
        
        Other, 
        Blatant, 
        Combat;
        
        static {
            $VALUES = new Category[] { Category.Combat, Category.Blatant, Category.Other };
        }
    }
    
    public enum Modules
    {
        Hud;
        
        private static final Modules[] $VALUES;
        
        ClickGUI;
        
        static {
            $VALUES = new Modules[] { Modules.ClickGUI, Modules.Hud };
        }
    }
}
