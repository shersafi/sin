package xyz.sin;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import xyz.sin.cmds.SinCommands;

import javax.security.auth.login.LoginException;

public class SinMain {
    public static String prefix = ",";

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        try {
            JDABuilder.create("ODA1NDk2ODk3NzQ1MTkwOTMy.YBbvcQ.rUWvCWew26TuF3NwY_9YbNEsMVY", GatewayIntent.GUILD_EMOJIS, GatewayIntent.GUILD_INVITES, GatewayIntent.GUILD_MEMBERS, GatewayIntent.GUILD_MESSAGES, GatewayIntent.GUILD_PRESENCES, GatewayIntent.GUILD_MESSAGE_REACTIONS)
                    .addEventListeners(new SinCommands())
                    .setStatus(OnlineStatus.IDLE)
                    .setActivity(Activity.playing("α"))
                    .build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}
