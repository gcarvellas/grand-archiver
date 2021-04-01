package discord.GrandArchiver;

import java.util.Scanner;

import javax.security.auth.login.LoginException;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;

public class Main {
	public static JDA jda;
	public static String prefix = "@@";
	public static String directory = PUT DIRECTORY HERE;
	private static String token = PUT TOKEN HERE;
	public static TextChannel archive;
	private static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) throws LoginException {
		JDABuilder jdaBuilder = JDABuilder.createDefault(token)
		          .setChunkingFilter(ChunkingFilter.ALL) // enable member chunking for all guilds
		          .setMemberCachePolicy(MemberCachePolicy.ALL) // ignored if chunking enabled
		          .enableIntents(GatewayIntent.GUILD_MEMBERS);
		try {
			jda = jdaBuilder.build();
		} catch (LoginException e) {
			e.printStackTrace();
		}
		jda.getPresence().setActivity(Activity.playing("Ping @Dragon to turn on the bot. Type @@help for info."));
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
