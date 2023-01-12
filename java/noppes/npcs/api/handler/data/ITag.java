//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package noppes.npcs.api.handler.data;

import noppes.npcs.api.entity.ICustomNpc;
import noppes.npcs.api.entity.IPlayer;

import java.util.UUID;

public interface ITag {
    String getUuid();

    String getName();

    void setName(String name);

    void setColor(int c);

    int getId();

    int getColor();

    boolean getIsHidden();

    void setIsHidden(boolean hidden);

    void save();
}