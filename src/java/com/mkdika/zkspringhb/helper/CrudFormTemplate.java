
package com.mkdika.zkspringhb.helper;

import org.zkoss.bind.annotation.Init;

/**
 *
 * @author maikel
 */
public abstract class CrudFormTemplate {
    
    public abstract void addAction();
    public abstract void editAction();
    public abstract void deleteAction();
    public abstract void saveAction();
    public abstract void cancelAction();
    public abstract void infoAction();
        
}
