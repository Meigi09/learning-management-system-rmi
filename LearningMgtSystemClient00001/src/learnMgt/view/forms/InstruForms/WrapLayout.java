/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnMgt.view.forms.InstruForms;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WrapLayout implements LayoutManager {
    private int hgap;
    private int vgap;
    private List<Dimension> rowSizes;

    public WrapLayout() {
        this(5, 5);
    }

    public WrapLayout(int hgap, int vgap) {
        setHgap(hgap);
        setVgap(vgap);
        rowSizes = new ArrayList<>();
    }

    public void setHgap(int hgap) {
        this.hgap = hgap;
    }

    public int getHgap() {
        return hgap;
    }

    public void setVgap(int vgap) {
        this.vgap = vgap;
    }

    public int getVgap() {
        return vgap;
    }

    @Override
    public void addLayoutComponent(String name, Component comp) {
    }

    @Override
    public void removeLayoutComponent(Component comp) {
    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        synchronized (parent.getTreeLock()) {
            return layoutSize(parent, true);
        }
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        synchronized (parent.getTreeLock()) {
            return layoutSize(parent, false);
        }
    }

    @Override
    public void layoutContainer(Container parent) {
        synchronized (parent.getTreeLock()) {
            Insets insets = parent.getInsets();
            int maxWidth = parent.getWidth() - (insets.left + insets.right);
            int x = insets.left;
            int y = insets.top;
            int rowHeight = 0;

            for (int i = 0; i < parent.getComponentCount(); i++) {
                Component component = parent.getComponent(i);
                if (component.isVisible()) {
                    Dimension size = component.getPreferredSize();
                    if (x + size.width > maxWidth) {
                        x = insets.left;
                        y += rowHeight + vgap;
                        rowHeight = 0;
                    }
                    component.setBounds(x, y, size.width, size.height);
                    x += size.width + hgap;
                    rowHeight = Math.max(rowHeight, size.height);
                }
            }
        }
    }

    private Dimension layoutSize(Container parent, boolean preferred) {
        synchronized (parent.getTreeLock()) {
            Insets insets = parent.getInsets();
            int maxWidth = parent.getWidth() - (insets.left + insets.right);
            int x = insets.left;
            int y = insets.top;
            int rowHeight = 0;
            int totalWidth = 0;
            int totalHeight = insets.top + insets.bottom;

            rowSizes.clear();

            for (int i = 0; i < parent.getComponentCount(); i++) {
                Component component = parent.getComponent(i);
                if (component.isVisible()) {
                    Dimension size = preferred ? component.getPreferredSize() : component.getMinimumSize();
                    if (x + size.width > maxWidth) {
                        x = insets.left;
                        y += rowHeight + vgap;
                        rowSizes.add(new Dimension(totalWidth, y - vgap - insets.top));
                        totalHeight += rowHeight + vgap;
                        rowHeight = 0;
                    }
                    x += size.width + hgap;
                    rowHeight = Math.max(rowHeight, size.height);
                    totalWidth = Math.max(totalWidth, x - hgap - insets.left);
                }
            }

            rowSizes.add(new Dimension(totalWidth, y - vgap - insets.top));
            totalHeight += rowHeight + insets.bottom;

            int maxWidthRow = 0;
            for (Dimension rowSize : rowSizes) {
                maxWidthRow = Math.max(maxWidthRow, rowSize.width);
            }

            return new Dimension(maxWidthRow, totalHeight);
        }
    }
}
