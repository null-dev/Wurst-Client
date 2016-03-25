package tk.wurst_client.mods;

import tk.wurst_client.WurstClient;
import tk.wurst_client.api.Chat;
import tk.wurst_client.api.Module;
import tk.wurst_client.api.ModuleConfiguration;

/**
 * Project: EvenWurse
 * Created: 28/12/15
 * Author: nulldev
 */
@Mod.Info(name = "RecordingMode",
        description = "Hides Wurst-related GUI elements for recording purposes.",
        category = Mod.Category.RENDER)
public class RecordingModeMod extends Mod {
    public boolean hideInGameGUI() {
        return isActive();
    }

    public boolean hideOptionsButton() {
        return isActive();
    }

    public boolean clearChat() {
        return isActive();
    }

    public boolean disableWurstMessages() {
        return isActive();
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
