/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s3f.base.ui.tab;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.Icon;
import javax.swing.JTabbedPane;
import s3f.base.plugin.Plugabble;
import s3f.base.ui.tab.tabbedpaneview.dndtabbedpane.TabComponent;

/**
 *
 * @author Anderson
 */
public interface Tab extends Plugabble {
  

    /*
    public class ViewData{
        private String title;
        private Icon icon;
        private String toolTip;
        private Component component;
        private TabComponent tab;

        public ViewData(String title, Icon icon, String toolTip, Component component) {
            this.title = title;
            this.icon = icon;
            this.toolTip = toolTip;
            this.component = component;
        }
        
        public final void updateTab(){
            tab.update(this);
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Icon getIcon() {
            return icon;
        }

        public void setIcon(Icon icon) {
            this.icon = icon;
        }

        public String getToolTip() {
            return toolTip;
        }

        public void setToolTip(String toolTip) {
            this.toolTip = toolTip;
        }

        public Component getComponent() {
            return component;
        }

        public void setComponent(Component component) {
            this.component = component;
        }

        public void setTabbedPane(TabComponent tab) {
            this.tab = tab;
        }
    }
    */
    
    public void update();
    
    public void selected();

}
