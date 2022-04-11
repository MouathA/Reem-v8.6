//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import java.util.*;
import java.awt.*;
import net.minecraft.client.gui.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.*;

public class xcvbxcvhfgnj
{
    private int barHeight;
    private int y;
    private int x;
    private boolean isDragging;
    private int width;
    public int dragY;
    public ArrayList<dfhgsfdghdfgh> components;
    public int dragX;
    public boolean open;
    public fdghgfdjhgikhyoj.Category category;
    
    public int getY() {
        return this.y;
    }
    
    public void updatePosition(final int n, final int n2) {
        if (this.isDragging) {
            this.setX(n - this.dragX);
            this.setY(n2 - this.dragY);
        }
    }
    
    public boolean isWithinHeader(final int n, final int n2) {
        return n >= this.x && n <= this.x + this.width && n2 >= this.y && n2 <= this.y + this.barHeight;
    }
    
    public int getX() {
        return this.x;
    }
    
    public boolean isOpen() {
        return this.open;
    }
    
    public void refresh() {
        int barHeight = this.barHeight;
        for (final dfhgsfdghdfgh dfhgsfdghdfgh : this.components) {
            dfhgsfdghdfgh.setOff(barHeight);
            barHeight += dfhgsfdghdfgh.getHeight();
        }
    }
    
    public xcvbxcvhfgnj(final fdghgfdjhgikhyoj.Category category) {
        this.components = new ArrayList<dfhgsfdghdfgh>();
        this.category = category;
        this.width = 88;
        this.x = 5;
        this.y = 1;
        this.barHeight = 13;
        this.dragX = 0;
        this.open = false;
        this.isDragging = false;
        int barHeight = this.barHeight;
        for (final fdghgfdjhgikhyoj fdghgfdjhgikhyoj : fdghgfdjhgikhyoj.getCategoryModules(this.category)) {
            if (!fdghgfdjhgikhyoj.getName().equalsIgnoreCase("ClickGUI")) {
                this.components.add((dfhgsfdghdfgh)new fghjfghjkhjgkkujhkip(fdghgfdjhgikhyoj, this, barHeight));
                barHeight += 12;
            }
        }
    }
    
    public ArrayList<dfhgsfdghdfgh> getComponents() {
        return this.components;
    }
    
    public void setOpen(final boolean open) {
        this.open = open;
    }
    
    public void renderFrame(final FontRenderer fontRenderer) {
        this.width = 80;
        Gui.drawRect(this.x - 1, this.y - 3, this.x + this.width + 1, this.y + this.barHeight - 2, Color.HSBtoRGB((System.currentTimeMillis() + 1500L) % 5000L / 4750.0f, 0.8f, 0.8f));
        GL11.glPushMatrix();
        Minecraft.getMinecraft().fontRendererObj.drawString(this.category.name(), this.x + 2, this.y, -1);
        if (this.open) {
            fontRenderer.drawString("-", this.x + 70, (int)(this.y + 1.5), -1);
        }
        else {
            fontRenderer.drawString("+", this.x + 70, this.y + 1, -1);
        }
        GL11.glPushMatrix();
        GL11.glPopMatrix();
        GL11.glPopMatrix();
        if (this.open && !this.components.isEmpty()) {
            final Iterator<dfhgsfdghdfgh> iterator = this.components.iterator();
            while (iterator.hasNext()) {
                iterator.next().render();
            }
        }
    }
    
    public void setDrag(final boolean isDragging) {
        this.isDragging = isDragging;
    }
    
    public void setY(final int y) {
        this.y = y;
    }
    
    public void setX(final int x) {
        this.x = x;
    }
    
    public int getWidth() {
        return this.width;
    }
}
