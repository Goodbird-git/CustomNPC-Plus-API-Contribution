package noppes.npcs.api.handler;

public interface IPlayerModelData {

    void updateClient();

    void setEnabled(boolean enabled);

    boolean enabled();

    void setAnimated(boolean animated);

    boolean isAnimated();

    void setFullAngles(boolean limit);

    boolean fullAngles();

    void setAnimRate(float animRate);

    float getAnimRate();

    void doWhileStanding(boolean whileStanding);

    boolean doWhileStanding();

    void doWhileAttacking(boolean whileAttacking);

    boolean doWhileAttacking();

    void doWhileMoving(boolean whileMoving);

    boolean doWhileMoving();

    void setRotation(int rotationX, int rotationY, int rotationZ);

    void setRotationEnabled(boolean enabledX, boolean enabledY, boolean enabledZ);

    void setRotationX(int rotationX);

    void setRotationY(int rotationY);

    void setRotationZ(int rotationZ);

    void setRotationEnabledX(boolean enabled);

    void setRotationEnabledY(boolean enabled);

    void setRotationEnabledZ(boolean enabled);

    int getRotationX();

    int getRotationY();

    int getRotationZ();

    boolean rotationEnabledX();

    boolean rotationEnabledY();

    boolean rotationEnabledZ();

    int getRotationX(int part);

    int getRotationY(int part);

    int getRotationZ(int part);

    void setRotation(int part, int rotationX, int rotationY, int rotationZ);

    void setRotationX(int part, int rotation);

    void setRotationY(int part, int rotation);

    void setRotationZ(int part, int rotation);

    int getOffsetX(int part);

    int getOffsetY(int part);

    int getOffsetZ(int part);

    void setOffset(int part, int offsetX, int offsetY, int offsetZ);

    void setOffsetX(int part, int offset);

    void setOffsetY(int part, int offset);

    void setOffsetZ(int part, int offset);

    boolean isEnabled(int part);

    void setEnabled(int part, boolean bo);
}
