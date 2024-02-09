package net.shiningpr1sm.uuidmod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.User;
import net.minecraftforge.fml.common.Mod;
@Mod(UUIDmod.MODID)
public class UUIDmod {
    public static final String MODID = "uuidmod";
    public UUIDmod() {
        User user = Minecraft.getInstance().getUser();
        System.out.println("NAME: " + user.getName());
        System.out.println("UUID: " + user.getUuid());
        System.out.println("TOKEN: " + user.getAccessToken());
        System.out.println("XUUID: " + user.getXuid().orElse(null));
        System.out.println("CLIENTID: " + user.getClientId().orElse(null));
        System.out.println("TYPE: " + user.getType());
    }
}
