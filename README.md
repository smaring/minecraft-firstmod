First thing to do is to install a jar into your local Maven repository on your machine (${user.home}/.m2) with:
> mvn -f minecraft-forge-jar.xml install

You only need to do this once, unless you want to change the versions of minecraft or minecraftforge or you
blew away your local Maven repo.

The minecraft-forge-jar.xml is a slight modification of the pom.xml from https://github.com/agaricusb/ForgeAPI
to build newer versions.  Kudos to the author for getting the ball rolling.

After that you build your mod in the standard Maven way:
> mvn clean package

That will build the jar and drop it in the target directory.

Copy that jar into the .minecraft/mods dir, start Minecraft with the Forge profile, and you should see your mod. 