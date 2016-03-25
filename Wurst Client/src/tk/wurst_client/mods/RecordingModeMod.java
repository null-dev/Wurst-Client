package tk.wurst_client.mods;

import tk.wurst_client.WurstClient;
import tk.wurst_client.api.Chat;

/**
 * Project: EvenWurse
 * Created: 28/12/15
 * Author: nulldev
 */
@Mod.Info(name = "RecordingMode",
        description = "Hides Wurst-related GUI elements for recording purposes.",
        category = Mod.Category.RENDER)
public class RecordingModeMod extends Mod {
    public static boolean hideInGameGUI() {
        return WurstClient.INSTANCE.mods.recordingModeMod.isActive();
    }

    public static boolean hideOptionsButton() {
        return WurstClient.INSTANCE.mods.recordingModeMod.isActive();
    }

    public static boolean clearChat() {
        return WurstClient.INSTANCE.mods.recordingModeMod.isActive();
    }

    public static boolean disableWurstMessages() {
        return WurstClient.INSTANCE.mods.recordingModeMod.isActive();
    }

    @Override
    public void onEnable() {
        super.onEnable();
        if(clearChat()) {
            Chat.clearChat();
        }
    }

    @Override
    public void onToggle() {
        super.onToggle();
        WurstClient.INSTANCE.chat.setEnabled(!disableWurstMessages());
    }
}
