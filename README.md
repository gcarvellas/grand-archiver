# Grand Archiver
## About
This bot is called the Grand Archiver. This bot has a number of commands, but first, here is how to setup the bot:

Each folder is a class in Java. I used eclipse to make this program

## Instructions
> You must download Discord JDA: https://github.com/DV8FromTheWorld/JDA

> In the Main class, you must do the following:
  1. in line 20, set your bot string given in the Discord developer page for your bot. If you do not put this string, your bot will not work.
  2. if you want @@download to work, in line 15 in Main, be sure to set a directory

> In the DepositFromFolder class:
  - in line 23, if you want @@depositFromFolder to work, be sure to set a directory

> *Warning: I would not recommend putting this bot on a public server, since anyone can use any of these commands. None of these commands are restricted by perms.

## Notes:

- For every command on discord, the prefix is "@@". To change this, go to the Main class, and line 14 is where you can change this prefix.

- In this program, you cannot immediately just interact with a text chat right away. You have to set that text chat with @@setChannel, and then refresh that channel with @@refresh

- There is a couple of commands called painRoulette. How painRoulette works, is that there must be a link that must be set first byusing @@painRoulette set URL. Once that is set, once you do @@painRoulette counter, the bot goes to the private message of a user, and sends the link that was set by @@painRoulette set for counter amount of times.

## List of Commands:
### Console Commands:
- @@download - given that @@refresh and @@setChannel have both been operated, and given that there is a file directory set, the command will take all of the images in a text channel and download them to a file directory.
  
### User Commands:
  
#### Essential Commands:
  
- @@setChannel channelName - assuming the user inputs a channelName that exists in the server, sets the channel at the moment the user enters the command, which allows the user to do other commands.
  
- @@refresh - assuming the user used @@setChannel on a channel that exists already, collects all of the images in the channel, and sets them to a variable so the images can be interacted with
  
- @@getChannel - returns the current channel that was set by @@setChannel
  
- @@help - returns a list of commands to the user
  
#### Commands that only work once @@setChannel and @@refresh have been used successfully:
 
- @@depositFromFolder - given that @@refresh and @@setChannel have both been operated, and given that there is a file directory set, the command will take all of the images from the directory, and upload them to the channel where the command was performed
  
- @@random - returns a random image from the refresh queue
  
- @@saidLatestMessage - assuming @@random has been performed, returns the author of the latest randomed message
  
#### Fun/Chaotic Commands:
 
- @@firingSquad counter - assuming counter is a natural number, pings every member in the server individually for counter amount of times.
  
- @@painRoulette set URL - assuming URL is a string that is a link, sets the "painRoulette queue" to that link
  
- @@painRoulette counter - assuming counter is a natural number, takes the queue of @@PainRoulette set URL, and sends that link to a random user on the server's private message for counter amount of times
  
- @@painRoulette get - returns the current "painRoulette queue"
  
  


  
