package xyz.sin.cmds;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import xyz.sin.SinMain;

public class SinCommands extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if(args[0].equalsIgnoreCase(SinMain.prefix + "info")) {
            event.getChannel().sendMessage("Bot made by saf#1185").queue();
        }
    }
}
