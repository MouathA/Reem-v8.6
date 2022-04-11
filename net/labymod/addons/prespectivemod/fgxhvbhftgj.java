//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import net.minecraft.client.gui.*;

public class fgxhvbhftgj extends fdghgfdjhgikhyoj
{
    private int x;
    public fghjfghjfghjfghj clickgui;
    private int y;
    
    public void onEnable() {
        if (this.clickgui == null) {
            this.clickgui = new fghjfghjfghjfghj();
        }
        fgxhvbhftgj.mc.displayGuiScreen((GuiScreen)this.clickgui);
        this.toggle();
    }
    
    public fgxhvbhftgj() {
        super(fdghgfdjhgikhyoj.Modules.ClickGUI.name(), 41, fdghgfdjhgikhyoj.Category.Combat);
    }
}
