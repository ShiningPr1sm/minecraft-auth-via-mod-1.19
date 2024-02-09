## minecraft-auth-via-mod-1.19

#### minecraft-auth-via-mod-1.19 is a mod that allows you to easily and in a few movements to get the necessary data to log in to your license account without using Microsoft Azur etc.

#### Based on: ForgeGradle.

## Base mod & minecraft versions: 1.19.

### Everything you need to get started:

- Intellij IDEA;
- [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)(primary) or higer;
- Official [Minecraft Launcher](https://www.minecraft.net/en-us/download);

### How to use:

1. Download code or use 
```
git clone https://github.com/ShiningPr1sm/minecraft-auth-via-mod-1.19.git 
```

2. Import the build.gradle in your Intellij; (It will automatically create all the necessary files.)
  
3. To build the client run build then the releace jar will be in the "build/libs/";
![2024-02-09_21-53](https://github.com/ShiningPr1sm/minecraft-auth-via-mod-1.19/assets/61665029/24b550b9-9170-4645-9682-d6b8a7c50df1)

4. Download [Forge version](https://files.minecraftforge.net/net/minecraftforge/forge/index_1.19.html) from the official site to be able to run the mod on your computer;
![image](https://github.com/ShiningPr1sm/minecraft-auth-via-mod-1.19/assets/61665029/5d6db653-a35c-4c8a-95da-55982c1ea751)

5. After installation, if you do not have a folder "mods" in "%appdata%/.minecraft/", create it yourself and put there the .jar file that you have in the repository "build/libs/";

6. Go to the Launcher, log in if you have not done it and download the Forge version. Don't forget to enable the option "Open output log" in the launcher settings;
7. 
![image](https://github.com/ShiningPr1sm/minecraft-auth-via-mod-1.19/assets/61665029/165ff9c8-b6ab-42dd-bcd9-97816078389e)
![image](https://github.com/ShiningPr1sm/minecraft-auth-via-mod-1.19/assets/61665029/1a86eb6c-74e4-4aef-a0ab-00800fbbd02e)

8. After you start up your game, in the log you need find a line with the phrase "Launching target 'forgeclient' with arguments...";

9. Next, copy the line starting with "--uuid" and ending with "msa" and save that line somewhere in a .txt file;

10. You need to remove all commas and also in the search write "TOKEN:" (in the same logs) and copy the token you got;
It will look like this: 
```
--uuid {YOUR_OWN_UUID} --username {YOUR_OWN_MINECRAFT_NICKNAME} --assetIndex 1.19 --accessToken {IN_THESE_QUOTES_PUT_THE_TOKEN_YOU_FOUND} --clientId {YOUR_OWN_CLIENT_ID} --xuid {YOUR_OWN_XUID} --userType msa
```

11. Where i need to paste it?
If you have your own client, you need to select "Run" method > "Edit Configurations...";
![image](https://github.com/ShiningPr1sm/minecraft-auth-via-mod-1.19/assets/61665029/65877a98-6ab9-4b1a-b1c1-35b73c897936)

### Creators:

* ShiningPr1sm

#### Special thx to: [MaximPixel](https://forum.mcmodding.ru/resources/kak-vojti-v-igru-cherez-microsoft-akkaunt.303/), who shared the code and a small instruction for this mod.

