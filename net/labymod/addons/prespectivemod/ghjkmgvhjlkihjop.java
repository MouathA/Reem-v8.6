//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package net.labymod.addons.prespectivemod;

import java.math.*;

public class ghjkmgvhjlkihjop
{
    private double max;
    private double min;
    private double value;
    private String name;
    
    public double getValue() {
        return this.round(this.value, 2);
    }
    
    public void setValue(final double value) {
        this.value = value;
        if (value < this.getMin()) {
            this.value = this.getMin();
        }
    }
    
    public double getMin() {
        return this.min;
    }
    
    public String getName() {
        return this.name;
    }
    
    private double round(final double val, final int newScale) {
        return new BigDecimal(val).setScale(newScale, 4).doubleValue();
    }
    
    public void increase() {
        if (this.round(this.value, 2) < this.max) {
            ++this.value;
        }
    }
    
    public double getMax() {
        return this.max;
    }
    
    public void decrease() {
        if (this.round(this.value, 2) > this.min) {
            --this.value;
        }
    }
    
    public ghjkmgvhjlkihjop(final String name, final double value, final double min, final double max) {
        this.name = name;
        this.value = value;
        this.max = max;
        this.min = min;
    }
}
