//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

public class fghjnfcgfhyhin
{
    private boolean isToggled;
    private boolean value;
    private String name;
    
    public void setState(final boolean value) {
        if (value == this.value) {
            return;
        }
        this.value = value;
    }
    
    public boolean getState() {
        return this.value;
    }
    
    public boolean isToggled() {
        return this.isToggled;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void toggle() {
        this.value = !this.value;
    }
    
    public fghjnfcgfhyhin(final String name, final boolean value) {
        this.isToggled = true;
        this.name = name;
        this.value = value;
    }
}
