package discord.GrandArchiver;

import java.util.Scanner;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.TextChannel;

public class Main {
	public static JDA jda;
	public static String prefix = "@@";
	public static String directory = "ENTER YOUR DIRECTORY HERE";
	public static TextChannel archive;
	private static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) throws LoginException {
		jda = new JDABuilder("ENTER BOT CODE HERE").build();
		jda.getPresence().setActivity(Activity.playing("Type @@help for info."));
		jda.addEventListener(new Commands());
		selectCommand(reader.nextLine());
	}

	// Console Commands

	private static void selectCommand(String input) {
		if (input.equals(prefix + "download")) {
			DownloadRefreshed download = new DownloadRefreshed(Commands.getRefreshedHistory());
			download.command();
		}
	}

	// Helper Method
	public static TextChannel getChannelByName(String channelName) {
		return jda.getTextChannelsByName(channelName, true).get(0);
	}
}
