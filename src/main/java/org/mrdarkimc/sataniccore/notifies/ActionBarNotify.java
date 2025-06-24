package org.mrdarkimc.sataniccore.notifies;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;
import org.mrdarkimc.sataniccore.notifies.interfaces.NotifyRealization;

public class ActionBarNotify implements NotifyRealization {
    private static String text = "realization";
    private static TextComponent component = new TextComponent();

    static {
        component.setText(text);
    }

    @Override
    public void send(Player player) {
        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, component);
    }
}
