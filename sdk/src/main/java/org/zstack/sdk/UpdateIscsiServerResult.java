package org.zstack.sdk;

import org.zstack.sdk.IscsiServerInventory;

public class UpdateIscsiServerResult {
    public IscsiServerInventory inventory;
    public void setInventory(IscsiServerInventory inventory) {
        this.inventory = inventory;
    }
    public IscsiServerInventory getInventory() {
        return this.inventory;
    }

}
